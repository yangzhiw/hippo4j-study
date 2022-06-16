package com.juzi.hippo4j.study;

import cn.hippo4j.core.enable.EnableDynamicThreadPool;
import com.alibaba.nacos.spring.context.annotation.config.EnableNacosConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: juzi
 * @created: 2022-06-15 19:29
 */
@EnableDynamicThreadPool
@EnableNacosConfig(readConfigTypeFromDataId = false)
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
