package com.hyq;

import java.util.ServiceLoader;

/**
 * @author Yuqiu.He
 * @date 2021/1/25
 */
public class Main {
    public static void main(String[] args) {
        ServiceLoader<Log> serviceLoader = ServiceLoader.load(Log.class);
        for (Log log : serviceLoader) {
            log.log("hyq");
        }
    }
}
