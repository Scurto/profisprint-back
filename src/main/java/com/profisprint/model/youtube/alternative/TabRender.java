package com.profisprint.model.youtube.alternative;

import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;

@Data
public class TabRender {

    private Object endpoint;
    private String title;
    private boolean selected;
    private HashMap<String, HashMap<String, Object>> content;
    private String trackingParams;
}
