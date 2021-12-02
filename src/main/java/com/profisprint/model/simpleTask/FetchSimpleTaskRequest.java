package com.profisprint.model.simpleTask;

import lombok.Data;

@Data
public class FetchSimpleTaskRequest {

    private String taskId;
    private String customerId;
    private String countOfVideo;
    private String countOfAdvertise;
    private String countOfAdvertiseMove;
    private String channelId;
}
