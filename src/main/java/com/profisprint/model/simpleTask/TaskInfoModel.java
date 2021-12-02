package com.profisprint.model.simpleTask;

import com.profisprint.model.advertise.AdvertiseDto;
import lombok.Data;

import java.util.List;

@Data
public class TaskInfoModel {

    private List<String> videos;
    private List<AdvertiseDto> advertise;
}
