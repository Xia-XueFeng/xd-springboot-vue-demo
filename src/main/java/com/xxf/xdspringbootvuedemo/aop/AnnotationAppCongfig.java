package com.xxf.xdspringbootvuedemo.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author:rooten
 * @Date:2021/1/29
 * @Description:
 */
@Configuration
@ComponentScan("com.xxf")
@EnableAspectJAutoProxy  // 开启spring对aspect的支持
public class AnnotationAppCongfig {
}
