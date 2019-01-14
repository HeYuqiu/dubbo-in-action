package com.hyq.dubbo.demo;

import com.hyq.dubbo.demo.api.DemoService;
import com.hyq.dubbo.demo.domain.DemoRequest;
import com.hyq.dubbo.demo.domain.DemoResponse;

/**
 * Created by heyuqiu on 2019/1/14.
 */
public class DemoServiceImpl implements DemoService {

    public DemoResponse sayHello(DemoRequest request) {
        System.out.println("provider收到请求：" + request.toString());
        DemoResponse response = new DemoResponse();
        response.setResultCode(200);
        response.setResultMsg("Hello " + request.getName());
        return response;
    }
}
