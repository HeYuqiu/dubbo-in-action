package com.hyq.dubbo.demo;

import com.hyq.dubbo.demo.api.Demo2Service;
import com.hyq.dubbo.demo.api.DemoService;
import com.hyq.dubbo.demo.domain.DemoRequest;
import com.hyq.dubbo.demo.domain.DemoResponse;
import org.apache.dubbo.config.Constants;
import org.apache.dubbo.rpc.RpcContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by heyuqiu on 2019/1/15.
 */
public class Consumer {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/demo-consumer.xml"});
        context.start();
        RpcContext.getContext().setAttachment("dubbo.tag","test");
        DemoService demoService = (DemoService) context.getBean("demoService"); // get remote service proxy
        Demo2Service demo2Service = (Demo2Service) context.getBean("demo2Service"); // get remote service proxy

        DemoRequest request = new DemoRequest();
        request.setName("hyq");
        DemoResponse response = demoService.sayHello(request);
//        RpcContext.getContext().setAttachment("dubbo.tag","test");
        DemoResponse response2 = demo2Service.sayHello2(request);
        System.out.println("1 收到结果：" + response.getResultMsg());
        System.out.println("2 收到结果：" + response2.getResultMsg());

    }
}
