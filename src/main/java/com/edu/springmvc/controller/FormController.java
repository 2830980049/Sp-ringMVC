package com.edu.springmvc.controller;

import com.edu.springmvc.entity.Form;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @author Wuqili
 * @version 1.0
 * @date 2020/6/17 21:25
 */
@Controller
public class FormController {
    @PostMapping("/apply")
    @ResponseBody
    public String apply(Form form){
        // 复合数据不能用Map
        System.out.println(form);
        return "Success";
    }
    public String apply(@RequestParam Map map){
        // 复合数据不能用Map
        System.out.println(map);
        return "Success";
    }
}
