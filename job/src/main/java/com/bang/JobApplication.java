package com.bang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class JobApplication {

    public static void main(String[] args) {
        // 参数1：入口类示例；参数2：命令行参数
        SpringApplication.run(JobApplication.class, args);
    }
}
