package com.profisprint.service;

import java.io.File;

public interface CaptchaService {

   String getCorrectCondition(String reason);

   double getDifference(File fileLeft, File fileRight) throws Exception;
   double getDifference2(File fileLeft, File fileRight) throws Exception;

   boolean isFileCorrespondCondition(File destinationFile, String title);
   boolean isFileCorrespondCondition1(File destinationFile, String title);

   boolean isImageInGroup(String url, String category);

}
