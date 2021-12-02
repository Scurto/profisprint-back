package com.profisprint.model.advertise;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class AdvertiseDto {

    public AdvertiseDto() {
    }

    private List<String> advertiseMoveList;
    private String main;
    private String id;

}
