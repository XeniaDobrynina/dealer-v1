package com.controller;

import com.entity.User;
import com.services.IGreetingService;
import com.services.serviceImpl.GreetingServiceImpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@ComponentScan("com/services")
public class MainController {

    public static void main(String[] args) {
        SpringApplication.run(MainController.class, args);

    }

}