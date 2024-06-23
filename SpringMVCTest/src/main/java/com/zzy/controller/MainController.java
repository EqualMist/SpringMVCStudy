package com.zzy.controller;

import com.alibaba.fastjson.JSONObject;
import com.zzy.bean.TestBean;
import com.zzy.entity.Student;
import com.zzy.entity.User;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@Controller
public class MainController {


    @RequestMapping("/index")
    public String index() {
        System.out.println("我是Controller中的index");
        return "index";
    }

    @RequestMapping(value = "/data", produces = "application/json")
    @ResponseBody
    public User home() {
//        JSONObject json = new JSONObject();
//        json.put("student", new User(1, "爱莉希雅", "123456"));
        User user = new User(1, "爱莉希雅", "123456", 18);
        return user;
    }

    @PostMapping(value = "/submit", produces = "application/json")
    @ResponseBody
    public String submit (@RequestBody Student student) {
        System.out.println(student.toString());
        return "{\"success\": true}";
    }

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    @ResponseBody
    public String upload(@RequestParam CommonsMultipartFile file) throws IOException {
        File fileObj = new File("test.jpg");
        file.transferTo(fileObj);
        System.out.println("用户上传的文件已保存到："+fileObj.getAbsolutePath());
        return "文件上传成功！";
    }

    @RequestMapping(value = "/download", method = RequestMethod.GET)
    @ResponseBody
    public void download(HttpServletResponse response){
        response.setContentType("multipart/form-data");
        try(OutputStream stream = response.getOutputStream();
            InputStream inputStream = new FileInputStream("test.jpg")){
            IOUtils.copy(inputStream, stream);
        }catch (IOException e){
            e.printStackTrace();
        }
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
