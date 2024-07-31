package com.longbridge.dify.configuration;

import com.longbridge.dify.client.DifyClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(DifyProperties.class)
public class DifyAutoConfiguration {
    @Autowired
    private DifyProperties difyProperties;

    @Bean
    public DifyClient getDifyClient() {
        return new DifyClient(difyProperties.getApiKey(), difyProperties.getBaseUrl());
    }
}
