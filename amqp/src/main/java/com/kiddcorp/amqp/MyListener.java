package com.kiddcorp.amqp;

import com.kiddcorp.domain.Order;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MyListener {
    @RabbitListener(queues="myqueue1")
    public void onMessage(Order order) {
        System.out.println("Message received - Order Details:" + order); }
}
