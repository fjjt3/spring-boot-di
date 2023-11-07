package com.learningspring.springboot.di.app;

import com.learningspring.springboot.di.app.models.service.IService;
import com.learningspring.springboot.di.app.models.service.MyComplexService;
import com.learningspring.springboot.di.app.models.service.MyService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

    @Bean("mySimpleService")
    @Primary
    public IService registerMyService(){
        return new MyService();
    }

    @Bean("MyComplexService")
    public IService registerComplexMyService(){
        return new MyComplexService();
    }
}


