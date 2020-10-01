package com.visa.firstweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestResource {

    @Autowired
    private ISvc service;


    @GetMapping("/hello-message")
    public String getMessage(){
        return service.doGreet();
    }
}
