package com.profisprint.service;

import com.profisprint.model.screenTask.ScreenTaskReadyDto;
import com.profisprint.model.simpleTask.SimpleTaskReadyDto;

import java.util.List;

public interface UtilTaskService {

    List<SimpleTaskReadyDto> getSimpleTaskReady();

    List<ScreenTaskReadyDto> getScreenTaskReady();
}
