package com.hyq.dubbo.demo;

import com.alibaba.dubbo.container.Main;
import com.hyq.dubbo.demo.api.DemoService;
import com.hyq.dubbo.demo.domain.DemoRequest;
import com.hyq.dubbo.demo.domain.DemoResponse;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by heyuqiu on 2019/1/15.
 */
public class Consumer {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/demo-consumer.xml"});
        context.start();
        DemoService demoService = (DemoService) context.getBean("demoService"); // get remote service proxy

        DemoRequest request = new DemoRequest();
        request.setName("hyq");
        DemoResponse response = demoService.sayHello(request);
        System.out.println("收到结果：" + response.getResultMsg());

        System.in.read();

    }
}
