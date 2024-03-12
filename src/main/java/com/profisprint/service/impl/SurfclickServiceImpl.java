package com.profisprint.service.impl;

import com.profisprint.service.SurfclickService;
import com.profisprint.service.WmrfastService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class SurfclickServiceImpl implements SurfclickService {

    @Override
    public void openCategory(WebDriver driver, String name) {
        try {
            WebElement menu = driver.findElement(By.id("user_menu"));
            List<WebElement> categories = menu.findElements(By.tagName("a"));
            WebElement youtubeCategory = null;
            for (WebElement category : categories) {
                if (name.equalsIgnoreCase(category.getAttribute("href"))) {
                    youtubeCategory = category;
                }
            }
            Thread.sleep(2000);
            youtubeCategory.click();
            Thread.sleep(4000);
        } catch (Exception ex) {
            System.out.println(ex);
            throw new RuntimeException(ex);
        }
    }

    @Override
    public String startVideoTask(WebDriver driver) {
        try {
            List<WebElement> table = driver.findElements(By.className("serf-link"));
            WebElement startBtn1 = table.get(0);
            String attributeOnClick = startBtn1.getAttribute("onclick");
            System.out.println(attributeOnClick);
            Thread.sleep(2000);
            startBtn1.click();
            Thread.sleep(4000);
            return "123";
        } catch (Exception ex) {
            System.out.println(ex);
            throw new RuntimeException(ex);
        }
    }

    @Override
    public String switchToNextTaskPage(WebDriver driver, String videoWindow) {
        String nextWindow = "";
        try {
            Thread.sleep(4000);
            for (String windowHandle : driver.getWindowHandles()) {
                if(!videoWindow.equalsIgnoreCase(windowHandle)) {
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
    public void openYoutubePageAndStartVideo(WebDriver driver, String surfclickWindow, String videoWindow, String taskId) {
        try {
            WebElement timerElement = driver.findElement(By.id("tmr"));
            String startTimer = timerElement.getText();
            Integer time = (Integer.parseInt(startTimer)) * 1000;
            System.out.println("time to wait -> " + time);
            WebElement menu = driver.findElement(By.id("video-start"));
            menu.click();
            Thread.sleep(5*1000);
            WebElement timerElementCheck = driver.findElement(By.id("tmr"));
            if (timerElementCheck.getText().equalsIgnoreCase(startTimer)) {
                System.out.println("VIDEO BLOCKED");
            } else {
                Thread.sleep(time + 5*1000);
                System.out.println("DONE");
                WebElement confirmBtn = driver.findElement(By.id("capcha-tr-block")).findElement(By.tagName("button"));
                confirmBtn.click();
                Thread.sleep(3000);
                driver.close();
                driver.switchTo().window(surfclickWindow);
                Thread.sleep(3000);
            }
        } catch (Exception ex) {
            System.out.println(ex);
            throw new RuntimeException(ex);
        }
    }
}
