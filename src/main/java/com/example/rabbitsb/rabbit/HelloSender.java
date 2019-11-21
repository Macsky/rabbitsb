package com.example.rabbitsb.rabbit;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloSender {

    public static final String ROUTING_KEY="q_hello";

    @Autowired
    private AmqpTemplate rabbitTemplate;


    public void sender() {
        System.out.println("put message into rabbitMq beginning------");
        for (int i = 0; i <100 ; i++) {
            String message="hello world rabbit "+i;
            //简单队列的routing_key 就是队列名称
            this.rabbitTemplate.convertAndSend(ROUTING_KEY,message);
        }
        System.out.println("put message into rabbitMq ending---------");


    }




}
