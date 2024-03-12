package com.profisprint.controller;

import com.profisprint.model.advertise.AdvertiseDto;
import com.profisprint.model.seofast.TestModel;
import com.profisprint.model.simpleTask.*;
import com.profisprint.model.youtube.YoutubeVideosResponse;
import com.profisprint.service.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

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
    @Autowired
    private UtilTaskService utilTaskService;

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
        List<String> videos = null;

        if (List.of("821519", "7531", "7624", "7619", "730443", "741947", "742764").contains(request.getTaskId())) {
//            TODO only new video for customer
            List<String> lastUsedVideoList = taskService.findLastUsedVideoList(request.getTaskId());
            videos = youtubeService.getVideosByChannelIdAndCountWithFilterByLastUsedVideo(request.getTaskId(), request.getChannelId(), request.getCountOfVideo(), lastUsedVideoList);
        } else {
            videos = youtubeService.getVideosByChannelIdAndCountWithFilterByLastUsedVideo(request.getTaskId(), request.getChannelId(), request.getCountOfVideo(), lastUsedVideos);
        }

        List<AdvertiseDto> advertise = advertiseService.getAdvertisesForSimpleTask(request.getTaskId(), request.getCustomerId(), request.getCountOfAdvertise(), request.getCountOfAdvertiseMove());


        FetchSimpleTaskResponse task = new FetchSimpleTaskResponse();
        task.setVideos(videos);
        task.setAdvertise(advertise);
        task.setLastUsedVideos(lastUsedVideos);
        return task;
    }

    @RequestMapping(value = "/simpleTaskReady", method = RequestMethod.GET)
    public List<SimpleTaskReadyDto> simpleTaskReady() {
        List<SimpleTaskReadyDto> readyToStartTasks = utilTaskService.getSimpleTaskReady();
        return readyToStartTasks
                .stream()
                .filter(task -> !task.getTaskId().equalsIgnoreCase("0") && !task.getTaskId().equalsIgnoreCase("1") && !task.getTaskId().equalsIgnoreCase("2"))
                .collect(Collectors.toList());
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

    @RequestMapping(value = "/seofast", method = RequestMethod.POST)
    public String seofast(@RequestParam("username") String username, @RequestParam("password") String password) {
//        http://localhost:8830/seofast
        log.info("username -> " + username);
        log.info("password -> " + password);

        return "some value";
//        seoFastService.test();
//        return "";
    }
    @RequestMapping(value = "/profitcentr", method = RequestMethod.GET)
    public String profitcentr() {
//        http://localhost:8830/profitcentr
//        profitcentrService.test();
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
