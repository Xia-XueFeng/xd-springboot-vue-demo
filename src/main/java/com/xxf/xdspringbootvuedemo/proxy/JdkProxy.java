package com.xxf.xdspringbootvuedemo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/**
 * @Author:rooten
 * @Date:2021/1/28
 * @Description: 动态代理
 */
public class JdkProxy implements InvocationHandler {
    // 目标类
    private Object targetObject;

    // 获取代理对象
    public Object newProxyInstance(Object targetObject) {
        this.targetObject = targetObject;

        // 绑定关系，就是和具体的哪个实现类关联
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),
                targetObject.getClass().getInterfaces(),this);
    }
    /**
     * proxy:代理类代理的真实代理对象com.sun.proxy.$Proxy0
     * method:我们所要调用某个对象真实的方法的Method对象
     * args:指代代理对象方法传递的参数
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = null;

        try{
            System.out.println("JDK动态代理调用"+method.getName() +", 打印日志 begin");
            result = method.invoke(targetObject,args);
            System.out.println("JDK动态代理调用"+method.getName() +", 打印日志 end");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
