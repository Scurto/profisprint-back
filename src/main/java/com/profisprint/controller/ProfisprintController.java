package com.profisprint.controller;

import com.profisprint.model.advertise.AdvertiseDto;
import com.profisprint.model.domain.Task;
import com.profisprint.model.simpleTask.DataTaskDto;
import com.profisprint.model.simpleTask.FetchSimpleTaskRequest;
import com.profisprint.model.simpleTask.FetchSimpleTaskResponse;
import com.profisprint.model.simpleTask.ProcessSimpleTaskRequest;
import com.profisprint.model.youtube.YoutubeVideosResponse;
import com.profisprint.service.*;
import com.profisprint.storage.TaskDataInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@Slf4j
public class ProfisprintController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private TaskService taskService;
    @Autowired
    private YoutubeService youtubeService;
    @Autowired
    private AdvertiseService advertiseService;
    @Autowired
    private GclidService gclidService;
    @Autowired
    private SeoFastService seoFastService;
    @Autowired
    private ProfitcentrService profitcentrService;

    @RequestMapping(value = "/getDataByTaskId", method = RequestMethod.GET)
    public DataTaskDto getDataByTaskId(@RequestParam("taskId") String taskId) {
        log.info("getDataByTaskId");
        DataTaskDto dto = taskService.getDataByTaskId(taskId);
        return dto;
    }

    @RequestMapping(value = "/fetchTask", method = RequestMethod.POST)
    public FetchSimpleTaskResponse fetchTask(@RequestBody FetchSimpleTaskRequest request) {
        log.info("fetchTask -> " + request);

        String lastUsedVideos = taskService.findLastUsedVideos(request.getTaskId());
        //        List<String> videos = youtubeService.getVideosByChannelIdAndCount(request.getChannelId(), request.getCountOfVideo());
        List<String> videos = youtubeService.getVideosByChannelIdAndCountWithFilterByLastUsedVideo(request.getChannelId(), request.getCountOfVideo(), lastUsedVideos);
        List<AdvertiseDto> advertise = advertiseService.getAdvertisesForSimpleTask(request.getTaskId(), request.getCustomerId(), request.getCountOfAdvertise(), request.getCountOfAdvertiseMove());


        FetchSimpleTaskResponse task = new FetchSimpleTaskResponse();
        task.setVideos(videos);
        task.setAdvertise(advertise);
        task.setLastUsedVideos(lastUsedVideos);
        return task;
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public List<DataTaskDto> test() {
        List<DataTaskDto> dto = TaskDataInfo.taskDataList();
        List<Task> allTask = taskService.findAllTask();

        LocalDate now = LocalDate.now();
        LocalDate dayBeforeYesterday = LocalDate.now().minusDays(2);

        List<Task> onHoldTasks = allTask.stream().filter(task -> dateToLocalDate(task.getCreatedDate()).isAfter(dayBeforeYesterday)).collect(Collectors.toList());
        List<String> onHoldTaskIds = onHoldTasks.stream().map(task -> task.getOrderTaskId()).collect(Collectors.toList());
        List<DataTaskDto> readyToStartTasks = dto.stream().filter(task -> !onHoldTaskIds.contains(task.getTaskId())).collect(Collectors.toList());
        return readyToStartTasks;
    }

    private LocalDate dateToLocalDate(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    @RequestMapping(value = "/processTask", method = RequestMethod.POST)
    public String processTask(@RequestBody ProcessSimpleTaskRequest request) {
        log.info("processTask -> " + request);
        taskService.saveSimpleTask(request.getTaskId(), request.getCustomerId(), request.getDomain(), request.getTaskInfo());
        return "processTask";
    }

    @RequestMapping(value = "/gclid", method = RequestMethod.GET)
    public String gclid() {
        return gclidService.getGclid();
    }

    @RequestMapping(value = "/seofast", method = RequestMethod.GET)
    public String seofast() {
//        http://localhost:8830/seofast
        seoFastService.test();
        return "";
    }
    @RequestMapping(value = "/profitcentr", method = RequestMethod.GET)
    public String profitcentr() {
//        http://localhost:8830/profitcentr
        profitcentrService.test();
        return "";
    }

    @RequestMapping(value = "/youtube", method = RequestMethod.GET)
    public String youtube() {
//        https://stackoverflow.com/questions/18953499/youtube-api-to-fetch-all-videos-on-a-channel/27872244#27872244
//        https://console.cloud.google.com/apis/api/youtube.googleapis.com/credentials?project=profisprint

//        https://youtube.googleapis.com/youtube/v3/channels?part=snippet&id=UCJIbnmV8DdqOGEcl6hm-x8w&key=AIzaSyAyNojjjjdQtfeIajqOXU6n4iQBysBS2kU
//        https://youtube.googleapis.com/youtube/v3/search?part=snippet&channelId=UCJIbnmV8DdqOGEcl6hm-x8w&maxResults=50&type=video&key=AIzaSyAyNojjjjdQtfeIajqOXU6n4iQBysBS2kU

//        ----- get channelId by video id
//        https://youtube.googleapis.com/youtube/v3/videos?part=snippet&id=oFkg4Hwj1S4&key=AIzaSyAyNojjjjdQtfeIajqOXU6n4iQBysBS2kU
//        ------------------------------------

        String key = "AIzaSyAyNojjjjdQtfeIajqOXU6n4iQBysBS2kU";

        String clientId = "993931639598-trej60koajduj782658h1t37gfst5461.apps.googleusercontent.com";
        String clientSecret = "eqIAfk-lVvuKjf02ILGNtPld";

        YoutubeVideosResponse response = restTemplate.getForObject("https://youtube.googleapis.com/youtube/v3/search?part=snippet&channelId=UCJIbnmV8DdqOGEcl6hm-x8w&maxResults=50&order=date&type=video&key=AIzaSyAyNojjjjdQtfeIajqOXU6n4iQBysBS2kU", YoutubeVideosResponse.class);

        return "";
    }
}
