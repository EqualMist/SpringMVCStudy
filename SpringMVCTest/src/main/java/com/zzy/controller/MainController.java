package com.zzy.controller;

import com.zzy.bean.TestBean;
import com.zzy.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
public class MainController {

    @Resource
    TestBean testBean;

    @RequestMapping("/index")
    public String index(User user) {
        System.out.println(testBean);
        return "index";
    }

    @RequestMapping("/home")
    public String home(Model model) {

        return "home";
    }
}
