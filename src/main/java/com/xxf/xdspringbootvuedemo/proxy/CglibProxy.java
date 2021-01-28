package com.xxf.xdspringbootvuedemo.proxy;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author:rooten
 * @Date:2021/1/28
 * @Description:
 */
public class CglibProxy implements MethodInterceptor {
    // 目标类
    private Object targetObject;

    // 绑定关系
    public Object newProxyInstance(Object targetObject) {
        this.targetObject = targetObject;

        Enhancer enhancer = new Enhancer();
        // 设置代理类的父类(目标类)
        enhancer.setSuperclass(this.targetObject.getClass());

        // 设置回调函数
        enhancer.setCallback(this);

        // 创建子类(代理对象)
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        Object result = null;
        try{
            System.out.println("通过CGLIB动态代理调用 "+method.getName() +", 打印日志 begin");
            result = methodProxy.invokeSuper(o,args);
            System.out.println("通过CGLIB动态代理调用 "+method.getName() +", 打印日志 begin");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
