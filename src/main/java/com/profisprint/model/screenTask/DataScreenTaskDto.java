package com.profisprint.model.screenTask;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class DataScreenTaskDto {

    private String taskId;
    private String channelId;
    private String customerId;
    private String countOfVideo;
    private String countOfAdvertise;
    private String countOfAdvertiseMove;
    private String videoTimer;
    private String advertiseTimer;
    private String domain;
    private List<FixedScreenUrlDto> fixedUrls;

}
