package com.edu.springmvc.controller;

import com.edu.springmvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author Wuqili
 * @version 1.0
 * @date 2020/6/16 18:48
 */
@Controller("URLMappingController")
@RequestMapping("/ul") //设置访问前缀
public class URLMappingController {
    //@RequestMapping 作用在方法上，不区分get/post请求
    @GetMapping("/g")
    @ResponseBody
    public String getMapping(@RequestParam("manager_name") String managerName){
        //@RequestParam("manager_name") 赋值给后面的参数
        System.out.println(managerName);
        return "This is get method";
    }
    @PostMapping("/p")
    @ResponseBody
    public String PostMapping(String username, String password){
        System.out.println(username+":"+password);
        return "This is post method";
    }

    @PostMapping("/p1")
    @ResponseBody
    public String postMapping(User user){
        System.out.println(user.getUsername()+":"+user.getPassword());
        return "This is post method";
    }

}
