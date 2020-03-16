package com.enjoy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by BJLI on 2020/3/6.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApp {
    public static void main(String[] args){
        SpringApplication.run(EurekaApp.class,args);
    }
}
