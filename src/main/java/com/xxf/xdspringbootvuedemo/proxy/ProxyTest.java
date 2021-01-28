package com.xxf.xdspringbootvuedemo.proxy;

import java.time.LocalDateTime;

/**
 * @Author:rooten
 * @Date:2021/1/28
 * @Description: 代理测试
 */
public class ProxyTest {
    public static void main(String[] args) {
        /*PayService payService = new PayServiceImpl();
        payService.callback("3240023");
        *//*静态代理的方法调用*//*
        PayService payService1 = new StaticProxyServiceImpl(new PayServiceImpl());
        payService1.save(123,23243);*/
//        // JDK动态代理
//        JdkProxy jdkProxy = new JdkProxy();
//
//        // 获取代理类对象
//        PayService payServiceProxy = (PayService)jdkProxy.newProxyInstance(new PayServiceImpl());
//
//        // 掉用目标方法
//        payServiceProxy.callback("23fsdjs-sfds");

        // Cglib动态代理
        CglibProxy cglibProxy = new CglibProxy();
        PayService payService = (PayService) cglibProxy.newProxyInstance(new PayServiceImpl());

        // 调用目标方法
        payService.callback("sdsdsd");




    }
}
