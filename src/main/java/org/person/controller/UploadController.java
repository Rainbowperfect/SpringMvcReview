package org.person.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/upload")
public class UploadController {

    @RequestMapping(value = "/file",method = RequestMethod.POST)
    public String upload(HttpSession session, @RequestParam(value = "image") MultipartFile file, Model model){

        return "upload";
    }
}
