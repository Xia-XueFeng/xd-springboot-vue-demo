package com.xxf.xdspringbootvuedemo.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.time.LocalDate;

/**
 * @Author:rooten
 * @Date:2020/11/27
 * @Description:测试定时任务
 */
// 容器扫描
@Component
public class VideTestSchedule {

    @Scheduled(fixedRate = 2000)
    private void testSchedule() {
        System.out.println(LocalDate.now()+"定时任务");
    }
}
