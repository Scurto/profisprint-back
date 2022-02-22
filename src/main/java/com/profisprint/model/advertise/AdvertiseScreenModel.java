package com.profisprint.model.advertise;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class AdvertiseScreenModel {

    private String mainUrl;
    private String title;
    private String description;
    private String id;
    private String location;
    private String source;
    private List<SecondaryAdvertiseModel> secondaryAdvertiseModel;
}
