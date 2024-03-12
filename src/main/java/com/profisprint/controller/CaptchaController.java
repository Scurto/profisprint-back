package com.profisprint.controller;

import ch.qos.logback.core.boolex.EvaluationException;
import com.profisprint.model.captcha.CaptchaModel;
import com.profisprint.service.CaptchaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@Slf4j
@RequestMapping("/captcha")
public class CaptchaController {

    @Autowired
    private CaptchaService captchaService;

    private final String PATH_TO_TEMPORARY = System.getProperty("user.dir") + "/src/main/resources/captcha/temporary/";

    @PostMapping(value = "/addToCaptcha")
    public String addToCaptcha(@RequestBody CaptchaModel model) throws Exception {
        List<String> collect = model.getImageList().stream().map(value -> "url(\"" + value + "\")").collect(Collectors.toList());
        model.setImageList(new ArrayList<>(collect));

        for (String imageFullEncoded : model.getImageList()) {
            String imageEncoded = imageFullEncoded.substring(27, imageFullEncoded.length() - 2);
            byte[] decodedImg = Base64.getDecoder().decode(imageEncoded);
            String temporaryFileName = UUID.randomUUID().toString().replace("-", "") + ".jpg";
            File temporaryDestinationFile = new File(PATH_TO_TEMPORARY + temporaryFileName);
            if (temporaryDestinationFile.createNewFile()) {
                Files.write(temporaryDestinationFile.toPath(), decodedImg);

                if (captchaService.isFileCorrespondCondition(temporaryDestinationFile, model.getTitle())) {
                    System.out.println(temporaryDestinationFile.getName() + " IS IN " + model.getTitle() + " @@@@@@@@@@@@@");
                } else {
                    System.out.println(temporaryDestinationFile.getName() + " IS NOT IN " + model.getTitle() + " %%%%%%%%%%%%%%%%");
                    String condition = captchaService.getCorrectCondition(model.getTitle());
                    long filesCount = Files.list(Path.of(System.getProperty("user.dir") + "/src/main/resources/captcha/" + condition)).count();

                    String fileName = condition + filesCount + ".jpg";
                    File destinationFile = new File(System.getProperty("user.dir") + "/src/main/resources/captcha/" + condition + "/" + fileName);
                    Files.write(destinationFile.toPath(), decodedImg);
                }
            } else {
                System.out.println("File already exists.");
            }
        }

        return "OK";
    }

    @GetMapping(value = "/test")
    public String test2() throws Exception {
        CaptchaModel model = new CaptchaModel();
        model.setTitle("изображения с цветами");
        ArrayList<String> imageList = new ArrayList<>();
        imageList.add("url(\"data:image/jpg;base64,/9j/4AAQSkZJRgABAQAASABIAAD/4QCiRXhpZgAATU0AKgAAAAgABgESAAMAAAABAAEAAAEaAAUAAAABAAAAVgEbAAUAAAABAAAAXgEoAAMAAAABAAIAAAExAAIAAAAVAAAAZodpAAQAAAABAAAAfAAAAAAAAABIAAAAAQAAAEgAAAABUGl4ZWxtYXRvciBQcm8gMy41LjYAAAACoAIABAAAAAEAAABQoAMABAAAAAEAAABQAAAAAP/hCZ5odHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IlhNUCBDb3JlIDYuMC4wIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bXA6TWV0YWRhdGFEYXRlPSIyMDI0LTAyLTA3VDIzOjQ0OjI4KzAzOjAwIiB4bXA6Q3JlYXRvclRvb2w9IlBpeGVsbWF0b3IgUHJvIDMuNS42Ii8+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+ICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgPD94cGFja2V0IGVuZD0idyI/PgD/7QA4UGhvdG9zaG9wIDMuMAA4QklNBAQAAAAAAAA4QklNBCUAAAAAABDUHYzZjwCyBOmA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\")");
        model.setImageList(imageList);

        for (String imageFullEncoded : model.getImageList()) {
            String imageEncoded = imageFullEncoded.substring(27, imageFullEncoded.length() - 2);
            byte[] decodedImg = Base64.getDecoder().decode(imageEncoded);
            String temporaryFileName = UUID.randomUUID().toString().replace("-", "") + ".jpg";
            File temporaryDestinationFile = new File(PATH_TO_TEMPORARY + temporaryFileName);
            if (temporaryDestinationFile.createNewFile()) {
                Files.write(temporaryDestinationFile.toPath(), decodedImg);

                if (captchaService.isFileCorrespondCondition(temporaryDestinationFile, model.getTitle())) {
                    System.out.println(temporaryDestinationFile.getName() + " IS IN " + model.getTitle() + " @@@@@@@@@@@@@");
                } else {
                    System.out.println(temporaryDestinationFile.getName() + " IS NOT IN " + model.getTitle() + " %%%%%%%%%%%%%%%%");
                    String condition = captchaService.getCorrectCondition(model.getTitle());
                    long filesCount = Files.list(Path.of(System.getProperty("user.dir") + "/src/main/resources/captcha/" + condition)).count();
                    ;
                    String fileName = condition + filesCount + ".jpg";
                    File destinationFile = new File(System.getProperty("user.dir") + "/src/main/resources/captcha/" + condition + "/" + fileName);
                    Files.write(destinationFile.toPath(), decodedImg);
                }
            } else {
                System.out.println("File already exists.");
            }
        }

        return "OK";
    }
}
