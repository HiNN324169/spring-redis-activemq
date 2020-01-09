package com.nn.service;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

public class QueueProducerService {

    @Resource(name = "jmsTemplate")
    private JmsTemplate jmsTemplate;

    public String send(final String text){

        try {
            jmsTemplate.send(new MessageCreator() {
                public Message createMessage(Session session) throws JMSException {
                    TextMessage message_text = session.createTextMessage(text);
                    return message_text;
                }
            });
            return "success";
        }catch (Exception e){
            e.printStackTrace();
            return "fail";
        }

    }
}
