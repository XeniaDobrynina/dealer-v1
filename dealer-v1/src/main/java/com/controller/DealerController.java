package com.controller;

import com.entity.Dealer;
import com.entity.User;
import com.services.IDealerService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/dealer",produces = MediaType.APPLICATION_JSON_VALUE)
@ComponentScan("com/services")
public class DealerController {

    private final BeanFactory beanFactory;

    private IDealerService service;

    @Autowired
    public DealerController(BeanFactory beanFactory, IDealerService service) {
        this.beanFactory = beanFactory;
        this.service = service;
    }

    @PostMapping("/createUser")
    public String createUser(@RequestBody User user){
           service.createUser((Dealer) user);
           return "200 OK";
    }

    @PostMapping("/getUser/{id}")
    public User user(@RequestParam String id){
       return service.getDealer(id);
    }
}
