package com.hyq.dubbo.demo;

import org.apache.dubbo.container.Main;

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
