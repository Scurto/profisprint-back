package com.profisprint.service.impl;

import com.profisprint.service.SeoFastService;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;
import java.util.stream.Collectors;

@Slf4j
@Service
public class SeoFastServiceImpl implements SeoFastService {

    @Override
    public void openCategory(WebDriver driver, String name) {

        try {
            WebElement menu = driver.findElement(By.id("menu_g1"));
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
            if (driver.findElements(By.id("capcha")).size() > 0) {
                throw new RuntimeException("CAPTCHA ENABLED");
            }
            WebElement subscribeCategory = null;
            List<WebElement> filterLineCategories = driver.findElements(By.className("m_stc"));
            for (WebElement filterLineCategory : filterLineCategories) {
                for (WebElement category : filterLineCategory.findElements(By.tagName("a"))) {
                    if (name.equalsIgnoreCase(category.getText())) {
                        subscribeCategory = category;
                    }
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
    public WebElement openEmbeddedVideoPage(WebDriver driver) {
        try {
            List<WebElement> tableRows = driver.findElement(By.className("list_rek_table")).findElements(By.xpath("//tr[contains(@id,'youtube_v')]"));
//            List<WebElement> tableRows = driver.findElements(By.xpath("//tr[contains(@id,'youtube_v')]"));
            HashMap<String, Double> taskMap = new HashMap<>();
            for (WebElement row : tableRows) {
                String taskId = row.getAttribute("id").substring(row.getAttribute("id").indexOf("youtube_v")+9);
                if (row.findElements(By.className("price_pay")).size() > 0) {
                    WebElement pricePay = row.findElement(By.className("price_pay"));
                    Double price = Double.valueOf(pricePay.getText().replace("руб.", "").trim());
                    if (Double.compare(price, Double.parseDouble("0.19")) > 0) {
                        taskMap.put(taskId, price);
                    }
                }
            }
            Map<String, Double> sortedMap = sortByValue(taskMap);
            String id = sortedMap.keySet().stream().findFirst().get();
            System.out.println("START");
            WebElement task = driver.findElement(By.id("start_youtube"+id)).findElement(By.className("surf_ckick"));
            task.click();
            Thread.sleep(3000);
            WebElement startTask = driver.findElement(By.id("start_youtube"+id)).findElement(By.className("status_link_youtube"));
            startTask.click();
            Thread.sleep(3000);
            return driver.findElement(By.id("moder_y"+id)).findElement(By.tagName("a"));
        } catch (Exception ex) {
            System.out.println(ex);
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void startEmbeddedVideo(WebDriver driver) {
        try {
            WebElement timerElement = driver.findElement(By.id("timer_see"));
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
    public String openYoutubePageAndSubscribe(WebDriver driver, String seofastWindow, WebElement channelElement) {
        try {
            String youtubeBaseWindow = "";
            String youtubeWindow = "";
            WebElement youtubeBtnStart = driver.findElement(By.id("button_y"));
            youtubeBtnStart.click();
            Thread.sleep(3000);

            for (String windowHandle : driver.getWindowHandles()) {
                if (!seofastWindow.equalsIgnoreCase(windowHandle)) {
                    youtubeBaseWindow = windowHandle;
                    System.out.println("youtubeBaseWindow -> " + youtubeBaseWindow);
                }
            }
            driver.switchTo().window(youtubeBaseWindow);
            driver.close();
            driver.switchTo().window(seofastWindow);
            channelElement.click();
            Thread.sleep(3000);
            for (String windowHandle : driver.getWindowHandles()) {
                if (!seofastWindow.equalsIgnoreCase(windowHandle)) {
                    youtubeWindow = windowHandle;
                    System.out.println("youtubeWindow -> " + youtubeWindow);
                }
            }
            driver.switchTo().window(youtubeWindow);
            WebElement chanelTitleElement = driver.findElement(By.id("text"));
            String chanelTitle = chanelTitleElement.getText();
            System.out.println(chanelTitle);
            WebElement youtubeSubscribeBtn = driver.findElement(By.id("subscribe-button-shape"));
            youtubeSubscribeBtn.click();
            Thread.sleep(2000);
            driver.close();

            driver.switchTo().window(seofastWindow);
            Thread.sleep(6000);
            return chanelTitle;
        } catch (Exception ex) {
            System.out.println(ex);
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void selectAnswerAndConfirmTask(WebDriver driver, String chanelTitle) {
        try {
            Thread.sleep(6000);
            WebElement selectElement = driver.findElement(By.id("author_channel"));
            Select select = new Select(selectElement);
            select.selectByValue(chanelTitle);

            Thread.sleep(2000);

            WebElement confirmTask = driver.findElement(By.id("select_y")).findElement(By.tagName("div"));
            System.out.println("confirmTask=> " + confirmTask.getText());
            confirmTask.click();
//
//            Thread.sleep(2000);
//            driver.close();
        } catch (Exception ex) {
            System.out.println(ex);
            throw new RuntimeException(ex);
        }
    }

    public static HashMap<String, Double> sortByValue(HashMap<String, Double> hm) {
        List<Map.Entry<String, Double> > list = new LinkedList<Map.Entry<String, Double> >(hm.entrySet());
        Collections.sort(list, (o1, o2) -> (o2.getValue()).compareTo(o1.getValue()));

        // put data from sorted list to hashmap
        HashMap<String, Double> temp = new LinkedHashMap<>();
        for (Map.Entry<String, Double> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
}
