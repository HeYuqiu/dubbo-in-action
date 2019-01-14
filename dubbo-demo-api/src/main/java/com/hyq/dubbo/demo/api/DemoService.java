package com.hyq.dubbo.demo.api;

import com.hyq.dubbo.demo.domain.DemoRequest;
import com.hyq.dubbo.demo.domain.DemoResponse;

/**
 * Created by heyuqiu on 2019/1/15.
 */
public interface DemoService {
    DemoResponse sayHello(DemoRequest request);
}

