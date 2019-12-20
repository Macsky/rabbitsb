package com.example.rabbitsb.config;


import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitTopicExchangeConfig {

    public final static String Queue_Name_A = "q_topic_messageA";
    public final static String Queue_Name_B = "q_topic_messageB";
    public final static String Exchange_Name = "topic_exchange";

    public final  static String Route_Name_One="topic.message";
    public final  static String Route_Name_Two="topic.#";
    public final  static String Route_Name_Three="topic.messages";

    @Bean
    public Queue createQueueA() {
        return new Queue(RabbitTopicExchangeConfig.Queue_Name_A);
    }

    @Bean
    public Queue createQueueB() {
        return new Queue(RabbitTopicExchangeConfig.Queue_Name_B);
    }


    @Bean
    public TopicExchange createExchage() {
        return new TopicExchange(RabbitTopicExchangeConfig.Exchange_Name);
    }



    @Bean
    public Binding bindingExchangeQueueA(){
        return BindingBuilder.bind(createQueueA()).to(createExchage()).with(RabbitTopicExchangeConfig.Route_Name_One);
    }
    @Bean
    public Binding bindingExchangeQueueB(){
        return BindingBuilder.bind(createQueueB()).to(createExchage()).with(RabbitTopicExchangeConfig.Route_Name_Two);
    }



}
