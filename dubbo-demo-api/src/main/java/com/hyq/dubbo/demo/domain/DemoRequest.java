package com.hyq.dubbo.demo.domain;

import java.io.Serializable;

/**
 * Created by heyuqiu on 2019/1/15.
 */
public class DemoRequest implements Serializable {

    private static final long serialVersionUID = -5633121593839549785L;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DemoRequest{" +
                "name='" + name + '\'' +
                '}';
    }
}
