package com.visa.theclient;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingController {

    @Autowired
    private GrreetingClient client;

    @RequestMapping("/thegreet")
    @HystrixCommand(fallbackMethod = "problemo")
    public String greeting(Model model){
        model.addAttribute("mygreet",client.doGreet());
        return "greeting";
    }

    public String problemo(Model model){
        model.addAttribute("mygreet","There was a big problem!!!");
        return "greeting";
    }
}
