package org.example.lab.config;

import org.example.lab.service.EarlyBirdDiscountService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DiscountConfig {
    @Bean
    @ConditionalOnProperty(
            name = "feature.earlybird.enabled",
            havingValue = "true")
    public EarlyBirdDiscountService earlyBirdDiscountService() {
        return new EarlyBirdDiscountService();
    }
}
