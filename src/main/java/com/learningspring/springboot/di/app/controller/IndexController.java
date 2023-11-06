package com.learningspring.springboot.di.app.controller;

import com.learningspring.springboot.di.app.models.service.MyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    private MyService myService = new MyService();

    @GetMapping({"/","","/index"})
    public String index(Model model) {

        model.addAttribute("object", myService.oparation());
        return "index";
    }
}
