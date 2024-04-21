package com.bang.controller;

import com.bang.clients.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope // 加上这个注解，修改nacos中的配置后，微服务中无需重启即可让配置生效，也就是配置热更新
@RequestMapping("/job")
public class JobController {

    @Autowired
    private UserClient userClient;

    @RequestMapping("/getJob/{id}")
    public String getJob(@PathVariable("id") Integer id){
        String userId = userClient.findById(id);// 像方法一样直接访问其他微服务的接口
        return "getJob：" + userId;
    }
}
