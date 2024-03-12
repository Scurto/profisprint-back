package com.profisprint.service.impl;

import com.profisprint.service.CaptchaService;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Comparator;
import java.util.UUID;

@Service
public class CaptchaServiceImpl implements CaptchaService {

    private final String PATH_TO_TEMPORARY = System.getProperty("user.dir") + "/src/main/resources/captcha/temporary/";

    @Override
    public double getDifference(File fileLeft, File fileRight) throws Exception {

        BufferedImage img1 = ImageIO.read(fileLeft);
        BufferedImage img2 = ImageIO.read(fileRight);
        int w1 = img1.getWidth();
        int w2 = img2.getWidth();
        int h1 = img1.getHeight();
        int h2 = img2.getHeight();
        if ((w1!=w2)||(h1!=h2)) {
            System.out.println("Both images should have same dimwnsions");
        } else {
            long diff = 0;
            for (int j = 0; j < h1; j++) {
                for (int i = 0; i < w1; i++) {
                    //Getting the RGB values of a pixel
                    int pixel1 = img1.getRGB(i, j);
                    Color color1 = new Color(pixel1, true);
                    int r1 = color1.getRed();
                    int g1 = color1.getGreen();
                    int b1 = color1.getBlue();
                    int pixel2 = img2.getRGB(i, j);
                    Color color2 = new Color(pixel2, true);
                    int r2 = color2.getRed();
                    int g2 = color2.getGreen();
                    int b2= color2.getBlue();
                    //sum of differences of RGB values of the two images

                    long data = Math.abs(r1-r2)+Math.abs(g1-g2)+ Math.abs(b1-b2);
                    diff = diff+data;
                }
            }
            double avg = diff/(w1*h1*3);
            double percentage = (avg/255)*100;
//            System.out.println("Difference: "+percentage);
            return percentage;
        }

//        http://192.168.0.104:8094/

        return 100;
    }

    @Override
    public double getDifference2(File fileLeft, File fileRight) throws Exception {

        BufferedImage img1 = ImageIO.read(fileLeft);
        BufferedImage img2 = ImageIO.read(fileRight);
        int w1 = img1.getWidth();
        int w2 = img2.getWidth();
        int h1 = img1.getHeight();
        int h2 = img2.getHeight();
        if ((w1!=w2)||(h1!=h2)) {
            System.out.println("Both images should have same dimwnsions");
        } else {
            long diff = 0;
            long whitePixels = 0;
            for (int j = 0; j < h1; j++) {
                for (int i = 0; i < w1; i++) {
                    //Getting the RGB values of a pixel
                    int pixel1 = img1.getRGB(i, j);
                    Color color1 = new Color(pixel1, true);
                    int r1 = color1.getRed();
                    int g1 = color1.getGreen();
                    int b1 = color1.getBlue();
                    int pixel2 = img2.getRGB(i, j);
                    Color color2 = new Color(pixel2, true);
                    int r2 = color2.getRed();
                    int g2 = color2.getGreen();
                    int b2= color2.getBlue();
                    //sum of differences of RGB values of the two images

                    if (r1 > 240 && g1 > 240 && b1 > 240) {
                        whitePixels++;
                    }

                    long data = Math.abs(r1-r2)+Math.abs(g1-g2)+ Math.abs(b1-b2);
                    diff = diff+data;
                }
            }
            System.out.println("whitePixels = " + whitePixels);
            System.out.println("white background percent = " + (double)whitePixels/(double)6400*100);
            double avg = diff/(w1*h1*3);
            double percentage = (avg/255)*100;
//            System.out.println("Difference: "+percentage);
            return percentage;
        }

//        http://192.168.0.104:8094/

        return 100;
    }

