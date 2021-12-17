package com.profisprint.service;

import com.profisprint.model.simpleTask.DataTaskDto;

public interface TaskScreenService {
    DataTaskDto getDataByTaskId(String taskId);
}
