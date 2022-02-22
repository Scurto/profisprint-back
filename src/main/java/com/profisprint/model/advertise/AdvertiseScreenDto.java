package com.profisprint.model.advertise;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class AdvertiseScreenDto {

    public AdvertiseScreenDto() {
    }

    private List<SecondaryAdvertiseModel> advertiseMoveList;
    private String main;
    private String title;
    private String description;
    private String id;

}
