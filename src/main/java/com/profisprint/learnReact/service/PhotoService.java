package com.profisprint.learnReact.service;

import com.profisprint.learnReact.model.Photos;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface PhotoService {

    String addPhoto(String title, MultipartFile file) throws IOException;

    Photos getPhoto(String id);
}
