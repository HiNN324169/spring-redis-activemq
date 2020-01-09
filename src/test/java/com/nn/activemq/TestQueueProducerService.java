package com.nn.activemq;

import com.nn.service.QueueProducerService;
import org.springframework.context.ApplicationContext;
import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;

public class TestQueueProducerService {


    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-activemq.xml");

        QueueProducerService queueProducerService = (QueueProducerService) context.getBean("queueProducerService");
        String tag = queueProducerService.send("hahahahhahha ");
        System.out.println("消息发送："+tag);
    }
}
