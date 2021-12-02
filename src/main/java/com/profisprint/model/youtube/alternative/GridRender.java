package com.profisprint.model.youtube.alternative;

import lombok.Data;

import java.util.ArrayList;

@Data
public class GridRender {

    private ArrayList<Object> items;
    private String trackingParams;
    private String targetId;
}
