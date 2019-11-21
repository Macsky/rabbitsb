package com.example.rabbitsb.rabbit;


import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

//@Component
//@RabbitListener(queues = "q_hello")
public class HelloReceiver {


        //@RabbitHandler
        public void process(String hello){
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName+"消费了："+threadName);
        }





}
