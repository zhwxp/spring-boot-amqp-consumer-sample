package com.zhwxp.spring.boot.amqp.consumer.listener;

import com.zhwxp.spring.boot.amqp.consumer.config.MessageConsumerConfig;
import com.zhwxp.spring.boot.amqp.consumer.model.Message;
import com.zhwxp.spring.boot.amqp.consumer.service.MessageConsumerService;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumerListener {

    private final MessageConsumerService messageConsumerService;

    @Autowired
    public MessageConsumerListener(MessageConsumerService messageConsumerService) {
        this.messageConsumerService = messageConsumerService;
    }

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(value = MessageConsumerConfig.QUEUE_NAME, durable = "true"),
            exchange = @Exchange(value = MessageConsumerConfig.EXCHANGE_NAME, durable = "true"),
            key = MessageConsumerConfig.ROUTING_KEY)
    )
    public void receiveMessage(Message message) {
        messageConsumerService.processMessage(message);
    }

}
