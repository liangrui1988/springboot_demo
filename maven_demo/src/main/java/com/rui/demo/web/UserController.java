package com.rui.demo.web;

import com.rui.demo.bean.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 常规spring web
 */
@RestController
public class UserController {


    @PostMapping("/person/save")
    public  User save(@RequestParam  String name){
        User user=new User();
        user.setId(1000);
        user.setName(name);
        System.out.println(name);
        return user;
    }



    @PostMapping("/person/get")
    public  User get(@RequestParam  int id){
        User user=new User();
        user.setId(id);
        user.setName("world");
        return user;
    }

}
