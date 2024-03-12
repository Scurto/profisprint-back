package com.profisprint.service;

import org.openqa.selenium.WebDriver;

public interface ProfitcentrService {

    void openCategory(WebDriver driver, String name);
    void openMenu(WebDriver driver, String name);

    void startEmbeddedVideo(WebDriver driver);

    String startSubscribeTask(WebDriver driver);
    String startVideoTask(WebDriver driver);
    String switchToNextTaskPage(WebDriver driver, String profisprintWindow);

    void openYoutubePageAndSubscribe(WebDriver driver, String channelUrl, String profisprintWindow, String oceanwmWindow);
    void openYoutubePageAndStartVideo(WebDriver driver, String profisprintWindow, String videoWindow);

    void selectAnswerAndConfirmTask(WebDriver driver, String channelUrl);
}
