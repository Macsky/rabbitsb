package com.example.rabbitsb.rabbit;


import com.example.rabbitsb.config.RabbitFanoutExchangeConfig;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FanoutSender {


    @Autowired
    private AmqpTemplate rabbitTemplate;


    public void send(){
        for (int i = 0; i < 100; i++) {
            String context="fanout message"+i;
            rabbitTemplate.convertAndSend(RabbitFanoutExchangeConfig.Exchange_Fanout_Name,"",context);
        }
    }

}
