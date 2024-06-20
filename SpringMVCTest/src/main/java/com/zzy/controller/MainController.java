package com.zzy.controller;

import com.alibaba.fastjson.JSONObject;
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
        return "index";
    }

    @RequestMapping(value = "/home", produces = "application/json")
    @ResponseBody
    public User home() {
//        JSONObject json = new JSONObject();
//        json.put("student", new User(1, "爱丽希雅", "123456"));
        User user = new User(1, "爱丽希雅", "123456");
        return user;
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
