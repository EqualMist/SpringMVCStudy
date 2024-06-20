package com.zzy.controller;

import com.zzy.bean.TestBean;
import com.zzy.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
public class MainController {


    @RequestMapping("/index")
    public String index() {
        System.out.println("我是Controller中的index");
        if (true) throw new RuntimeException("我是异常");
        return "index";
    }

    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("我是Controller中的home");
        return "home";
    }

//    @RequestMapping(value = "/index/{id}", method = RequestMethod.GET)
//    public String get(@PathVariable("id") String text){
//        System.out.println("获取用户："+text);
//        return "index";
//    }
//
//    @RequestMapping(value = "/index", method = RequestMethod.POST)
//    public String post(@RequestParam("username") String username){
//        System.out.println("添加用户："+username);
//        return "index";
//    }
//
//    @RequestMapping(value = "/index/{id}", method = RequestMethod.DELETE)
//    public String delete(@PathVariable("id") String text){
//        System.out.println("删除用户："+text);
//        return "index";
//    }
//
//    @RequestMapping(value = "/index", method = RequestMethod.PUT)
//    public String put(String username){
//        System.out.println("修改用户："+username);
//        return "index";
//    }

}
