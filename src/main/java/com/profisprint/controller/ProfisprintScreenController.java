package com.profisprint.controller;

import com.profisprint.model.advertise.AdvertiseScreenDto;
import com.profisprint.model.advertise.SecondaryAdvertiseModel;
import com.profisprint.model.screenTask.*;
import com.profisprint.model.youtube.alternative.YoutubeVideoObject;
import com.profisprint.service.AdvertiseService;
import com.profisprint.service.TaskScreenService;
import com.profisprint.service.UtilTaskService;
import com.profisprint.service.YoutubeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@Slf4j
@RequestMapping("/screen")
public class ProfisprintScreenController {

    @Autowired
    private TaskScreenService taskScreenService;
    @Autowired
    private YoutubeService youtubeService;
    @Autowired
    private AdvertiseService advertiseService;
    @Autowired
    private UtilTaskService utilTaskService;

    @RequestMapping(value = "/getDataByTaskId", method = RequestMethod.GET)
    public DataScreenTaskDto getDataByTaskId(@RequestParam("taskId") String taskId) {
        log.info("getDataByTaskId-> " + taskId);
        DataScreenTaskDto dto = taskScreenService.getDataByTaskId(taskId);
        return dto;
    }

    @RequestMapping(value = "/fetchTask", method = RequestMethod.POST)
    public FetchScreenTaskResponse fetchTask(@RequestBody FetchScreenTaskRequest request) {
        log.info("fetchTask-> " + request);

        List<NavObjectDto> navList = new ArrayList<>();
        List<ResultObjectDto> resultList = new ArrayList<>();

        String lastUsedVideos = taskScreenService.findLastUsedVideos(request.getTaskId());

        DataScreenTaskDto dto = taskScreenService.getDataByTaskId(request.getTaskId());
        if (dto.getFixedUrls() != null) {
            for (FixedScreenUrlDto fixedUrl : dto.getFixedUrls()) {
                navList.add(new NavObjectDto(fixedUrl.getText(), fixedUrl.getIcon()));
                resultList.add(new ResultObjectDto("fixed", fixedUrl.getTitle(), "", fixedUrl.getIcon(), fixedUrl.getText(), null, null));
            }
        }

        List<String> lastUsedVideoList = taskScreenService.findLastUsedVideoList(request.getTaskId());
        List<YoutubeVideoObject> videos = youtubeService.getVideosObjectByChannelIdAndCountWithFilterByLastUsedVideo(request.getTaskId(), request.getChannelId(), request.getCountOfVideo(), lastUsedVideoList);
        List<AdvertiseScreenDto> advertise = advertiseService.getAdvertisesForScreenTask(request.getTaskId(), request.getCustomerId(), request.getCountOfAdvertise(), request.getCountOfAdvertiseMove());
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        for (int i=0; i < videos.size(); i++) {
            navList.add(new NavObjectDto(videos.get(i).getTitle()+" - YouTube", "youtube"));
            resultList.add(new ResultObjectDto("video", "www.youtube.com", "", "youtube", videos.get(i).getTitle()+" - YouTube", videos.get(i).getVideoId(), null));
            if (advertise != null && advertise.size() > i) {
                navList.add(new NavObjectDto(advertise.get(i).getDescription(), advertise.get(i).getId()));
                resultList.add(new ResultObjectDto("advertise", advertise.get(i).getTitle(), "", advertise.get(i).getId(), advertise.get(i).getDescription(), null, advertise.get(i).getId()));
                for (SecondaryAdvertiseModel secondaryModel : advertise.get(i).getAdvertiseMoveList()) {
                    navList.add(new NavObjectDto(secondaryModel.getTitle(), advertise.get(i).getId()));
                    resultList.add(new ResultObjectDto("advertise", advertise.get(i).getTitle(), "", advertise.get(i).getId(), secondaryModel.getTitle(), null, null));
                }
            }
        }

        for (ResultObjectDto objectDto : resultList) {
            objectDto.setTime(now.format(formatter));
            switch(objectDto.getType()) {
                case "video":  now = now.plusSeconds(Long.valueOf(request.getVideoTimer())); break;
                case "advertise": now = now.plusSeconds(Long.valueOf(request.getAdvertiseTimer())); break;
                default: now = now.plusSeconds(30); break;
            }
        }

        Collections.reverse(resultList);
        now = now.plusSeconds(60);

        return new FetchScreenTaskResponse(navList, resultList, new DateObjectDto(now.format(formatter), now.format(formatterDate)), lastUsedVideos);
    }

    @RequestMapping(value = "/processTask", method = RequestMethod.POST)
    public String processTask(@RequestBody ProcessScreenTaskRequest request) {
        log.info("processTask -> " + request);
        taskScreenService.saveScreenTask(request.getTaskId(), request.getCustomerId(), request.getDomain(), request.getTaskInfo());
        return "processTask";
    }

    @RequestMapping(value = "/screenTaskReady", method = RequestMethod.GET)
    public List<ScreenTaskReadyDto> screenTaskReady() {
        List<ScreenTaskReadyDto> readyToStartTasks = utilTaskService.getScreenTaskReady();
        return readyToStartTasks
                .stream()
                .filter(task -> !task.getTaskId().equalsIgnoreCase("0") && !task.getTaskId().equalsIgnoreCase("1") && !task.getTaskId().equalsIgnoreCase("2"))
                .collect(Collectors.toList());
    }
}
