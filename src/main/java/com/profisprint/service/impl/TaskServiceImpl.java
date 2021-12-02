package com.profisprint.service.impl;

import com.profisprint.dao.TaskRepository;
import com.profisprint.model.advertise.AdvertiseDto;
import com.profisprint.model.domain.Task;
import com.profisprint.model.simpleTask.DataTaskDto;
import com.profisprint.model.simpleTask.TaskInfoModel;
import com.profisprint.service.TaskService;
import com.profisprint.storage.TaskDataInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task saveSimpleTask(String taskId, String customerId, String domain, TaskInfoModel taskInfo) {

        List<AdvertiseDto> advertise = taskInfo.getAdvertise();
        Task task = new Task();
        task.setOrderTaskId(taskId);
        task.setCustomerId(customerId);
        task.setCreatedDate(new Date());
        if (advertise != null && advertise.size() > 0) {
            StringBuilder sb = new StringBuilder();
            advertise.stream().map(advertiseDto -> advertiseDto.getId()).forEach(word -> sb.append(word).append("/"));
            sb.replace(sb.lastIndexOf("/"), sb.lastIndexOf("/")+1, "");
            task.setAdvertises(sb.toString());
        }
        task.setDomain(domain);
        task.setVideos(fetchUsedVideos(taskInfo.getVideos()));

        try {
            task = taskRepository.save(task);
        } catch (Exception ex) {
           log.error(ex.getMessage());
        }

        return task;
    }

    private String fetchUsedVideos(List<String> videos) {
        StringBuilder builder = new StringBuilder();
        int length = videos.size();
        for (int i = 0; i < length; i++) {
            builder.append(videos.get(i));
            if (i < length - 1) {
                builder.append("/");
            }
        }
        return builder.toString();
    }

    @Override
    public Task getTaskById() {
        Optional<Task> task = null;
        try {
            task = taskRepository.findById(1L);
        } catch (Exception ex) {
            log.error(ex.getMessage());
        }

        return task.get();
    }

    @Override
    public Task findByOrderTaskId(String taskId) {
        Optional<Task> task = null;
        try {
            ArrayList<Task> tasks = taskRepository.findByOrderTaskIdOrderByPkTaskIdDesc(taskId);
            if (tasks != null) {
                task = tasks.stream().findFirst();
            }
        } catch (Exception ex) {
            log.error(ex.getMessage());
        }
        return task.orElse(null);
    }

    @Override
    public ArrayList<Task> findByCustomerId(String customerId) {
        ArrayList<Task> tasks = null;
        try {
            tasks = taskRepository.findByCustomerIdOrderByPkTaskIdDesc(customerId);
        } catch (Exception ex) {
            log.error(ex.getMessage());
        }
        return tasks;
    }

    @Override
    public DataTaskDto getDataByTaskId(String taskId) {
        return TaskDataInfo.getTaskData(taskId);
    }

    @Override
    public String findLastUsedVideos(String taskId) {
        Task task = findByOrderTaskId(taskId);
        if (task != null) {
            return task.getVideos();
        }
        return null;
    }

    @Override
    public List<Task> findAllTask() {
        List<Task> tasks = new ArrayList<>();
        Iterable<Task> all = taskRepository.findAll();
        for (Task task : all) {
            tasks.add(task);
        }
        return tasks;
    }
}
