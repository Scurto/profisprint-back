package com.profisprint.model.screenTask;

import lombok.Data;

@Data
public class FetchScreenTaskRequest {

    private String taskId;
    private String customerId;
    private String countOfVideo;
    private String countOfAdvertise;
    private String countOfAdvertiseMove;
    private String channelId;
}
