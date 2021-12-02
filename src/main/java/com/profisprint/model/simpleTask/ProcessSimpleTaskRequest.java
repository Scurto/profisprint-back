package com.profisprint.model.simpleTask;

import lombok.Data;

@Data
public class ProcessSimpleTaskRequest {

    private String taskId;
    private String customerId;
    private String domain;
    private TaskInfoModel taskInfo;
}
