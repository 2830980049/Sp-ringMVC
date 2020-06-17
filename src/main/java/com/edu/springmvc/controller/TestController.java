package com.edu.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Wuqili
 * @version 1.0
 * @date 2020/6/16 16:06
 */
@Controller("TestController")
public class TestController {
    // 绑定Get方式请求的URL
    @GetMapping("/t")  //   localhost/t
    @ResponseBody //直接向响应输出字符串数据，不跳转页面
    public String test(){
        return "Success";
    }
}
