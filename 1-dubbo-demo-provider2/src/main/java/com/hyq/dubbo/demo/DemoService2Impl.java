package com.hyq.dubbo.demo;

import com.hyq.dubbo.demo.api.Demo2Service;
import com.hyq.dubbo.demo.domain.DemoRequest;
import com.hyq.dubbo.demo.domain.DemoResponse;

/**
 * Created by heyuqiu on 2019/1/14.
 */
public class DemoService2Impl implements Demo2Service {

    public DemoResponse sayHello2(DemoRequest request) {
        System.out.println("provider2收到请求：" + request.toString());
        DemoResponse response = new DemoResponse();
        response.setResultCode(200);
        response.setResultMsg("provider2: Hello " + request.getName());
        return response;
    }
}
