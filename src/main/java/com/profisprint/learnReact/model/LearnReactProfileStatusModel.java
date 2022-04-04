package com.profisprint.learnReact.model;

public class LearnReactProfileStatusModel {

    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "LearnReactProfileStatusModel{" +
                "status='" + status + '\'' +
                '}';
    }
}