    @Override
    public boolean isFileCorrespondCondition(File destinationFile, String title) {
        try {
//            long filesCount = new ClassPathResource(getCorrectCondition(title)).getFile().list().length;
            ArrayList<Double> differenceList = new ArrayList<>();
            File[] files = new ClassPathResource("captcha/"+getCorrectCondition(title)).getFile().listFiles();
//            System.out.println("");
            for (File file : files) {
                double difference = getDifference(destinationFile, file);
                differenceList.add(difference);
                System.out.println(destinationFile.getName() + " <=> " + file.getName() + " = " + difference);
            }

            Double min = differenceList.stream().min(Comparator.naturalOrder()).get();
            return min < 9.00;
        } catch (FileNotFoundException e) {
            System.out.println(e);
            return false;
        } catch (Exception e) {
            System.out.println(e);
            throw new RuntimeException(e);
        }
    }

    public boolean isFileCorrespondCondition1(File destinationFile, String title) {
        try {
            ArrayList<Double> differenceList = new ArrayList<>();
            File[] files = new ClassPathResource("captcha/"+getCorrectCondition(title)).getFile().listFiles();
            for (File file : files) {
                double difference = getDifference(destinationFile, file);
                differenceList.add(difference);
//                System.out.println(destinationFile.getName() + " <=> " + file.getName() + " = " + difference);
            }

            Double min = differenceList.stream().min(Comparator.naturalOrder()).get();
            return min < 9.00;
        } catch (FileNotFoundException e) {
            System.out.println(e);
            return false;
        } catch (Exception e) {
            System.out.println(e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean isImageInGroup(String url, String category) {
        try {
            String value = "url(\"" + url + "\")";
            String imageEncoded = value.substring(27, value.length() - 2);
            byte[] decodedImg = Base64.getDecoder().decode(imageEncoded);
            String temporaryFileName = UUID.randomUUID().toString().replace("-", "") + ".jpg";
            File temporaryDestinationFile = new File(PATH_TO_TEMPORARY + temporaryFileName);
            if (temporaryDestinationFile.createNewFile()) {
                Files.write(temporaryDestinationFile.toPath(), decodedImg);

                if (isFileCorrespondCondition1(temporaryDestinationFile, category)) {
//                    System.out.println(temporaryDestinationFile.getName() + " IS IN " + category + " @@@@@@@@@@@@@");
                    return true;
                } else {
//                    System.out.println(temporaryDestinationFile.getName() + " IS NOT IN " + category + " %%%%%%%%%%%%%%%%");
                    return false;
                }
            } else {
                System.out.println("File already exists.");
            }
        } catch (Exception ex) {
            System.out.println(ex);
            throw new RuntimeException(ex);
        }
        return false;
    }

    @Override
    public String getCorrectCondition(String reason) {
        switch (reason) {
            case "изображения с мотоциклами": return "motorbike";
            case "изображения с цветами": return "flower";
            case "изображения с девушками": return "girl";
            case "изображения с машинами": return "car";
            case "изображения с животными": return "animal";
//            case "изображения с носками": return "socks";
//            case "изображения со слонами": return "elephant";
//            case "изображения с телефонами": return "phone";
//            case "изображения со стульями": return "chair";
//            case "изображения со бантиками": return "bow";
//            case "изображения с экскаваторами": return "excavator";
//            case "изображения с велосипедами": return "bike";
//            case "изображения с клавиатурами": return "keyboard";
//            case "изображения с поездами": return "train";
//            case "изображения с лошадьми": return "horse";
//            case "изображения с тиграми": return "tiger";
//            case "изображения с автомобилями": return "car";
//            case "изображения с поросятами": return "pig";
//            case "изображения с цветами": return "flower";
//            case "изображения с чайниками": return "kettle";
//            case "изображения с компьютерными мышками": return "compMouse";
//            case "изображения с котятами": return "cat";
//            case "изображения с лампочками": return "bulb";
//            case "изображения с пандой": return "panda";
//            case "изображения с самолетами": return "airplane";
//            case "изображения с апельсинами": return "orange";
//            case "изображения с яблоками": return "apple";
//            case "изображения с собаками": return "dog";
        }

        return null;
    }
}
