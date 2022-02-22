package com.profisprint.model.screenTask;

import lombok.Data;

import java.util.List;

@Data
public class ProcessScreenTaskRequest {

    private String taskId;
    private String customerId;
    private String domain;
    private List<ResultObjectDto> taskInfo;
}
