package com.profisprint.service;

import com.profisprint.model.simpleTask.SimpleTaskReadyDto;

import java.util.List;

public interface UtilTaskService {

    List<SimpleTaskReadyDto> getSimpleTaskReady();
}
