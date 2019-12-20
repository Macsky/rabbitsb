package com.example.rabbitsb.rabbit;


import com.example.rabbitsb.domain.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = HelloSender.QUEUENAME)
public class HelloReceiver {


    @RabbitHandler
    public void process(Message message) {
        String threadName = Thread.currentThread().getName();
        System.out.println("HelloReceiver 消费了：" + message.toString());
    }


}
