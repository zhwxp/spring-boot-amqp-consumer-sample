package com.zhwxp.spring.boot.amqp.consumer.service;

import com.zhwxp.spring.boot.amqp.consumer.model.Message;

public interface MessageConsumerService {

    void processMessage(Message message);

}
