package com.xxf.xdspringbootvuedemo.aop;

import java.time.LocalDateTime;

/**
 * @Author:rooten
 * @Date:2021/1/28
 * @Description: 横切关注点
 */
public class TimeHandler {

    public void printBefore() {
        System.out.println("printBefore 日志 time = "+ LocalDateTime.now().toString());
    }

    public void printAfter() {
        System.out.println("printAfter 日志 time = "+ LocalDateTime.now().toString());
    }
}
