package com.bang.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author oyang
 * @site https://blog.csdn.net
 * @qq 1828190940
 * @create  2022-11-24 16:07
 */
@RestController
@RequestMapping("/user")
public class UserController {

    //获取单个用户
    @RequestMapping("/get/{id}")
    public String get(@PathVariable("id") Integer id){
        return id + ",oyang" + ",123" + ",15580XXXXXX";
    }
}
