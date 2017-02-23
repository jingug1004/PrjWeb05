package org.zerock.util;

import org.imgscalr.Scalr;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Calendar;

/**
 * Created by wtime on 2017-02-22. 오후 3:00
 * org.zerock.util / Web03
 * It's now or never!
 */
public class UploadFileUtils {

    public static final Logger logger =
            LoggerFactory.getLogger(UploadFileUtils.class);

    public static String uploadFile(String uploadPath,
                                    String originalName,
                                    byte[] fileData) throws Exception {
        return null;
    }

    private static String calcPath(String uploadPath) {

        Calendar cal = Calendar.getInstance();

        String yearPath = File.separator + cal.get(Calendar.YEAR);

        String monthPath = yearPath + File.separator +
                new DecimalFormat("00").format(cal.get(Calendar.MONTH) + 1);

        String datePath = monthPath + File.separator +
                new DecimalFormat("00").format(cal.get(Calendar.DATE));

        makeDir(uploadPath, yearPath, monthPath, datePath);

        logger.info(datePath);

        return datePath;

    }

    private static void makeDir(String uploadPath, String... paths) {

        if (new File(paths[paths.length - 1]).exists()) {
            return;
        }

        for (String path : paths) {

            File dirPath = new File(uploadPath + path);

            if (!dirPath.exists()) {
                dirPath.mkdir();
            }
        }
    }

    private static String makeThumbnail(String uploadPath, String path, String fileName) throws IOException {

        BufferedImage sourceImg =
                ImageIO.read(new File(uploadPath + path, fileName));

        BufferedImage destImg =
                Scalr.resize(sourceImg,
                        Scalr.Method.AUTOMATIC,
                        Scalr.Mode.FIT_TO_HEIGHT,
                        100);

        String thumbnailName =
                uploadPath + path + File.separator + "s_" + fileName;

        File newFile = new File(thumbnailName);

        String formatName =
                fileName.substring(fileName.lastIndexOf(".") + 1);

        ImageIO.write(destImg, formatName.toUpperCase(), newFile);

        return thumbnailName.substring(
                uploadPath.length()).replace(File.separatorChar, '/');

    }

}



