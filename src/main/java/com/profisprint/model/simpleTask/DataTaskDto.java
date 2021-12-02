package com.profisprint.model.simpleTask;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DataTaskDto {

    private String taskId;
    private String channelId;
    private String customerId;
    private String countOfVideo;
    private String countOfAdvertise;
    private String countOfAdvertiseMove;
    private String videoTimer;
    private String advertiseTimer;
    private String domain;

}
