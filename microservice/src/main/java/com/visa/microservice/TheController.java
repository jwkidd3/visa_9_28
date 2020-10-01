package com.visa.microservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TheController {
    @Value("${message}")
    private String msg;

    @Autowired
    private Environment env;

    @GetMapping("/greeting")
    public String m1(){
        String x=env.getProperty("server.port");
        return String.format("The Message: '%s' - '%s'",msg,x);
    }
}
