package com.zhwxp.springboot.amqp.listener;

import com.zhwxp.springboot.amqp.config.MessageConsumerConfig;
import com.zhwxp.springboot.amqp.model.Message;
import com.zhwxp.springboot.amqp.service.MessageConsumerService;
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

    @RabbitListener(queues = MessageConsumerConfig.QUEUE_NAME)
    public void receiveMessage(Message message) {
        messageConsumerService.processMessage(message);
    }

}
