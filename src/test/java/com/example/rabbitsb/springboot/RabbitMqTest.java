package com.example.rabbitsb.springboot;


import com.example.rabbitsb.rabbit.HelloReceiver;
import com.example.rabbitsb.rabbit.HelloSender;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RabbitMqTest {


    public static final String ROUTING_KEY="q_hello";

    @Autowired
    private AmqpTemplate rabbitTemplate;


    //@Autowired
   //private HelloReceiver helloReceiver;

    @Autowired
    private HelloSender helloSender;

    @Test
    public void sender() {
        helloSender.sender();
    }


    @Test
    public void consumer(){


    }






}
