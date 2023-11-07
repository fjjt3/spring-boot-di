package com.learningspring.springboot.di.app.controller;

import com.learningspring.springboot.di.app.models.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Autowired
    @Qualifier("MyComplexService")
    private IService myService;

    @GetMapping({"/","","/index"})
    public String index(Model model) {

        model.addAttribute("object", myService.oparation());
        return "index";
    }

}
