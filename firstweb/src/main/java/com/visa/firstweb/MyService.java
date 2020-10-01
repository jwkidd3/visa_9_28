package com.visa.firstweb;

import org.springframework.stereotype.Component;

@Component
public class MyService implements ISvc{
    @Override
    public String doGreet() {
        return "Yo Dawg... welcome to Spring Boot";
    }
}
