package com.learningspring.springboot.di.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component("MyComplexService")
public class MyComplexService implements IService{

    @Override
    public  String oparation() {
        return "executing complex service";
    }
}
