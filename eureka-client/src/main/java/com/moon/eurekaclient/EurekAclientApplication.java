package com.moon.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekAclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekAclientApplication.class, args);
    }
}
