package com.gary.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping("/ftl/getUser")
    public String getUser(Model model){
        model.addAttribute("myname", "I am名称 玄玉");
        return "myfree";
    }

    @RequestMapping("/getUserName")
    public String getUserName(Model model){
        model.addAttribute("myname", "I am Jadyer");
        return "username";
    }
}