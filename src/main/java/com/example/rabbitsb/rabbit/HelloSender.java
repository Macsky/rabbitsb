package com.example.rabbitsb.rabbit;

import com.example.rabbitsb.domain.Message;
import org.springframework.amqp.core.AmqpTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloSender {

    public static final String QUEUENAME = "q_hello";

    @Autowired
    private AmqpTemplate rabbitTemplate;


    public void sender() {
        System.out.println("put message into rabbitMq beginning------");
        for (int i = 0; i < 10000; i++) {
            String content = "hello world rabbit " + i;
            com.example.rabbitsb.domain.Message message=new Message(content,i);
            //简单队列的routing_key 就是队列名称
            this.rabbitTemplate.convertAndSend(QUEUENAME, message);
        }
        System.out.println("put message into rabbitMq ending---------");
    }


}



