package com.profisprint.service.impl;

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
public class WmrfastServiceImpl implements WmrfastService {

    @Override
    public void openCategory(WebDriver driver, String name) {
        try {
            WebElement menu = driver.findElement(By.id("m_bl2"));
            List<WebElement> categories = menu.findElements(By.tagName("a"));
            WebElement youtubeCategory = null;
            for (WebElement category : categories) {
                if (name.equalsIgnoreCase(category.getText())) {
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
            List<WebElement> table = driver.findElements(By.className("work-serf"));
            WebElement row = table.get(0);
            WebElement startBtn1 = row.findElement(By.className("serf_hash"));
            List<WebElement> elements = row.findElements(By.className("clickprice"));
            String timeValue = elements.get(1).getText();
            String time = timeValue.split(" ")[0];
            Thread.sleep(2000);
            startBtn1.click();
            Thread.sleep(4000);
            return time;
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
    public void openYoutubePageAndStartVideo(WebDriver driver, String wmrfastWindow, String videoWindow, String time) {
        try {
            Integer timer = (Integer.parseInt(time) + 10) * 1000;
            System.out.println("time to wait -> " + timer);

            WebElement menu = driver.findElement(By.id("v_y"));
            menu.click();
            Thread.sleep(timer);
            System.out.println("DONE");
            List<WebElement> elements = driver.findElement(By.id("start-video")).findElements(By.tagName("td"));
            WebElement confirmBtn = elements.get(0).findElement(By.tagName("a"));
            confirmBtn.click();
            Thread.sleep(3000);
            driver.close();
            driver.switchTo().window(wmrfastWindow);
            Thread.sleep(3000);
        } catch (Exception ex) {
            System.out.println(ex);
            throw new RuntimeException(ex);
        }
    }
}
