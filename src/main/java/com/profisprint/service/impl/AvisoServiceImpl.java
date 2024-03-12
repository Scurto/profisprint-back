package com.profisprint.service.impl;

import com.profisprint.service.AvisoService;
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
public class AvisoServiceImpl implements AvisoService {

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
            WebElement filterLine = driver.findElement(By.id("contentwrapper")).findElement(By.className("menu-task-work"));
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
    public String startVideoTask(WebDriver driver) {
        try {
//            if (driver.findElements(By.id("work-youtube")).size() == 0) {
//                System.out.println("maybe list empty");
//                Thread.sleep(3000);
//                openMenu(driver, "Видео");
//                Thread.sleep(3000);
//                if (driver.findElements(By.id("work-youtube")).size() == 0) {
//                    throw new RuntimeException("Video list empty");
//                }
//            }

            List<WebElement> table = driver.findElements(By.className("work-serf"));
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
//            WebElement startBtn2 = driver.findElement(By.id("ads-lk-" + taskId)).findElement(By.tagName("span"));
//            startBtn2.click();
//            Thread.sleep(2000);
            return null;
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
    public void openYoutubePageAndStartVideo(WebDriver driver, String avisoWindow, String videoWindow) {
        try {
            WebElement timerElement = driver.findElement(By.id("tmr"));
            Integer time = (Integer.parseInt(timerElement.getText()) + 10) * 1000;
            System.out.println("time to wait -> " + time);

            WebElement menu = driver.findElement(By.id("video-start"));
            menu.click();
            Thread.sleep(time);
            System.out.println("DONE");
//            WebElement confirmBtn = driver.findElement(By.id("capcha-tr-block")).findElement(By.tagName("button"));
//            confirmBtn.click();
            Thread.sleep(3000);
            driver.close();
            driver.switchTo().window(avisoWindow);
            Thread.sleep(3000);
        } catch (Exception ex) {
            System.out.println(ex);
            throw new RuntimeException(ex);
        }
    }
}
