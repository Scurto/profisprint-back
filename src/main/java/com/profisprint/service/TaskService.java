package com.profisprint.service;

import com.profisprint.model.advertise.AdvertiseDto;
import com.profisprint.model.domain.Task;
import com.profisprint.model.simpleTask.DataTaskDto;
import com.profisprint.model.simpleTask.TaskInfoModel;

import java.util.ArrayList;
import java.util.List;

public interface TaskService {

    Task saveSimpleTask(String taskId, String customerId, String domain, TaskInfoModel taskInfo);

    Task getTaskById();

    DataTaskDto getDataByTaskId(String taskId);

    Task findByOrderTaskId(String taskId);

    ArrayList<Task> findByCustomerId(String customerId);

    String findLastUsedVideos(String taskId);

    List<Task> findAllTask();
}
