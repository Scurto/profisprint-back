package com.learnReact;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/1.0")
public class LearnController {

    private String status = "defaultStatus";
    private boolean logged = false;

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
    public String getProfile(final @PathVariable String userId) {
        System.out.println("getProfile = " + userId);
        return "{\"aboutMe\":null,\"contacts\":{\"facebook\":null,\"website\":null,\"vk\":null,\"twitter\":null,\"instagram\":null,\"youtube\":null,\"github\":null,\"mainLink\":null},\"lookingForAJob\":false,\"lookingForAJobDescription\":null,\"fullName\":\"test12345678\",\"userId\":13976,\"photos\":{\"small\":null,\"large\":null}}";
    }

    @RequestMapping(value = "/profile/status/{userId}", method = RequestMethod.GET)
    public String getProfileStatus(final @PathVariable String userId) {
        System.out.println("getProfileStatus = " + userId);
        return getStatus();
    }

    @RequestMapping(value = "/profile/status", method = RequestMethod.PUT)
    public String setProfileStatus(@RequestBody LearnReactProfileStatusModel statusModel) {
        setStatus(statusModel.getStatus());
        return "{\"data\":{},\"messages\":[],\"fieldsErrors\":[],\"resultCode\":0}";
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isLogged() {
        return logged;
    }

    public void setLogged(boolean logged) {
        this.logged = logged;
    }
}
