package com.profisprint.learnReact.model;

import lombok.ToString;

@ToString
public class ProfileModel {

    private String aboutMe;
    private ProfileContacts contacts;
    private boolean lookingForAJob;
    private String lookingForAJobDescription;
    private String fullName;
    private Long userId;
    private Photo photos;

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public ProfileContacts getContacts() {
        return contacts;
    }

    public void setContacts(ProfileContacts contacts) {
        this.contacts = contacts;
    }

    public boolean isLookingForAJob() {
        return lookingForAJob;
    }

    public void setLookingForAJob(boolean lookingForAJob) {
        this.lookingForAJob = lookingForAJob;
    }

    public String getLookingForAJobDescription() {
        return lookingForAJobDescription;
    }

    public void setLookingForAJobDescription(String lookingForAJobDescription) {
        this.lookingForAJobDescription = lookingForAJobDescription;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Photo getPhotos() {
        return photos;
    }

    public void setPhotos(Photo photos) {
        this.photos = photos;
    }
}
