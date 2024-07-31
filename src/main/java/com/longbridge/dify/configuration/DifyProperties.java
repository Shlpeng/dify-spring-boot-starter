package com.longbridge.dify.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "dify")
@Data
public class DifyProperties {
    private String apiKey;
    private String baseUrl;
}