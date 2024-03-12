package com.profisprint.service.impl;

import com.profisprint.model.simpleTask.DataTaskDto;
import com.profisprint.service.*;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Date;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class AutoTaskServiceImpl implements AutoTaskService {

    @Value("classpath:chromedriver/chromedriver.exe")
    Resource chromeDriverFile;

    @Value("classpath:Chrome-bin/chrome.exe")
    Resource chromiumFile;

    private final TaskService taskService;
    private final YoutubeService youtubeService;
    private final ProfitcentrService profitcentrService;
    private final SeoFastService seoFastService;
    private final AvisoService avisoService;
    private final LosenaService losenaService;
    private final WmrfastService wmrfastService;
    private final SurfclickService surfclickService;

    private final CaptchaService captchaService;
    private WebDriver driver;
    private ChromeOptions options;

    @PostConstruct
    public void init() {
        try {
            System.setProperty("webdriver.chrome.driver", chromeDriverFile.getFile().getAbsolutePath());
            options = new ChromeOptions();
            options.addArguments("user-data-dir=C:\\Users\\scurto\\AppData\\Local\\Chromium\\User Data\\");
            options.addArguments("profile-directory=Profile 1");
            options.setBinary(chromiumFile.getFile().getAbsolutePath());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void driverConfig() {
        driver = new ChromeDriver(options);
//        driver.manage().window().maximize();
    }

    public void testOpen() {
        driver.get("https://www.google.com/");
    }

    public void testClose() {
        driver.quit();
    }

    @Override
    public void startTask() {
        String taskId = "729950";
        DataTaskDto taskDto = taskService.getDataByTaskId(taskId);
        String lastUsedVideos = taskService.findLastUsedVideos(taskId);

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://profitcentr.com/work-task-read?adv=729950");
        validateTaskInfo(driver);

//        someTests(driver);
    }

    private void validateTaskInfo(WebDriver driver) {
        WebElement taskId = driver.findElement(By.id("maincolumn"))
                .findElement(By.className("blok"))
                .findElement(By.tagName("h1"));
        System.out.println(taskId.getText()); /*Задание № 729950*/

        WebElement taskDescription = driver.findElement(By.id("maincolumn"))
                .findElement(By.className("maintask"));
        String descriptionText = "Если вы из России, меняйте IP, а для других стран используйте только родной!\n" + "\n" + "Перед выполнением чистим куки! (ctrl+shift+delete)\n" + "\n" + "1) В поиске Ютуб вбиваем: nikatmg\n" + "\n" + "2) Находим канал : NikaTMG (https://prnt.sc/17mjyfq)\n" + "\n" + "3) Смотрим 3-4 свежих видео ( 30-40 сек)\n" + "\n" + "4) Кликаем по рекламе на 3 последнее загруженное видео (gclid) , ждем полной загрузки и делаете 2-3 перехода не меньше 30 сек каждый! (имитируем активность)\n" + "\n" + "Рекламы должны быть разные!\n" + "\n" + "Длительность проверяю!\n" + "\n" + "Спасибо Вам за качественное выполнение;)\n" + "\n" + "Посмотреть все задания автора\n" + "https://profitcentr.com/work-task?id_rekl=gamersh";
        System.out.println("Description matched => " + descriptionText.equals(taskDescription.getText()));

        WebElement taskRequirements = driver.findElement(By.id("maincolumn"))
                .findElement(By.className("yellowbk"));

        String requirementsText = "1) Ссылки на 3-4 видео\n" + "2) Ссылки на 3 разных рекламный сайт + переходы\n" + "\n" + "Или делаете скриншот истории браузера\n" + "\n" + "Меняйте IP, только если вы из России!!!";
        System.out.println("Requirements matched => " + requirementsText.equals(taskRequirements.getText()));
    }

    public void profitcentrYoutubeSubscribe() {
        try {
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.get("https://profitcentr.com");

            String profisprintWindow = driver.getWindowHandle();
            String oceanwmWindow = "";
            String youtubeWindow = "";
            System.out.println("profisprintWindow -> " + profisprintWindow);

            profitcentrService.openCategory(driver, "YouTube");
            profitcentrService.openMenu(driver, "Подписки");
            String channelUrl = profitcentrService.startSubscribeTask(driver);
            System.out.println("channelUrl -> " + channelUrl);
            oceanwmWindow = profitcentrService.switchToNextTaskPage(driver, profisprintWindow);
            profitcentrService.startEmbeddedVideo(driver);
            profitcentrService.openYoutubePageAndSubscribe(driver, channelUrl, profisprintWindow, oceanwmWindow);
            profitcentrService.selectAnswerAndConfirmTask(driver, channelUrl);
        } catch (RuntimeException ex) {
            System.out.println("profitcentr exception: " + ex);
        }

    }

    @Override
    public void profitcentrYoutubeVideo() {
        driverConfig();
        profitcentrYoutubeVideoProcess();
    }

    @Override
    public void avisoYoutubeVideo() {
        driverConfig();
        avisoYoutubeVideoProcess();
    }

    @Override
    public void losenaYoutubeVideo() throws RuntimeException {
        driverConfig();
        losenaYoutubeVideoProcess();
    }

    @Override
    public void wmrfastYoutubeVideo() {
        driverConfig();
        wmrfastYoutubeVideoProcess();
    }

    @Override
    public void surfclickYoutubeVideo() {
        driverConfig();
        surfclickYoutubeVideoProcess();
    }

    @Override
    public void seofastYoutubeSubscribe() {
        try {
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.get("https://seo-fast.ru");
            String seofastWindow = driver.getWindowHandle();
            seoFastService.openCategory(driver, "YouTube");
            seoFastService.openMenu(driver, "Подписки");
            WebElement channelElement = seoFastService.openEmbeddedVideoPage(driver);
            seoFastService.startEmbeddedVideo(driver);
            String chanelTitle = seoFastService.openYoutubePageAndSubscribe(driver, seofastWindow, channelElement);
            seoFastService.selectAnswerAndConfirmTask(driver, chanelTitle);
        } catch (RuntimeException ex) {
            System.out.println("seofast exception: " + ex);
        }
    }

    public void surfclickYoutubeVideoProcess() {
        try {
            driver.get("https://serfclick.net/");
            String surfclickWindow = driver.getWindowHandle();
            String videoWindow = "";
            String youtubeWindow = "";
            System.out.println("surfclickWindow -> " + surfclickWindow);
            surfclickService.openCategory(driver, "https://serfclick.net/user/vsurf");//Youtube
            String taskId = surfclickService.startVideoTask(driver);
            videoWindow = surfclickService.switchToNextTaskPage(driver, surfclickWindow);
            surfclickService.openYoutubePageAndStartVideo(driver, surfclickWindow, videoWindow, taskId);
        } catch (RuntimeException ex) {
            System.out.println("wmrfast exception: " + ex);
        }
    }

    public void wmrfastYoutubeVideoProcess() {
        try {
            driver.get("https://wmrfast.com/");
            String wmrfastWindow = driver.getWindowHandle();
            String videoWindow = "";
            String youtubeWindow = "";
            System.out.println("wmrfastWindow -> " + wmrfastWindow);
            wmrfastService.openCategory(driver, "Видео YouTube");
            String time = wmrfastService.startVideoTask(driver);
            videoWindow = wmrfastService.switchToNextTaskPage(driver, wmrfastWindow);
            wmrfastService.openYoutubePageAndStartVideo(driver, wmrfastWindow, videoWindow, time);
        } catch (RuntimeException ex) {
            System.out.println("wmrfast exception: " + ex);
        }
    }

    public void losenaYoutubeVideoProcess() {
        try {
            driver.get("https://losena.net/");
            String losenaWindow = driver.getWindowHandle();
            String videoWindow = "";
            String youtubeWindow = "";
            System.out.println("losenaWindow -> " + losenaWindow);
            losenaService.openCategory(driver, "YouTube");
            losenaService.startVideoTask(driver);
            videoWindow = losenaService.switchToNextTaskPage(driver, losenaWindow);
            losenaService.openYoutubePageAndStartVideo(driver, losenaWindow, videoWindow);
        } catch (RuntimeException ex) {
            System.out.println("aviso exception: " + ex);
        }
    }


    public void avisoYoutubeVideoProcess() {
        try {
            driver.get("https://aviso.bz");
            String avisoWindow = driver.getWindowHandle();
            String videoWindow = "";
            String youtubeWindow = "";
            System.out.println(new Date() + " - avisoWindow -> " + avisoWindow);
            avisoService.openCategory(driver, "YouTube");
            avisoService.openMenu(driver, "Дорогие");
            avisoService.startVideoTask(driver);
            videoWindow = avisoService.switchToNextTaskPage(driver, avisoWindow);
            avisoService.openYoutubePageAndStartVideo(driver, avisoWindow, videoWindow);
        } catch (RuntimeException ex) {
            System.out.println("aviso exception: " + ex);
        }
    }

    public void avisoYoutubeVideoProcess(String menu) {
        try {
            driver.get("https://aviso.bz");
            String avisoWindow = driver.getWindowHandle();
            String videoWindow = "";
            String youtubeWindow = "";
            System.out.println(new Date() + " - avisoWindow -> " + avisoWindow);
            avisoService.openCategory(driver, "YouTube");
            avisoService.openMenu(driver, menu);
            avisoService.startVideoTask(driver);
            videoWindow = avisoService.switchToNextTaskPage(driver, avisoWindow);
            avisoService.openYoutubePageAndStartVideo(driver, avisoWindow, videoWindow);
        } catch (RuntimeException ex) {
            System.out.println("aviso exception: " + ex);
        }
    }

    public void profitcentrYoutubeVideoProcess() {
        try {
            driver.get("https://profitcentr.com");
            String profisprintWindow = driver.getWindowHandle();
            String videoWindow = "";
            String youtubeWindow = "";
            System.out.println(new Date() + " - profisprintWindow -> " + profisprintWindow);
            profitcentrService.openCategory(driver, "YouTube");
            profitcentrService.openMenu(driver, "Видео");
            profitcentrService.startVideoTask(driver);
            videoWindow = profitcentrService.switchToNextTaskPage(driver, profisprintWindow);
            profitcentrService.openYoutubePageAndStartVideo(driver, profisprintWindow, videoWindow);
        } catch (RuntimeException ex) {
            System.out.println("profitcentr exception: " + ex);
        }
    }

    @Override
    public void test() {
        try {
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.get("https://oceanwm.ru/search-video.php?id=3956353&hash=f0ca6ea21049692acca152dd60c10d38&code=9906");
            Thread.sleep(2000);

            WebElement timerElement = driver.findElement(By.id("timer"));
            Integer time = (Integer.parseInt(timerElement.getText()) + 10) * 1000;
            System.out.println("time to wait -> " + time);

            WebElement menu = driver.findElement(By.id("video-start"));
            menu.click();
            Thread.sleep(time);

            WebElement orangeBtnStart = driver.findElement(By.className("podp-go")).findElement(By.tagName("a"));
            orangeBtnStart.click();

//            document.getElementsByClassName('podp-go').get tag 'a'


        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    @Override
    public void test2() {
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://profitcentr.com");

        String profisprintWindow = driver.getWindowHandle();
        String oceanwmWindow = "";
        String youtubeWindow = "";
        System.out.println("profisprintWindow -> " + profisprintWindow);

        profitcentrService.openCategory(driver, "YouTube");
//        profitcentrService.openMenu(driver, "Подписки");
        try {
            String capchaTitle = "";
            if (driver.findElement(By.id("maincolumn")).findElements(By.className("out-capcha-title")).size() > 0) {
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
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    @Override
    public void test3() {
        try {
            driverConfig();
            profitcentrYoutubeVideoProcess();
            Thread.sleep(2000);
            profitcentrYoutubeVideoProcess();
            avisoYoutubeVideoProcess("Все");
            Thread.sleep(2000);
            avisoYoutubeVideoProcess("Все");
            losenaYoutubeVideoProcess();
            Thread.sleep(2000);
            losenaYoutubeVideoProcess();
            wmrfastYoutubeVideoProcess();
            Thread.sleep(2000);
            wmrfastYoutubeVideoProcess();
        } catch (Exception ex) {
            System.out.println(ex);
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

    private void someTests(WebDriver driver) {
        //        start task
//        WebElement startBtn = driver.findElement(By.name("goform")).findElement(By.className("btn_big_green"));
//        System.out.println(startBtn);
//        startBtn.click();

//        add text to task
//        WebElement comment = driver.findElement(By.id("coment"));
//        comment.sendKeys("your value");


//        try {
//            initiate stop task
//            WebElement stopTaskBtn = driver.findElement(By.className("btn_big_red"));
//            stopTaskBtn.click();
//            Thread.sleep(4000);

//            popup before stop task
//            WebElement popup = driver.findElement(By.id("popup"));
//            System.out.println(popup);

//            TODO need to check
//            Thread.sleep(2000);
//            WebElement btn_red = popup.findElement(By.cssSelector(".btn.red"));
//            btn_red.click();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        driver.quit();
    }

    //    TODO not work yet
    private void testLogin() throws InterruptedException {
        WebElement loginButtonsDiv = driver.findElement(By.className("tbuttons"));
        List<WebElement> loginButtons = loginButtonsDiv.findElements(By.tagName("a"));
        WebElement loginBtn = null;
        for (WebElement button : loginButtons) {
            if ("https://profitcentr.com/login".equalsIgnoreCase(button.getAttribute("href"))) {
                loginBtn = button;
            }
        }
        Thread.sleep(2000);
        loginBtn.click();
        //        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//        WebElement dynamicElement = (new WebDriverWait(driver, 10))
//                .until(ExpectedConditions.presenceOfElementLocated(By.id("dynamicElement_id")));
    }
}
