package com.provider.demo.configs;

import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class RabbitConfigs {


/*
    @Bean("hello")
    public Queue helloQueue(){
        return new Queue("direct.hello");
    }

    @Bean("directexchange")
    public DirectExchange directExchange(){
        return new DirectExchange("testexchange");
    }

    @Bean
    Binding bindMessage(@Qualifier("hello") Queue queue,
                        @Qualifier("directexchange") DirectExchange exchange){
        return BindingBuilder.bind(queue).to(exchange).with("helloKey");
    }


    @Bean("hello")
    public Queue helloQueue(){
        return new Queue("fanout.hello");
    }

    @Bean("say")
    public Queue sayQueue(){
        return new Queue("fanout.say");
    }

    @Bean("directexchange")
    public FanoutExchange directExchange(){
        return new FanoutExchange("test2exchange");
    }

    @Bean
    Binding bindMessage(@Qualifier("hello") Queue queue,
                        @Qualifier("directexchange") FanoutExchange exchange){
        return BindingBuilder.bind(queue).to(exchange);
    }

    @Bean
    Binding bind2Message(@Qualifier("say") Queue queue,
                         @Qualifier("directexchange") FanoutExchange exchange){
        return BindingBuilder.bind(queue).to(exchange);
    }



    @Bean("rabbitConnectionFactory")
    @ConfigurationProperties(prefix = "spring.rabbitmq.connection.factory")
    public ConnectionFactory connectionFactory(){
        CachingConnectionFactory factory = new CachingConnectionFactory();
        factory.setPublisherReturns(true);
        factory.setPublisherConfirms(true);
        return factory;
    }

    @Bean
//    @ConfigurationProperties(prefix = "spring.rabbitmq.template")
    public RabbitTemplate rabbitTemplate(){
        RabbitTemplate template = new RabbitTemplate(connectionFactory());
        template.setReturnCallback(new RabbitTemplate.ReturnCallback(){


            @Override
            public void returnedMessage(Message message, int i, String s, String s1, String s2) {
                System.out.println(message);
                System.out.println(i);
                System.out.println(s);
                System.out.println(s1);
                System.out.println(s2);
            }
        });

        template.setConfirmCallback(new RabbitTemplate.ConfirmCallback() {
            @Override
            public void confirm(CorrelationData correlationData, boolean b, String s) {
                System.out.println(b);
                System.out.println(s);
            }
        });

        template.setMandatory(true);
        return template;
    }
*/

}
