package com.xxf.xdspringbootvuedemo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Author:rooten
 * @Date:2021/1/29
 * @Description: 切面类，定义切入点和通知
 */
//@Component
//@Aspect
public class LogAdvice {

    // 切入点表达式
    @Pointcut("execution(* com.xxf.xdspringbootvuedemo.service.impl.VideoServiceImpl.*(..))")
    public void aspect() {

    }

    // 前置通知
    @Before("aspect()")
    public void beforeLog(JoinPoint joinPoint){
        System.out.println("LogAdvice  beforeLog");
    }

    // 后置通知
    @After("aspect()")
    public void afterLog(JoinPoint joinPoint) {
        System.out.println("LogAdvice afterLog");
    }

    /**
     * 环绕通知
     * @param joinPoint
     */
    @Around("aspect()")
    public void around(JoinPoint joinPoint) {

        Object target = joinPoint.getTarget().getClass();
        System.out.println("调用者="+ target);

        // 目标方法签名
        System.out.println("调用方法="+joinPoint.getSignature());

        // 通过joinPoint获取参数
        Object [] args = joinPoint.getArgs();
        System.out.println("参数="+args[0]);

        long start = System.currentTimeMillis();
        System.out.println("环绕通知 环绕前 =======");

        // 执行连接点的方法
        try{
            ((ProceedingJoinPoint)joinPoint).proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("环绕通知 环绕后=======");
        System.out.println("调用方法总耗时 time = "+(end -start) +"ms");
    }


}
