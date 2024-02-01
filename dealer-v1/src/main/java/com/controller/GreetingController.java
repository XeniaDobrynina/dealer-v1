package com.controller;

import com.services.IGreetingService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class GreetingController extends MainController{


    private IGreetingService greetingService;

    private BeanFactory beanFactory;

    @Autowired
    public GreetingController(IGreetingService greetingService, BeanFactory beanFactory) {
        this.greetingService = greetingService;
        this.beanFactory = beanFactory;
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        beanFactory.getBean(IGreetingService.class).test();
        return """ 
                   Hello %s! questo è un text block""".formatted(name);
    }
}
