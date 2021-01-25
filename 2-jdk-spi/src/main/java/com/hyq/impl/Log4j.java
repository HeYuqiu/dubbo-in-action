package com.hyq.impl;

import com.hyq.Log;

/**
 * @author Yuqiu.He
 * @date 2020-08-09
 */
public class Log4j implements Log {
    public void log(String log) {
        System.out.println("Log4j:" + log);
    }
}
