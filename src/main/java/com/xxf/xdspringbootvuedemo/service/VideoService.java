package com.xxf.xdspringbootvuedemo.service;

import com.xxf.xdspringbootvuedemo.domain.Video;

/**
 * @Author:rooten
 * @Date:2021/1/28
 * @Description:
 */
public interface VideoService {

    int save(Video video);

    Video findById(int id);

}
