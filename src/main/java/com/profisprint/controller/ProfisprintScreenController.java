package com.profisprint.controller;

import com.profisprint.model.screenTask.FetchScreenTaskRequest;
import com.profisprint.model.screenTask.FetchScreenTaskResponse;
import com.profisprint.model.screenTask.NavObjectDto;
import com.profisprint.model.screenTask.ResultObjectDto;
import com.profisprint.model.simpleTask.DataTaskDto;
import com.profisprint.model.simpleTask.FetchSimpleTaskRequest;
import com.profisprint.model.simpleTask.FetchSimpleTaskResponse;
import com.profisprint.model.youtube.alternative.YoutubeVideoObject;
import com.profisprint.service.TaskScreenService;
import com.profisprint.service.TaskService;
import com.profisprint.service.YoutubeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/screen")
public class ProfisprintScreenController {

    @Autowired
    private TaskScreenService taskScreenService;
    @Autowired
    private YoutubeService youtubeService;

    @RequestMapping(value = "/getDataByTaskId", method = RequestMethod.GET)
    public DataTaskDto getDataByTaskId(@RequestParam("taskId") String taskId) {
        log.info("getDataByTaskId-> " + taskId);
        DataTaskDto dto = taskScreenService.getDataByTaskId(taskId);
        return dto;
    }

    @RequestMapping(value = "/fetchTask", method = RequestMethod.POST)
    public FetchScreenTaskResponse fetchTask(@RequestBody FetchScreenTaskRequest request) {
        log.info("fetchTask-> " + request);
        FetchScreenTaskResponse response = new FetchScreenTaskResponse();
        List<NavObjectDto> navList = new ArrayList<>();
        List<ResultObjectDto> resultList = new ArrayList<>();
        List<YoutubeVideoObject> videos = youtubeService.getVideosObjectByChannelIdAndCountWithFilterByLastUsedVideo(request.getTaskId(), request.getChannelId(), request.getCountOfVideo(), new ArrayList<>());

        for (YoutubeVideoObject video : videos) {
            navList.add(new NavObjectDto(video.getTitle(), "youtube"));
            resultList.add(new ResultObjectDto("someTitle1", "12:03", "youtube", video.getTitle(), video.getVideoId()));
        }
        response.setNavList(navList);
        response.setResultList(resultList);
        return response;
    }
}
