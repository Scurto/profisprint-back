package com.profisprint.storage;

import com.profisprint.model.simpleTask.DataTaskDto;

import java.util.List;
import java.util.Optional;

public class TaskScreenDataInfo {

    public static DataTaskDto getTaskData(String taskId) {
        Optional<DataTaskDto> task = taskDataList().stream().filter(o -> o.getTaskId().equals(taskId)).findFirst();
        return task.get();
    }


    public static List<DataTaskDto> taskDataList() {
        List<DataTaskDto> taskList = List.of(
            new DataTaskDto(
                    "0",
                    "someChannelId",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "0",
                    "test"

            ),
            new DataTaskDto(
                    "1",
                    "UCJIbnmV8DdqOGEcl6hm-x8w",
                    "12345-test",
                    "3",
                    "0",
                    "0",
                    "60",
                    "0",
                    "myTest"
            )
        );

        return taskList;
    }
}
