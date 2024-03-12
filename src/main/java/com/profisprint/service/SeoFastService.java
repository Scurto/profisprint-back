package com.profisprint.service;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface SeoFastService {

    void openCategory(WebDriver driver, String name);

    void openMenu(WebDriver driver, String name);

    WebElement openEmbeddedVideoPage(WebDriver driver);

    void startEmbeddedVideo(WebDriver driver);

    String openYoutubePageAndSubscribe(WebDriver driver, String seofastWindow, WebElement channelElement);

    void selectAnswerAndConfirmTask(WebDriver driver, String chanelTitle);
}
