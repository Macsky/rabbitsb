package com.example.rabbitsb.springboot;


import com.example.rabbitsb.rabbit.HelloReceiver;
import com.example.rabbitsb.rabbit.HelloSender;
import com.example.rabbitsb.rabbit.MsgSender;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RabbitMqTest {


    public static final String ROUTING_KEY="q_hello";

    @Autowired
    private AmqpTemplate rabbitTemplate;


    @Autowired
    private HelloSender helloSender;


    @Autowired
    private MsgSender msgSender;

    @Test
    public void sender() {
        helloSender.sender();
    }




    @Test
    public void sender2(){
        msgSender.sender2();
    }


    @Test
    public void sender1(){
        msgSender.sender1();
    }




}
