package com.example.rabbitsb.rabbit;

import com.example.rabbitsb.config.RabbitFanoutExchangeConfig;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = RabbitFanoutExchangeConfig.Queue_Fanout_NameA)
public class FanoutReceiverA {


    @RabbitHandler
    public void process(String hello){
        System.out.println("fanout receiver A:::"+hello);
    }


}


@Component
@RabbitListener(queues = RabbitFanoutExchangeConfig.Queue_Fanout_NameB)
class FanoutReceiverB{
    @RabbitHandler
    public void process(String hello){
        System.out.println("fanout receiver B:::"+hello);
    }



}


@Component
@RabbitListener(queues = RabbitFanoutExchangeConfig.Queue_Fanout_NameC)
class FanoutReceiverC{

    @RabbitHandler
    public void process(String hello){
        System.out.println("fanout receiver C:::"+hello);
    }


}
