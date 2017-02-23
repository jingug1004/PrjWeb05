package org.zerock.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.util.UUID;

/**
 * Created by wtime on 2017-02-20. 오후 2:18
 * org.zerock.controller / Web Ex02
 * Better late than never!
 */

@Controller
public class UploadController {

    public static final Logger logger =
            LoggerFactory.getLogger(UploadController.class);

    @Resource(name = "uploadPath")
    private String uploadPath;


    @RequestMapping(value = "/uploadForm", method = RequestMethod.GET)
    public void uploadForm() throws Exception {

    }

    @RequestMapping(value = "/uploadForm", method = RequestMethod.POST)
    public String uploadForm(MultipartFile file, Model model) throws Exception {

        logger.info("originalName: " + file.getOriginalFilename());
        logger.info("size: " + file.getSize());
        logger.info("contentType: " + file.getContentType());

        String savedName = uploadFile(file.getOriginalFilename(), file.getBytes());

        model.addAttribute("savedName", savedName);

        return "uploadResult";
    }

    private String uploadFile(String originalName, byte[] fileData) throws Exception {

        UUID uid = UUID.randomUUID();

        String savedName = uid.toString() + "_" + originalName;

        File target = new File(uploadPath, savedName);

        FileCopyUtils.copy(fileData, target);

        return savedName;
    }

    @RequestMapping(value = "/uploadAjax", method = RequestMethod.GET)
    public void uploadAjax() {

    }

    @ResponseBody
    @RequestMapping(value = "/uploadAjax", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public ResponseEntity<String> uploadAjax(MultipartFile file) throws Exception{

        logger.info("originalName: " + file.getOriginalFilename());
        logger.info("size: " + file.getSize());
        logger.info("contentType: " + file.getContentType());

        return new ResponseEntity<>(file.getOriginalFilename(), HttpStatus.CREATED);

    }
}
