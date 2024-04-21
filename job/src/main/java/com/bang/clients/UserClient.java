package com.bang.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("gateway") // 这个是应用名,spring:application:name
public interface UserClient {

    /**
     * user 模块的controller方法
     * @param id
     * @return
     */
    @GetMapping("/user/get/{id}")
    String findById(@PathVariable("id") Integer id);

}
