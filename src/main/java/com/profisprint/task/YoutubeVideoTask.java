package com.profisprint.task;

import com.profisprint.service.AutoTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class YoutubeVideoTask implements Runnable {

    @Autowired
    private AutoTaskService autoTaskService;

    @Override
    public void run() {
        try {
            System.out.println("START SCHEDULER> " + new Date());
            autoTaskService.driverConfig();
            autoTaskService.profitcentrYoutubeVideoProcess();
            Thread.sleep(2000);
            autoTaskService.profitcentrYoutubeVideoProcess();
            autoTaskService.avisoYoutubeVideoProcess("Все");
            Thread.sleep(2000);
            autoTaskService.avisoYoutubeVideoProcess("Все");
            autoTaskService.losenaYoutubeVideoProcess();
            Thread.sleep(2000);
            autoTaskService.losenaYoutubeVideoProcess();
            autoTaskService.wmrfastYoutubeVideoProcess();
            Thread.sleep(2000);
            autoTaskService.wmrfastYoutubeVideoProcess();
            System.out.println("STOP SCHEDULER> " + new Date());
            autoTaskService.testClose();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
