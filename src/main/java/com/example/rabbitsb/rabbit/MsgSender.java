package com.example.rabbitsb.rabbit;

import com.example.rabbitsb.config.RabbitTopicExchangeConfig;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MsgSender{

    @Autowired
    private AmqpTemplate rabbitTemplate;


    public void sender1(){
        for (int i = 0; i < 100; i++) {
            String context="hi, i am sender one"+i;
            rabbitTemplate.convertAndSend(RabbitTopicExchangeConfig.Exchange_Name,RabbitTopicExchangeConfig.Route_Name_One,context);
        }
    }

    public void sender2(){
        for (int i = 0; i < 100; i++) {
            String context="hi, i am sender one"+i;
            rabbitTemplate.convertAndSend(RabbitTopicExchangeConfig.Exchange_Name,RabbitTopicExchangeConfig.Route_Name_Three,context);
        }
    }




}