package com.profisprint.service.impl;

import com.profisprint.dao.ScreenTaskRepository;
import com.profisprint.model.domain.ScreenTask;
import com.profisprint.model.domain.Task;
import com.profisprint.model.screenTask.DataScreenTaskDto;
import com.profisprint.model.screenTask.ResultObjectDto;
import com.profisprint.service.TaskScreenService;
import com.profisprint.storage.TaskScreenDataInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
@Service
public class TaskScreenServiceImpl implements TaskScreenService {

    private final ScreenTaskRepository repository;

    public TaskScreenServiceImpl(ScreenTaskRepository repository) {
        this.repository = repository;
    }

    @Override
    public DataScreenTaskDto getDataByTaskId(String taskId) {
        return TaskScreenDataInfo.getTaskData(taskId);
    }

    @Override
    public ScreenTask findByOrderTaskId(String taskId) {
        Optional<ScreenTask> task = null;
        try {
            ArrayList<ScreenTask> tasks = repository.findByOrderTaskIdOrderByPkTaskIdDesc(taskId);
            if (tasks != null) {
                task = tasks.stream().findFirst();
            }
        } catch (Exception ex) {
            log.error(ex.getMessage());
        }
        return task.orElse(null);
    }

    @Override
    public String findLastUsedVideos(String taskId) {
        ScreenTask task = findByOrderTaskId(taskId);
        if (task != null) {
            return task.getVideos();
        }
        return null;
    }

    @Override
    public ArrayList<ScreenTask> findByCustomerId(String customerId) {
        ArrayList<ScreenTask> tasks = null;
        try {
            tasks = repository.findByCustomerIdOrderByPkTaskIdDesc(customerId);
        } catch (Exception ex) {
            log.error(ex.getMessage());
        }
        return tasks;
    }

    @Override
    public ArrayList<String> findLastUsedVideoList(String taskId) {
        ArrayList<String> arrayList = null;
        ArrayList<ScreenTask> listOfLastTasks = findListByOrderTaskId(taskId);
        if (listOfLastTasks != null) {
            arrayList = new ArrayList<>(listOfLastTasks.stream().map(task -> task.getVideos()).collect(Collectors.toList()));
        }

        return arrayList;
    }

    @Override
    public ScreenTask saveScreenTask(String taskId, String customerId, String domain, List<ResultObjectDto> taskInfo) {
        ScreenTask task = new ScreenTask();
        task.setOrderTaskId(taskId);
        task.setCustomerId(customerId);
        task.setCreatedDate(new Date());
        task.setDomain(domain);

        List<ResultObjectDto> videoList = taskInfo.stream().filter(e -> "video".equalsIgnoreCase(e.getType())).collect(Collectors.toList());
        List<ResultObjectDto> advertiseList = taskInfo.stream().filter(e -> "advertise".equalsIgnoreCase(e.getType()) && e.getId() != null).collect(Collectors.toList());
        if (videoList != null && videoList.size() > 0) {
            task.setVideos(fetchUsedVideos(videoList));
        }
        if (advertiseList != null && advertiseList.size() > 0) {
            task.setAdvertises(fetchUsedAdvertise(advertiseList));
        }

        try {
            return repository.save(task);
        } catch (Exception ex) {
            log.error(ex.getMessage());
        }

        return task;
    }

    private String fetchUsedVideos(List<ResultObjectDto> videoList) {
        StringBuilder builder = new StringBuilder();
        int length = videoList.size();
        for (int i = 0; i < length; i++) {
            builder.append(videoList.get(i).getUrl());
            if (i < length - 1) {
                builder.append("/");
            }
        }
        return builder.toString();
    }

    private String fetchUsedAdvertise(List<ResultObjectDto> advertiseList) {
        StringBuilder builder = new StringBuilder();
        int length = advertiseList.size();
        for (int i = 0; i < length; i++) {
            builder.append(advertiseList.get(i).getId());
            if (i < length - 1) {
                builder.append("/");
            }
        }
        return builder.toString();
    }

    @Override
    public ArrayList<ScreenTask> findListByOrderTaskId(String taskId) {
        ArrayList<ScreenTask> tasks = null;
        try {
            tasks = repository.findByOrderTaskIdOrderByPkTaskIdDesc(taskId);
        } catch (Exception ex) {
            log.error(ex.getMessage());
        }
        return tasks;
    }

    @Override
    public List<ScreenTask> findAllTask() {
        List<ScreenTask> tasks = new ArrayList<>();
        Iterable<ScreenTask> all = repository.findAll();
        for (ScreenTask task : all) {
            tasks.add(task);
        }
        return tasks;
    }
}
