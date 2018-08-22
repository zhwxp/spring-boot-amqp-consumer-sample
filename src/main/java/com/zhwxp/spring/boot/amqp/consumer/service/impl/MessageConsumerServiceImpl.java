package com.zhwxp.spring.boot.amqp.consumer.service.impl;

import com.zhwxp.spring.boot.amqp.consumer.service.MessageConsumerService;
import com.zhwxp.spring.boot.amqp.consumer.model.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumerServiceImpl implements MessageConsumerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MessageConsumerServiceImpl.class);

    @Override
    public void processMessage(Message message) {
        LOGGER.info("Receive message: {}", message);
    }

}
