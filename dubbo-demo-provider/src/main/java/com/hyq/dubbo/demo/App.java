package com.hyq.dubbo.demo;

import com.alibaba.dubbo.container.Main;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by heyuqiu on 2019/1/15.
 */
public class App {
    public static void main(String[] args) throws IOException {
        Main.main(args);
//
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/dubbo-demo-provider.xml"});
//        context.start();
//
//        System.in.read(); // press any key to exit
    }
}
