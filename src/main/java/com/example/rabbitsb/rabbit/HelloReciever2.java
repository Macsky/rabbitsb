package com.example.rabbitsb.rabbit;


import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "q_hello")
public class HelloReciever2 {


    @RabbitHandler
    public void hello(String hello){

        String threadName = Thread.currentThread().getName();
        System.out.println("HelloReciever2 消费了："+hello);

    }


}
