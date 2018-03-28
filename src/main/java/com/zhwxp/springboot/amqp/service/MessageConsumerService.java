package com.zhwxp.springboot.amqp.service;

import com.zhwxp.springboot.amqp.model.Message;

public interface MessageConsumerService {

    void processMessage(Message message);

}
