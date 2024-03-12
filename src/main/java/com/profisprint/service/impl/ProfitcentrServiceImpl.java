package com.profisprint.service.impl;

import com.profisprint.service.CaptchaService;
import com.profisprint.service.ProfitcentrService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.*;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.CookieStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProfitcentrServiceImpl implements ProfitcentrService {

    private final CaptchaService captchaService;

    @Override
    public void openCategory(WebDriver driver, String name) {
        try {
            WebElement menu = driver.findElement(By.id("mnu_tblock1"));
            List<WebElement> categories = menu.findElements(By.tagName("a"));
            WebElement youtubeCategory = null;
            for (WebElement category : categories) {
                if (name.equalsIgnoreCase(category.getText())) {
                    youtubeCategory = category;
                }
            }
            Thread.sleep(2000);
            youtubeCategory.click();
            Thread.sleep(2000);
        } catch (Exception ex) {
            System.out.println(ex);
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void openMenu(WebDriver driver, String name) {
        try {
            if (driver.findElement(By.id("maincolumn")).findElements(By.className("out-capcha-title")).size() > 0) {
                String capchaTitle = "";
                WebElement menu = driver.findElement(By.id("maincolumn")).findElement(By.className("out-capcha-title"));
                capchaTitle = menu.getText().trim();
                System.out.println(capchaTitle);

                List<WebElement> capchaImgElements = driver.findElements(By.className("out-capcha-lab"));

                if ("Отметьте изображения с цветами".equalsIgnoreCase(capchaTitle)) {
                    profitcentrCaptchaClick(capchaImgElements, "изображения с цветами");
                } else if ("Отметьте изображения с мотоциклами".equalsIgnoreCase(capchaTitle)) {
                    profitcentrCaptchaClick(capchaImgElements, "изображения с мотоциклами");
                } else if ("Отметьте изображения с девушками".equalsIgnoreCase(capchaTitle)) {
                    profitcentrCaptchaClick(capchaImgElements, "изображения с девушками");
                } else if ("Отметьте изображения с машинами".equalsIgnoreCase(capchaTitle)) {
                    profitcentrCaptchaClick(capchaImgElements, "изображения с машинами");
                } else if ("Отметьте изображения с животными".equalsIgnoreCase(capchaTitle)) {
                    profitcentrCaptchaClick(capchaImgElements, "изображения с животными");
                } else {
                    for (WebElement element : capchaImgElements) {
                        String style = element.getAttribute("style");
                        String url = style.substring(style.indexOf("(")+2, style.indexOf(")")-1);
                        System.out.println("url => " + url);
                    }
                }
                throw new RuntimeException("CAPTCHA ENABLED");
            }

            WebElement filterLine = driver.findElement(By.id("maincolumn")).findElement(By.className("filterlines"));
            List<WebElement> filterLineCategories = filterLine.findElements(By.tagName("a"));
            WebElement subscribeCategory = null;
            for (WebElement category : filterLineCategories) {
                if (name.equalsIgnoreCase(category.getText())) {
                    subscribeCategory = category;
                }
            }
            Thread.sleep(2000);
            subscribeCategory.click();
            Thread.sleep(2000);
        } catch (Exception ex) {
            System.out.println(ex);
            throw new RuntimeException(ex);
        }
    }

    @Override
    public String startSubscribeTask(WebDriver driver) {
        try {
            if (driver.findElements(By.id("work-youtube")).size() == 0) {
                System.out.println("maybe list empty");
                Thread.sleep(3000);
                openMenu(driver, "Подписки");
                Thread.sleep(3000);
                if (driver.findElements(By.id("work-youtube")).size() == 0) {
                    throw new RuntimeException("Subscribe list empty");
                }
            }
            WebElement table = driver.findElement(By.id("work-youtube")).findElement(By.tagName("table"));
            String tableId = table.getAttribute("id");
            String taskId = tableId.split("-")[2];
            List<WebElement> elements = driver.findElement(By.id("start-podp-" + taskId)).findElements(By.tagName("span"));
            WebElement startBtn1 = null;
            String channelUrl = null;
            for (WebElement element : elements) {
                if (element.getAttribute("title") != null && !element.getAttribute("title").isEmpty()) {
                    startBtn1 = element;
                    channelUrl = element.getAttribute("title");
                }
            }
            Thread.sleep(2000);
            startBtn1.click();
            Thread.sleep(2000);

            if (driver.findElements(By.className("youtube-error")).size() > 0) {
                WebElement error = driver.findElement(By.className("youtube-error"));
                if ("Задание уже начали выполнять необходимое кол-во пользователей".equalsIgnoreCase(error.getText())) {
                    List<WebElement> claimRow = driver.findElement(By.className("podp_"+taskId)).findElements(By.tagName("a"));
                    WebElement claimBtn = null;
                    for (WebElement element : claimRow) {
                        if ("Подать жалобу на площадку".equalsIgnoreCase(element.getAttribute("title"))) {
                            claimBtn = element;
                        }
                    }
                    claimBtn.click();
                    Thread.sleep(2000);

                    WebElement popup = driver.findElement(By.id("popup"));
                    List<WebElement> categories = popup.findElements(By.tagName("input"));
                    WebElement claimCategory = null;
                    for (WebElement category : categories) {
                        System.out.println("category text => " + category.getAttribute("value"));
                        if ("Видео с ограниченным доступом".equalsIgnoreCase(category.getAttribute("value"))) {
                            claimCategory = category;
                        }
                    }
                    claimCategory.click();
                    Thread.sleep(2000);
                }
                throw new RuntimeException(error.getText());
            }
            WebElement startBtn2 = driver.findElement(By.id("ads-lk-" + taskId)).findElement(By.tagName("span"));
            startBtn2.click();
            Thread.sleep(2000);
            return channelUrl;
        } catch (Exception ex) {
            System.out.println(ex);
            throw new RuntimeException(ex);
        }
    }

    @Override
    public String switchToNextTaskPage(WebDriver driver, String profisprintWindow) {
        String nextWindow = "";
        try {
            Thread.sleep(4000);
            for (String windowHandle : driver.getWindowHandles()) {
                if(!profisprintWindow.equalsIgnoreCase(windowHandle)) {
                    nextWindow = windowHandle;
                    System.out.println("nextWindow -> " + nextWindow);
                    driver.switchTo().window(nextWindow);
                }
            }
            return nextWindow;
        } catch (Exception ex) {
            System.out.println(ex);
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void startEmbeddedVideo(WebDriver driver) {
        try {
            WebElement timerElement = driver.findElement(By.id("timer"));
            Integer time = (Integer.parseInt(timerElement.getText()) + 10) * 1000;
            System.out.println("time to wait -> " + time);

            WebElement menu = driver.findElement(By.id("video-start"));
            menu.click();
            Thread.sleep(time);
        } catch (Exception ex) {
            System.out.println(ex);
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void openYoutubePageAndSubscribe(WebDriver driver, String channelUrl, String profisprintWindow, String oceanwmWindow) {
        try {
            String youtubeWindow = "";
            WebElement orangeBtnStart = driver.findElement(By.className("podp-go")).findElement(By.tagName("a"));
            orangeBtnStart.click();
            Thread.sleep(2000);

            for (String windowHandle : driver.getWindowHandles()) {
                if(!profisprintWindow.equalsIgnoreCase(windowHandle) && !oceanwmWindow.equalsIgnoreCase(windowHandle)) {
                    youtubeWindow = windowHandle;
                    System.out.println("youtubeWindow -> " + youtubeWindow);
                    driver.switchTo().window(youtubeWindow);
                }
            }
            driver.get(channelUrl);
            Thread.sleep(3000);

            WebElement youtubeSubscribeBtn = driver.findElement(By.id("subscribe-button-shape"));
            youtubeSubscribeBtn.click();
            Thread.sleep(3000);
            driver.close();

            driver.switchTo().window(oceanwmWindow);
            Thread.sleep(3000);
        } catch (Exception ex) {
            System.out.println(ex);
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void selectAnswerAndConfirmTask(WebDriver driver, String channelUrl) {
        try {
            WebElement selectElement = driver.findElement(By.name("otv"));
            Select select = new Select(selectElement);
            select.selectByValue(channelUrl.substring(channelUrl.indexOf("channel/")+8));

            Thread.sleep(2000);

            WebElement confirmTask = driver.findElement(By.className("butt-nw"));
            confirmTask.click();

            Thread.sleep(2000);
            driver.close();
        } catch (Exception ex) {
            System.out.println(ex);
            throw new RuntimeException(ex);
        }
    }

    @Override
    public String startVideoTask(WebDriver driver) {
        try {
            if (driver.findElements(By.id("work-youtube")).size() == 0) {
                System.out.println("maybe list empty");
                Thread.sleep(3000);
                openMenu(driver, "Видео");
                Thread.sleep(3000);
                if (driver.findElements(By.id("work-youtube")).size() == 0) {
                    throw new RuntimeException("Video list empty");
                }
            }

            List<WebElement> table = driver.findElement(By.id("work-youtube")).findElements(By.tagName("table"));
            WebElement row = table.get(0);
            String tableId = row.getAttribute("id");
            String taskId = tableId.split("-")[2];
            List<WebElement> elements = driver.findElement(By.id("start-ads-" + taskId)).findElements(By.tagName("span"));
            WebElement startBtn1 = null;
            for (WebElement element : elements) {
                if (element.getAttribute("title") != null && !element.getAttribute("title").isEmpty()) {
                    startBtn1 = element;
                }
            }
            Thread.sleep(2000);
            startBtn1.click();
            Thread.sleep(2000);
            WebElement startBtn2 = driver.findElement(By.id("ads-lk-" + taskId)).findElement(By.tagName("span"));
            startBtn2.click();
            Thread.sleep(2000);
            return null;
        } catch (Exception ex) {
            System.out.println(ex);
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void openYoutubePageAndStartVideo(WebDriver driver, String profisprintWindow, String videoWindow) {
        try {
            WebElement timerElement = driver.findElement(By.id("tmr"));
            Integer time = (Integer.parseInt(timerElement.getText()) + 10) * 1000;
            System.out.println("time to wait -> " + time);

            WebElement menu = driver.findElement(By.id("video-start"));
            menu.click();
            Thread.sleep(time);
            System.out.println("DONE");
            WebElement confirmBtn = driver.findElement(By.id("capcha-tr-block")).findElement(By.tagName("button"));
            confirmBtn.click();
            Thread.sleep(3000);
            driver.close();
            driver.switchTo().window(profisprintWindow);
            Thread.sleep(3000);
        } catch (Exception ex) {
            System.out.println(ex);
            throw new RuntimeException(ex);
        }
    }

    private void profitcentrCaptchaClick(List<WebElement> capchaImgElements, String category) {
        for (int i = 0; i < capchaImgElements.size(); i++) {
            String style = capchaImgElements.get(i).getAttribute("style");
            String url = style.substring(style.indexOf("(")+2, style.indexOf(")")-1);
            System.out.println("url => " + url);
            boolean value = captchaService.isImageInGroup(url, category);
            System.out.println("Value "+i+ " should be clicked-> "+value);
            if (value) {
                capchaImgElements.get(i).click();
            }
        }
    }
}
