package com.profisprint.learnReact;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.profisprint.learnReact.model.*;
import com.profisprint.learnReact.repository.UserModelRepository;
import org.bson.BsonBinarySubType;
import org.bson.types.Binary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@RestController
@RequestMapping(value = "api/1.0")
public class LearnController {

    private boolean logged = false;

    @Autowired
    UserModelRepository modelRepository;

    @GetMapping(value = "/users")
    private UserItemsModel getUsers(@RequestParam Integer page, @RequestParam Integer count) throws JsonProcessingException {
        List<UserModel> all = modelRepository.findAll();
        if(count <= 0 || page <= 0) {
            throw new IllegalArgumentException("invalid page size: " + count);
        }
        int fromIndex = (page - 1) * count;
        List<UserModel> result = all.subList(fromIndex, Math.min(fromIndex + count, all.size()));

        return new UserItemsModel(result, all.size(), null);
    }

    @RequestMapping(value = "/follow/{userId}", method = RequestMethod.DELETE)
    public LearnReactDto<LearnReactFollowModel> follow(final @PathVariable String userId) {
        LearnReactDto<LearnReactFollowModel> dto = new LearnReactDto<LearnReactFollowModel>();
        dto.setData(new LearnReactFollowModel());
        return dto;
    }

    @RequestMapping(value = "/follow/{userId}", method = RequestMethod.POST)
    public LearnReactDto<LearnReactFollowModel> unFollow(final @PathVariable String userId) {
        LearnReactDto<LearnReactFollowModel> dto = new LearnReactDto<LearnReactFollowModel>();
        dto.setData(new LearnReactFollowModel());
        return dto;
    }

    @RequestMapping(value = "/auth/me", method = RequestMethod.GET)
    public String authMe() {
        if (isLogged()) {
            return "{\"data\":{\"id\":13976,\"login\":\"test12345678\",\"email\":\"yokef52217@sofiarae.com\"},\"messages\":[],\"fieldsErrors\":[],\"resultCode\":0}";
        } else {
            return "{\"data\":{},\"messages\":[],\"fieldsErrors\":[],\"resultCode\":1}";
        }
    }

    @RequestMapping(value = "/auth/login", method = RequestMethod.POST)
    public String login(@RequestBody LearnReactLoginModel loginModel) {
        if ("test".equalsIgnoreCase(loginModel.getEmail())) {
            setLogged(false);
            return "{\"resultCode\": 1, \"messages\": [], \"data\": { \"userId\": 13976 }}";
        }
        setLogged(true);
        return "{\"resultCode\": 0, \"messages\": [], \"data\": { \"userId\": 13976 }}";
    }

    @RequestMapping(value = "/auth/login", method = RequestMethod.DELETE)
    public String logout() {
        setLogged(false);
        return "{\"data\":{},\"messages\":[],\"fieldsErrors\":[],\"resultCode\":0}";
    }

    @RequestMapping(value = "/profile/{userId}", method = RequestMethod.GET)
    public ProfileModel getProfile(final @PathVariable String userId) throws Exception {
        System.out.println("getProfile = " + userId);
        Optional<UserModel> userModel = modelRepository.findById(Long.valueOf(userId));
        UserModel model = userModel.orElseThrow(() -> new Exception("User not found"));
        if (model.getProfile() == null) {
            ProfileModel profileModel = new ProfileModel();
            profileModel.setUserId(model.getId());
            profileModel.setFullName(model.getName());
            Photo photo = new Photo();
            photo.setSmall("https://i.stack.imgur.com/nbSKY.png");
            photo.setLarge("https://i.stack.imgur.com/nbSKY.png");
            profileModel.setPhotos(photo);
            model.setProfile(profileModel);
            modelRepository.save(model);
        }
        return model.getProfile();
    }

    @RequestMapping(value = "/profile/status/{userId}", method = RequestMethod.GET)
    public String getProfileStatus(final @PathVariable String userId) throws Exception {
        System.out.println("getProfileStatus = " + userId);
        Optional<UserModel> userModel = modelRepository.findById(Long.valueOf(userId));
        UserModel model = userModel.orElseThrow(() -> new Exception("User not found"));

        if (model.getStatus() != null) {
            return model.getStatus();
        }
        return getStatus();
    }

    @RequestMapping(value = "/profile/status", method = RequestMethod.PUT)
    public String setProfileStatus(@RequestBody LearnReactProfileStatusModel statusModel) throws Exception {
        Optional<UserModel> userModel = modelRepository.findById(Long.valueOf(statusModel.getUserId()));
        UserModel model = userModel.orElseThrow(() -> new Exception("User not found"));
        if (statusModel.getStatus() != null && statusModel.getStatus().equalsIgnoreCase(model.getStatus())) {
            return "{\"data\":{},\"status\":\""+statusModel.getStatus()+"\",\"messages\":[],\"fieldsErrors\":[],\"resultCode\":0}";
        }
        model.setStatus(statusModel.getStatus());
        modelRepository.save(model);

        return "{\"data\":{},\"status\":\""+statusModel.getStatus()+"\",\"messages\":[],\"fieldsErrors\":[],\"resultCode\":0}";
    }

    @RequestMapping(value = "/profile/photo", method = RequestMethod.PUT)
    public RestResult<UserModel> savePhoto(@RequestParam("file") MultipartFile file) throws Exception {

        Optional<UserModel> userModel = modelRepository.findById(13976L);
        UserModel model = userModel.orElseThrow(() -> new Exception("User not found"));
        Photo photo = new Photo();
        String baseUrl = "http://localhost:8830/api/1.0/profile/photo/";

        int v = new Random().nextInt(100 - 1);
        photo.setLarge(baseUrl + model.getId() + "?v=" + v);
        photo.setSmall(baseUrl + model.getId() + "?v=" + v);
        photo.setTitle(file.getName());
        photo.setImage(new Binary(BsonBinarySubType.BINARY, file.getBytes()));
        model.setPhotos(photo);

        UserModel result = modelRepository.save(model);
        RestResult<UserModel> restResult = new RestResult<>();
        restResult.setData(result);
        return restResult;
    }

    @GetMapping(value = "/profile/photo/{userId}", produces = MediaType.IMAGE_JPEG_VALUE)
    Resource getPhoto(@PathVariable Long userId) throws Exception {
        Optional<UserModel> userModel = modelRepository.findById(13976L);
        UserModel model = userModel.orElseThrow(() -> new Exception("User not found"));
        byte[] image = model.getPhotos().getImage().getData();

        return new ByteArrayResource(image);
    }

    public String getStatus() {
        return "defaultStatus";
    }

    public boolean isLogged() {
        return logged;
    }

    public void setLogged(boolean logged) {
        this.logged = logged;
    }
}
