package com.edu.springmvc.controller;

import com.edu.springmvc.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Wuqili
 * @version 1.0
 * @date 2020/6/19 11:53
 */
@RestController //当前类所有方法都有 @ResponseBody
@Controller
@RequestMapping("/restful")
public class RestfulController {
    @GetMapping("/request")
    public String doGetReqest(){
        System.out.println("1");
        return "{\"message\":\"返回查询结果\"}";
    }

    // POST /restful/request/666
    @PostMapping("/request/{rid}")
    public String doPostRequest(@PathVariable("rid") Integer requestId, Person person){
        System.out.println(person);
        return "{\"message\":\"数据新建成功\",\"id\":"+requestId+"}";
    }

    @PutMapping("/request")
    public String doPutRequest(Person person){
        System.out.println(person);
        return "{\"message\":\"数据更新成功\"}";
    }

    @DeleteMapping("/request")
    public String doDeleteRequest(){
        return "{\"message\":\"数据删除成功\"}";
    }

    @GetMapping("/person")
    public Person findByPersonId(Integer id){
        Person p = new Person();
        if(id == 1){
            p.setName("苏苏");
            p.setAge(21);
        }
        else if(id == 2){
            p.setName("苏酒儿");
            p.setAge(22);
        }
        return p;
    }

    @GetMapping("/persons")
    public List<Person> findPersons(){
        List list = new ArrayList();
        Person p1 = new Person();
        p1.setName("苏苏");
        p1.setAge(21);
        Person p2 = new Person();
        p2.setName("苏酒儿");
        p2.setAge(21);
        list.add(p1);
        list.add(p2);
        return list;
    }

}
