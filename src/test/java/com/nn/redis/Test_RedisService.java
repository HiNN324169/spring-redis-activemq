package com.nn.redis;

import com.nn.service.RedisService;
import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Test_RedisService {

    public static void main(String[] args) {
        //        redis....
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-redis.xml");
        RedisService redisService = (RedisService) context.getBean("redisService");
        redisService.set("a", "8888888888");
        System.out.println("设置成功....");
        System.out.println("设置的数据为："+redisService.get("a"));
    }
}
