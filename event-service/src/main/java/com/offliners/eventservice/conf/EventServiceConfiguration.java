package com.offliners.eventservice.conf;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EventServiceConfiguration {
    
    @Bean
    public ModelMapper getModelMapper() {
        return new ModelMapper();
    }
}
