package com.hyq.impl;

import com.hyq.Log;
import com.sun.tools.javac.util.ServiceLoader;

import java.sql.DriverManager;

/**
 * @author Yuqiu.He
 * @date 2020-08-09
 */
public class Logback implements Log {
    public void log(String log) {
//        DriverManager
        System.out.println("logback:" + log);
    }
}
