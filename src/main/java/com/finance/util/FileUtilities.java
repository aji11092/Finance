package com.finance.util;


import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileUtilities {

    public static String getFileExtension(String fileName) {

        return fileName.substring(fileName.lastIndexOf(".") + 1);

    }

    public static void uploadFile(MultipartFile uploadfile, String fileName, String uploadFolder) {
        BufferedOutputStream stream = null;
        String dirAbsolutePath = getDirectoryAbsolutePath(uploadFolder);
        try {
            byte[] bytes = uploadfile.getBytes();
            File serverFile = new File(dirAbsolutePath+Constants.FILE_PATH_SEPERATOR + fileName);
            stream = new BufferedOutputStream(new FileOutputStream(serverFile));
            try {
                stream.write(bytes);
            } finally {
                stream.close();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e.getMessage() + "File not found");
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage() + "Failed to upload file!");
        } finally {
            try {
                stream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    private static String getDirectoryAbsolutePath(String uploadFolder) {
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String today = dateFormat.format(date);
        File dir = null;

        dir = new File( uploadFolder + Constants.FILE_PATH_SEPERATOR + today);

        if (!dir.exists()) {
            dir.mkdirs();
        }
        return dir.getAbsolutePath();
    }
}
