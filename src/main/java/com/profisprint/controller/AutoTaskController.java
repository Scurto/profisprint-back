package com.profisprint.controller;

import com.profisprint.service.AutoTaskService;
import com.profisprint.task.YoutubeVideoTask;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.ScheduledFuture;

@RestController
@Slf4j
@RequestMapping("/auto")
public class AutoTaskController {

    @Autowired
    private AutoTaskService autoTaskService;

    @Autowired
    private TaskScheduler taskScheduler;

    @Autowired
    private YoutubeVideoTask youtubeVideoTask;

    private ScheduledFuture<?> scheduledFuture;

    @GetMapping("/profitcentr/youtube/subscribe")
    private String profitcentrYoutubeSubscribe() throws IOException {
        try {
            autoTaskService.profitcentrYoutubeSubscribe();
        } catch (RuntimeException ex) {
            System.out.println(ex);
        }

        return "";
    }

    @GetMapping("/profitcentr/youtube/video")
    private String profitcentrYoutubeVideo() throws IOException {
        try {
            autoTaskService.profitcentrYoutubeVideo();
        } catch (RuntimeException ex) {
            System.out.println(ex);
        }

        return "";
    }

    @GetMapping("/aviso/youtube/video")
    private String avisoYoutubeVideo() throws IOException {
        try {
            autoTaskService.avisoYoutubeVideo();
        } catch (RuntimeException ex) {
            System.out.println(ex);
        }

        return "";
    }

    @GetMapping("/losena/youtube/video")
    private String losenaYoutubeVideo() throws IOException {
        try {
            autoTaskService.losenaYoutubeVideo();
        } catch (RuntimeException ex) {
            System.out.println(ex);
        }

        return "";
    }

    @GetMapping("/wmrfast/youtube/video")
    private String wmrfastYoutubeVideo() throws IOException {
        try {
            autoTaskService.wmrfastYoutubeVideo();
        } catch (RuntimeException ex) {
            System.out.println(ex);
        }

        return "";
    }

    @GetMapping("/surfclick/youtube/video")
    private String surfclickYoutubeVideo() throws IOException {
        try {
            autoTaskService.surfclickYoutubeVideo();
        } catch (RuntimeException ex) {
            System.out.println(ex);
        }

        return "";
    }

    @GetMapping("/seofast/youtube")
    private String seofastYoutubeSubscribe() throws IOException {
        try {
            autoTaskService.seofastYoutubeSubscribe();
        } catch (RuntimeException ex) {
            System.out.println(ex);
        }

        return "";
    }





    @GetMapping("/test")
    private String test() throws IOException {
//        try {
//            autoTaskService.test();
//            autoTaskService.test2();
//        } catch (RuntimeException ex) {
//            System.out.println(ex);
//        }
        try {
            autoTaskService.test3();
        } catch (RuntimeException ex) {
            System.out.println(ex);
        }

        return "";
    }

    @GetMapping("/scheduler/youtube/start")
    private String schedulerYoutubeStart() throws IOException {
        scheduledFuture = taskScheduler.scheduleWithFixedDelay(youtubeVideoTask, 5*60*1000);//5 min
        return "";
    }

    @GetMapping("/scheduler/youtube/stop")
    private String schedulerYoutubeStop() throws IOException {
        System.out.println("CANCEL SCHEDULER> " + new Date());
        scheduledFuture.cancel(false);
        return "";
    }
}
