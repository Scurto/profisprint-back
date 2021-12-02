package com.profisprint.model.advertise;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class AdvertiseModel {

    private String mainUrl;
    private String id;
    private String location;
    private String source;
    private List<SecondaryAdvertiseModel> secondaryAdvertiseModel;
}
