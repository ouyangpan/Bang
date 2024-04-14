package com.bang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserApplication {

    public static void main(String[] args) {
        // 参数1：入口类示例；参数2：命令行参数
        SpringApplication.run(UserApplication.class, args);
    }
}
