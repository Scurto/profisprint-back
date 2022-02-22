package com.profisprint.service.impl;

import com.profisprint.model.domain.ScreenTask;
import com.profisprint.model.domain.Task;
import com.profisprint.model.screenTask.DataScreenTaskDto;
import com.profisprint.model.screenTask.ScreenTaskReadyDto;
import com.profisprint.model.simpleTask.DataTaskDto;
import com.profisprint.model.simpleTask.SimpleTaskReadyDto;
import com.profisprint.service.TaskScreenService;
import com.profisprint.service.TaskService;
import com.profisprint.service.UtilTaskService;
import com.profisprint.storage.TaskDataInfo;
import com.profisprint.storage.TaskScreenDataInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;
import java.util.stream.Collectors;

@Slf4j
@Service
public class UtilTaskServiceImpl implements UtilTaskService {

    private final TaskService taskService;
    private final TaskScreenService taskScreenService;

    public UtilTaskServiceImpl(TaskService taskService, TaskScreenService taskScreenService) {
        this.taskService = taskService;
        this.taskScreenService = taskScreenService;
    }

    @Override
    public List<SimpleTaskReadyDto> getSimpleTaskReady() {
        List<SimpleTaskReadyDto> taskReadyDtos = new ArrayList<>();
        List<DataTaskDto> dto = TaskDataInfo.taskDataList();
        List<Task> allTask = taskService.findAllTask(); // TODO filter by 10-14 days
        LocalDate dayBeforeYesterday = LocalDate.now().minusDays(2);

        List<Task> onHoldTasks = allTask.stream().filter(task -> dateToLocalDate(task.getCreatedDate()).isAfter(dayBeforeYesterday)).collect(Collectors.toList());
        List<String> onHoldTaskIds = onHoldTasks.stream().map(task -> task.getOrderTaskId()).collect(Collectors.toList());

        List<String> todayTaskIds = allTask.stream().filter(task -> dateToLocalDate(task.getCreatedDate()).equals(LocalDate.now())).map(task -> task.getOrderTaskId()).collect(Collectors.toList());
        List<String> todayChannelIds = dto.stream().filter(task -> todayTaskIds.contains(task.getTaskId())).map(task -> task.getChannelId()).collect(Collectors.toList());
        List<DataTaskDto> readyToStartTasks = dto.stream()
                .filter(task -> !onHoldTaskIds.contains(task.getTaskId()))
                .filter(task -> !todayChannelIds.contains(task.getChannelId()))
                .collect(Collectors.toList());



        for (DataTaskDto readyToStartTask : readyToStartTasks) {
            SimpleTaskReadyDto readyDto = new SimpleTaskReadyDto();
            readyDto.setTaskId(readyToStartTask.getTaskId());
            readyDto.setChannelId(readyToStartTask.getChannelId());
            readyDto.setCustomerId(readyToStartTask.getCustomerId());
            readyDto.setDomain(readyToStartTask.getDomain());
            readyDto.setDomainUrl(readyDto.fetchDomainUrl(readyToStartTask.getDomain(), readyToStartTask.getTaskId()));
            Optional<Date> optionalDate = allTask.stream()
                    .filter(task -> task.getOrderTaskId().equals(readyToStartTask.getTaskId()))
                    .sorted(Comparator.nullsLast((o1, o2) -> o2.getCreatedDate().compareTo(o1.getCreatedDate())))
                    .map(task -> task.getCreatedDate())
                    .findFirst();

            optionalDate.ifPresentOrElse(date -> readyDto.setDate(new SimpleDateFormat("dd.MM.yyyy").format(date)), () -> readyDto.setDate("--.--.----"));
            taskReadyDtos.add(readyDto);
        }

        return taskReadyDtos;
    }

    @Override
    public List<ScreenTaskReadyDto> getScreenTaskReady() {
        List<ScreenTaskReadyDto> taskReadyDtos = new ArrayList<>();
        List<DataScreenTaskDto> dto = TaskScreenDataInfo.taskDataList();
        List<ScreenTask> allTask = taskScreenService.findAllTask(); // TODO filter by 10-14 days
        LocalDate dayBeforeYesterday = LocalDate.now().minusDays(2);

        List<ScreenTask> onHoldTasks = allTask.stream().filter(task -> dateToLocalDate(task.getCreatedDate()).isAfter(dayBeforeYesterday)).collect(Collectors.toList());
        List<String> onHoldTaskIds = onHoldTasks.stream().map(task -> task.getOrderTaskId()).collect(Collectors.toList());

        List<String> todayTaskIds = allTask.stream().filter(task -> dateToLocalDate(task.getCreatedDate()).equals(LocalDate.now())).map(task -> task.getOrderTaskId()).collect(Collectors.toList());
        List<String> todayChannelIds = dto.stream().filter(task -> todayTaskIds.contains(task.getTaskId())).map(task -> task.getChannelId()).collect(Collectors.toList());
        List<DataScreenTaskDto> readyToStartTasks = dto.stream()
                .filter(task -> !onHoldTaskIds.contains(task.getTaskId()))
                .filter(task -> !todayChannelIds.contains(task.getChannelId()))
                .collect(Collectors.toList());



        for (DataScreenTaskDto readyToStartTask : readyToStartTasks) {
            ScreenTaskReadyDto readyDto = new ScreenTaskReadyDto();
            readyDto.setTaskId(readyToStartTask.getTaskId());
            readyDto.setChannelId(readyToStartTask.getChannelId());
            readyDto.setCustomerId(readyToStartTask.getCustomerId());
            readyDto.setDomain(readyToStartTask.getDomain());
            readyDto.setDomainUrl(readyDto.fetchDomainUrl(readyToStartTask.getDomain(), readyToStartTask.getTaskId()));
            Optional<Date> optionalDate = allTask.stream()
                    .filter(task -> task.getOrderTaskId().equals(readyToStartTask.getTaskId()))
                    .sorted(Comparator.nullsLast((o1, o2) -> o2.getCreatedDate().compareTo(o1.getCreatedDate())))
                    .map(task -> task.getCreatedDate())
                    .findFirst();

            optionalDate.ifPresentOrElse(date -> readyDto.setDate(new SimpleDateFormat("dd.MM.yyyy").format(date)), () -> readyDto.setDate("--.--.----"));
            taskReadyDtos.add(readyDto);
        }

        return taskReadyDtos;
    }

    private LocalDate dateToLocalDate(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }
}
