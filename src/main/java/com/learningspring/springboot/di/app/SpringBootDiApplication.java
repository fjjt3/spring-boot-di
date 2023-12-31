package com.learningspring.springboot.di.app;

import com.learningspring.springboot.di.app.models.service.IService;
import com.learningspring.springboot.di.app.models.service.MyComplexService;
import com.learningspring.springboot.di.app.models.service.MyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
public class SpringBootDiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDiApplication.class, args);
	}


}
