package com.example.rabbitsb.rabbit;


import com.example.rabbitsb.domain.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = HelloSender.QUEUENAME)
public class HelloReciever2 {

    @RabbitHandler
    public void hello(Message message) {
        String threadName = Thread.currentThread().getName();
        System.out.println("HelloReciever2 消费了：" + message.toString());
    }


}
