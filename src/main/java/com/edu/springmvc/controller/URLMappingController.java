package com.edu.springmvc.controller;

import com.edu.springmvc.entity.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

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
    public String getMapping(@RequestParam("manager_name") String managerName, Date createTime){
        //@RequestParam("manager_name") 赋值给后面的参数
        System.out.println(managerName+":"+createTime);
        return "This is get method";
    }
    @PostMapping("/p")
    @ResponseBody
    public String PostMapping(String username, String password, @DateTimeFormat(pattern = "yyyy-MM-dd") Date createTime){
        System.out.println(username+":"+password+":"+createTime);
        return "This is post method";
    }

    @PostMapping("/p1")
    @ResponseBody
    public String postMapping(User user){
        System.out.println(user.getUsername()+":"+user.getPassword()+":"+user.getCreateTime());
        return "这是 post method";
    }

    @GetMapping("/view")
    public ModelAndView showView(Integer userId){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/view.jsp");
        User user = new User();
        if (userId == 1)
            user.setUsername("苏苏");
        else if(userId == 2)
            user.setUsername("苏酒儿");
        mav.addObject("user", user);
        return mav;
    }

    /*
        1. 方法被@ResponseBody描述，SpringMVC直接响应String字符串本身
        2. 方法不存在@ResponseBody，则SpringMVC处理String指代的视图（页面）
     */
    @GetMapping("/view1")
    public String showView1(Integer userId, ModelMap modelMap){
        String view = "/view.jsp";
        User user = new User();
        if (userId == 1)
            user.setUsername("苏苏");
        else if(userId == 2)
            user.setUsername("苏酒儿");
        modelMap.addAttribute("user", user);
        return view;
    }

}
