package com.zst.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @description:
 * @author: Zhoust
 * @date: 2018/08/27 下午11:15
 * @version: V1.0
 */
@EnableEurekaClient
@SpringBootApplication
@MapperScan(value = "com.zst.provider.mapper")
public class EurekaProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProviderApplication.class,args);
    }

}
