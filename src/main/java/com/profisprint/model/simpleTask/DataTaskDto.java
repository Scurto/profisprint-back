package com.profisprint.model.simpleTask;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
//@AllArgsConstructor
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

    private String description;

    private String requirements;

    public DataTaskDto(String taskId, String channelId, String customerId, String countOfVideo, String countOfAdvertise, String countOfAdvertiseMove, String videoTimer, String advertiseTimer, String domain) {
        this.taskId = taskId;
        this.channelId = channelId;
        this.customerId = customerId;
        this.countOfVideo = countOfVideo;
        this.countOfAdvertise = countOfAdvertise;
        this.countOfAdvertiseMove = countOfAdvertiseMove;
        this.videoTimer = videoTimer;
        this.advertiseTimer = advertiseTimer;
        this.domain = domain;
    }

    public DataTaskDto(String taskId, String channelId, String customerId, String countOfVideo, String countOfAdvertise, String countOfAdvertiseMove, String videoTimer, String advertiseTimer, String domain, String description, String requirements) {
        this.taskId = taskId;
        this.channelId = channelId;
        this.customerId = customerId;
        this.countOfVideo = countOfVideo;
        this.countOfAdvertise = countOfAdvertise;
        this.countOfAdvertiseMove = countOfAdvertiseMove;
        this.videoTimer = videoTimer;
        this.advertiseTimer = advertiseTimer;
        this.domain = domain;
        this.description = description;
        this.requirements = requirements;
    }
}
