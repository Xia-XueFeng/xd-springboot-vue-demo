package com.xxf.xdspringbootvuedemo.service;

import com.xxf.xdspringbootvuedemo.domain.Video;

/**
 * @Author:rooten
 * @Date:2021/1/28
 * @Description:
 */
public class VideoServiceImpl implements VideoService{
    @Override
    public int save(Video video) {
        System.out.println("保存video");
        return 0;
    }

    @Override
    public Video findById(int id) {
        System.out.println("根据id找视频");
        return new Video();
    }
}
