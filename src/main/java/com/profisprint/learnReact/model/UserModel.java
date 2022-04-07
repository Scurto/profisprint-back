package com.profisprint.learnReact.model;

import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

@ToString
@Document
public class UserModel {

    private String name;
    private Long id;
    private String uniqueUrlName;
    private String email;
    private Photo photos;
    private String status;
    private boolean followed;
    private ProfileModel profile;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUniqueUrlName() {
        return uniqueUrlName;
    }

    public void setUniqueUrlName(String uniqueUrlName) {
        this.uniqueUrlName = uniqueUrlName;
    }

    public Photo getPhotos() {
        return photos;
    }

    public void setPhotos(Photo photos) {
        this.photos = photos;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isFollowed() {
        return followed;
    }

    public void setFollowed(boolean followed) {
        this.followed = followed;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ProfileModel getProfile() {
        return profile;
    }

    public void setProfile(ProfileModel profile) {
        this.profile = profile;
    }
}


