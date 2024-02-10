package com.profisprint.controller;

import com.profisprint.service.AutoTaskService;
import com.profisprint.service.GclidService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@Slf4j
@RequestMapping("/test")
public class TestController {

    @Autowired
    private GclidService gclidService;

    @Autowired
    private AutoTaskService autoTaskService;

    @GetMapping
    private String test() throws IOException {
//        String gclid = gclidService.getGclid();
//        return gclid;
        autoTaskService.startTask();
        return "";
    }
}
