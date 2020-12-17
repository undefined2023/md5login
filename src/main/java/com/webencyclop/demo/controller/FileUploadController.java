package com.webencyclop.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
public class FileUploadController {

    public static String uploadDirectory = System.getProperty("user.dir") + File.separator + "uploads";

    @RequestMapping("/uploadview")
    public String UploadPage() {
        return "uploadview";
    }

    @RequestMapping("/uploadpost")
    public String upload(Model model, @RequestParam("files") MultipartFile[] files) {

        StringBuilder filenames = new StringBuilder();
        for (MultipartFile file : files) {
            Path filenameAndPath = Paths.get(uploadDirectory, file.getOriginalFilename());
            filenames.append(" " + file.getOriginalFilename() + "（" + file.getSize() + "）");
            try {
                Files.write(filenameAndPath, file.getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        model.addAttribute("msg", "完成上传：" + filenames.toString());
        return "uploadstatusview";

    }

}
