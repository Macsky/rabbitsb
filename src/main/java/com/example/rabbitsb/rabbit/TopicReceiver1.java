package com.example.rabbitsb.rabbit;

import com.example.rabbitsb.config.RabbitTopicExchangeConfig;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues =RabbitTopicExchangeConfig.Queue_Name_A)
public class TopicReceiver1 {


    @RabbitHandler
    public void process(String hello){
        System.out.println("topic1:::::"+hello);

    }


}
@Component
@RabbitListener(queues =RabbitTopicExchangeConfig.Queue_Name_B)
class TopicReceiver2{
    @RabbitHandler
    public void process(String hello){
        System.out.println("topic2:::::"+hello);
    }

}



