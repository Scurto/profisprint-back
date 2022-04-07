package com.profisprint.learnReact.model;

import lombok.ToString;

@ToString
public class LearnReactProfileStatusModel {

    private String status;
    private String userId;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
