package com.visa.theclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("MICROSERVICE")
public interface GrreetingClient {

    @RequestMapping("/greeting")
    String doGreet();
}
