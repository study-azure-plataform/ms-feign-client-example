package com.study.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MsFeignClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsFeignClientApplication.class, args);
    }

}
