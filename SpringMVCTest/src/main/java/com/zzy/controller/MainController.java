package com.zzy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @RequestMapping("/index")
    public String index(Model model) {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.getModel().put("message", "Hello Spring MVC!你好");
//        modelAndView.setViewName("index");
        model.addAttribute("message", "Hello Spring MVC!你好");
        return "index";
    }
}
