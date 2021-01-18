package com.xxf.xdspringbootvuedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

// 开启定时任务自动扫描
@EnableScheduling
@SpringBootApplication
public class XdSpringbootVueDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(XdSpringbootVueDemoApplication.class, args);
	}

}
