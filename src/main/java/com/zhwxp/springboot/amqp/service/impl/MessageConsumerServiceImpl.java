package com.zhwxp.springboot.amqp.service.impl;

import com.zhwxp.springboot.amqp.model.Message;
import com.zhwxp.springboot.amqp.service.MessageConsumerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumerServiceImpl implements MessageConsumerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MessageConsumerServiceImpl.class);

    @Override
    public void processMessage(Message message) {
        LOGGER.info("Received message: {}", message.toString());
    }

}
