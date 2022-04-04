package com.profisprint.learnReact.model;

import java.util.List;

public class UserItemsModel {

    private List<UserModel> items;
    private Integer totalCount;
    private String error;

    public UserItemsModel() {
    }

    public UserItemsModel(List<UserModel> items, Integer totalCount, String error) {
        this.items = items;
        this.totalCount = totalCount;
        this.error = error;
    }

    public List<UserModel> getItems() {
        return items;
    }

    public void setItems(List<UserModel> items) {
        this.items = items;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
