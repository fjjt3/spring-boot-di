package com.learningspring.springboot.di.app.controller;

import com.learningspring.springboot.di.app.models.domain.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("invoice")
public class InvoiceController {

    @Autowired
    private Invoice invoice;
    @GetMapping("/see")
    public String see(Model model){
        model.addAttribute("invoice", invoice);
        model.addAttribute("title", "Example invoice with dependent injection");
        return "invoice/see";

    }
}
