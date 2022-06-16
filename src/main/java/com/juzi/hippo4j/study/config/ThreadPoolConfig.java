package com.juzi.hippo4j.study.config;

import java.util.concurrent.ThreadPoolExecutor;

import cn.hippo4j.core.executor.DynamicThreadPool;
import cn.hippo4j.core.executor.support.ThreadPoolBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: juzi
 * @created: 2022-06-15 16:54
 */
@Configuration
public class ThreadPoolConfig {

    @Bean
    @DynamicThreadPool
    public ThreadPoolExecutor messageConsumeDynamicExecutor() {
        String threadPoolId = "message-consume";
        ThreadPoolExecutor messageConsumeDynamicExecutor = ThreadPoolBuilder.builder()
            .threadFactory(threadPoolId)
            .threadPoolId(threadPoolId)
            .dynamicPool()
            .build();
        return messageConsumeDynamicExecutor;
    }

    @Bean
    @DynamicThreadPool
    public ThreadPoolExecutor messageProduceDynamicExecutor() {
        String threadPoolId = "message-produce";
        ThreadPoolExecutor messageProduceDynamicExecutor = ThreadPoolBuilder.builder()
            .threadFactory(threadPoolId)
            .threadPoolId(threadPoolId)
            .dynamicPool()
            .build();
        return messageProduceDynamicExecutor;
    }
}
