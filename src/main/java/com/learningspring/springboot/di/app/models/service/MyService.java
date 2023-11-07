package com.learningspring.springboot.di.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// @Primary
// @Component("mySimpleService")
public class MyService implements IService{

    @Override
    public  String oparation() {
        return "executing";
    }
}
