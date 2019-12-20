package com.example.rabbitsb.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class RabbitFanoutExchangeConfig {


    public final static String Queue_Fanout_NameA="q_fanout_a";
    public final static String Queue_Fanout_NameB="q_fanout_b";
    public final static String Queue_Fanout_NameC="q_fanout_c";
    public final static String Exchange_Fanout_Name="fanout_exchange";




    @Bean
    public Queue createQueueAA(){
        return new Queue(RabbitFanoutExchangeConfig.Queue_Fanout_NameA);
    }


    @Bean
    public Queue createQueueBB(){
        return new Queue(RabbitFanoutExchangeConfig.Queue_Fanout_NameB);
    }


    @Bean
    public Queue createQueueCC(){
        return new Queue(RabbitFanoutExchangeConfig.Queue_Fanout_NameC);
    }

    @Bean
    public FanoutExchange createExchange(){
        return new FanoutExchange(RabbitFanoutExchangeConfig.Exchange_Fanout_Name);
    }


    @Bean
    Binding bindExchangeA(){
        return BindingBuilder.bind(createQueueAA()).to(createExchange());
    }

    @Bean
    Binding bindExchangeB(){
        return BindingBuilder.bind(createQueueBB()).to(createExchange());
    }

    @Bean
    Binding bindExchangeC(){
        return BindingBuilder.bind(createQueueCC()).to(createExchange());
    }






}
