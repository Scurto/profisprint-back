package com.profisprint.service;

import org.openqa.selenium.WebDriver;

public interface SurfclickService {

    void openCategory(WebDriver driver, String name);
//    void openMenu(WebDriver driver, String name);
    String startVideoTask(WebDriver driver);

    String switchToNextTaskPage(WebDriver driver, String nextWindow);

    void openYoutubePageAndStartVideo(WebDriver driver, String wmrfastWindow, String videoWindow, String time);
}
