package com.hyq.dubbo.demo.domain;

import java.io.Serializable;

/**
 * Created by heyuqiu on 2019/1/15.
 */
public class DemoResponse implements Serializable {
    // dubbo基于hession的二进制序列化
    private static final long serialVersionUID = 9095928069605270963L;
    private int resultCode;
    private String resultMsg;

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    @Override
    public String toString() {
        return "DemoResponse{" +
                "resultCode=" + resultCode +
                ", resultMsg='" + resultMsg + '\'' +
                '}';
    }
}
