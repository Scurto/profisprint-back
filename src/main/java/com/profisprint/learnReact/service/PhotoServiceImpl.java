package com.profisprint.learnReact.service;

import com.profisprint.learnReact.model.Photos;
import com.profisprint.learnReact.repository.PhotoRepository;
import org.bson.BsonBinarySubType;
import org.bson.types.Binary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class PhotoServiceImpl implements PhotoService{

    @Autowired
    private PhotoRepository photoRepo;

    public String addPhoto(String title, MultipartFile file) throws IOException {
        Photos photo = new Photos();
        photo.setTitle(title);
        photo.setImage(
                new Binary(BsonBinarySubType.BINARY, file.getBytes()));
        photo = photoRepo.insert(photo);
        return photo.getId();
    }

    public Photos getPhoto(String id) {
        return photoRepo.findById(id).get();
    }
}
