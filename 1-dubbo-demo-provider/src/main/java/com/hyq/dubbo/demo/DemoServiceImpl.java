package com.hyq.dubbo.demo;

import com.hyq.dubbo.demo.api.Demo2Service;
import com.hyq.dubbo.demo.api.DemoService;
import com.hyq.dubbo.demo.domain.DemoRequest;
import com.hyq.dubbo.demo.domain.DemoResponse;
import org.apache.dubbo.rpc.RpcContext;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by heyuqiu on 2019/1/14.
 */
public class DemoServiceImpl implements DemoService {
    @Autowired
    private Demo2Service demo2Service;

    public DemoResponse sayHello(DemoRequest request) {
        System.out.println("provider收到请求：" + request.toString());
        String attachment = RpcContext.getContext().getAttachment("dubbo.tag");
        DemoResponse demoResponse = demo2Service.sayHello2(new DemoRequest());
        DemoResponse response = new DemoResponse();
        response.setResultCode(200);
        response.setResultMsg("Hello " + request.getName() + " tag:" + attachment);
        return response;
    }
}
