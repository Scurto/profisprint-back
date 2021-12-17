package com.profisprint.service.impl;

import com.profisprint.model.simpleTask.DataTaskDto;
import com.profisprint.service.TaskScreenService;
import com.profisprint.storage.TaskScreenDataInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TaskScreenServiceImpl implements TaskScreenService {

    @Override
    public DataTaskDto getDataByTaskId(String taskId) {
        return TaskScreenDataInfo.getTaskData(taskId);
    }
}
