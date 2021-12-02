package com.profisprint.service.impl;

import com.profisprint.model.advertise.AdvertiseDto;
import com.profisprint.model.advertise.AdvertiseModel;
import com.profisprint.model.advertise.SecondaryAdvertiseModel;
import com.profisprint.model.domain.Task;
import com.profisprint.service.AdvertiseService;
import com.profisprint.service.TaskService;
import com.profisprint.storage.AdvertiseDataInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;
import java.util.stream.Collectors;

@Slf4j
@Service
public class AdvertiseServiceImpl implements AdvertiseService {

    private final TaskService taskService;

    public AdvertiseServiceImpl(TaskService taskService) {
        this.taskService = taskService;
    }

    @Override
    public List<AdvertiseDto> getAdvertisesForSimpleTask(String taskId, String customerId, String countOfAdvertise, String countOfAdvertiseMove) {
        HashMap<String, AdvertiseModel> advertiseData =  AdvertiseDataInfo.advertiseData();
        Task task = taskService.findByOrderTaskId(taskId);

        if (task != null && task.getAdvertises() != null) {
            List<String> lastAdvertiseIdList = List.of(task.getAdvertises().split("/"));
            for (String key : lastAdvertiseIdList) {
                advertiseData.remove(key);
            }
        }

        ArrayList<Task> customerAdvertiseList = taskService.findByCustomerId(customerId);
        if (customerAdvertiseList != null && !taskId.equals("1")) {
            Date in = new Date();
            LocalDateTime ldt = LocalDateTime.ofInstant(in.toInstant(), ZoneId.systemDefault()).minusDays(3);
            Date out = Date.from(ldt.atZone(ZoneId.systemDefault()).toInstant());
            List<Task> taskList = customerAdvertiseList.stream().filter(customerTask -> customerTask.getCreatedDate().after(out)).collect(Collectors.toList());
            if (taskList != null) {
                for (Task task1 : taskList) {
                    if (task1.getAdvertises() != null) {
                        List<String> lastAdvertiseIdList = List.of(task1.getAdvertises().split("/"));
                        for (String key : lastAdvertiseIdList) {
                            advertiseData.remove(key);
                        }
                    }
                }
            }
        }


        ArrayList<String> keys = chooseNewAdvertises(advertiseData, Integer.valueOf(countOfAdvertise));

        List<AdvertiseDto> advertise = new ArrayList<>();
        for (String key : keys) {
            AdvertiseModel model = advertiseData.get(key);
            advertise.add(new AdvertiseDto(
                    chooseSecondaryAdvertises(new ArrayList<>(model.getSecondaryAdvertiseModel()), Integer.valueOf(countOfAdvertiseMove)),
                    model.getMainUrl(),
                    model.getId()
            ));
        }

        return advertise;
    }

    private ArrayList<String> chooseNewAdvertises(HashMap<String, AdvertiseModel> advertiseData, int countOfAdvertise) {
        Set<String> set = new HashSet<>();
        set.addAll(advertiseData.keySet());
        ArrayList<String> keys = new ArrayList<>();
        for(int i = 0; i < countOfAdvertise; i++) {
            String element = set.stream().skip(new Random().nextInt(set.size())).findFirst().orElse(null);
            keys.add(element);
            set.remove(element);
        }
        return keys;
    }

    private ArrayList<String> chooseSecondaryAdvertises(ArrayList<SecondaryAdvertiseModel> secondaryAdvertiseData, int countOfAdvertiseMove) {
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < countOfAdvertiseMove; i++) {
            int index = new Random().nextInt(secondaryAdvertiseData.size());
            list.add(secondaryAdvertiseData.get(index).getUrl());
            secondaryAdvertiseData.remove(index);
        }

        return list;
    }
}
