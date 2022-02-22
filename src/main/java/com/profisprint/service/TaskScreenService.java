package com.profisprint.service;

import com.profisprint.model.domain.ScreenTask;
import com.profisprint.model.domain.Task;
import com.profisprint.model.screenTask.DataScreenTaskDto;
import com.profisprint.model.screenTask.ResultObjectDto;
import com.profisprint.model.simpleTask.DataTaskDto;
import com.profisprint.model.simpleTask.TaskInfoModel;

import java.util.ArrayList;
import java.util.List;

public interface TaskScreenService {
    DataScreenTaskDto getDataByTaskId(String taskId);
    ScreenTask findByOrderTaskId(String taskId);
    String findLastUsedVideos(String taskId);
    ArrayList<ScreenTask> findByCustomerId(String customerId);

    ArrayList<String> findLastUsedVideoList(String taskId);
    ArrayList<ScreenTask> findListByOrderTaskId(String taskId);

    ScreenTask saveScreenTask(String taskId, String customerId, String domain, List<ResultObjectDto> taskInfo);
    List<ScreenTask> findAllTask();
}
