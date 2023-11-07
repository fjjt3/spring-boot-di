package com.learningspring.springboot.di.app;

import com.learningspring.springboot.di.app.models.domain.ItemInvoice;
import com.learningspring.springboot.di.app.models.domain.Product;
import com.learningspring.springboot.di.app.models.service.IService;
import com.learningspring.springboot.di.app.models.service.MyComplexService;
import com.learningspring.springboot.di.app.models.service.MyService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Arrays;
import java.util.List;

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

    @Bean("itemsInvoice")
    public List<ItemInvoice> registerItems(){
        Product product1 = new Product("Macbook", 2000);
        Product product2 = new Product("Mac Studio", 1000);

        ItemInvoice line1 = new ItemInvoice(product1, 2);
        ItemInvoice line2 = new ItemInvoice(product2, 1);

        return Arrays.asList(line1, line2);


    }

    @Bean("itemsInvoiceOffice")
    @Primary
    public List<ItemInvoice> registerItemsOffice(){
        Product product1 = new Product("I Phone 15", 1500);
        Product product2 = new Product("I Pad Pro", 1200);

        ItemInvoice line1 = new ItemInvoice(product1, 2);
        ItemInvoice line2 = new ItemInvoice(product2, 3);

        return Arrays.asList(line1, line2);


    }
}




