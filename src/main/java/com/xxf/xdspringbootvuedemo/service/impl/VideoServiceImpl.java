package com.xxf.xdspringbootvuedemo.service.impl;


import com.xxf.xdspringbootvuedemo.domain.Video;
import com.xxf.xdspringbootvuedemo.domain.VideoBanner;
import com.xxf.xdspringbootvuedemo.mapper.VideoMapper;
import com.xxf.xdspringbootvuedemo.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    private VideoMapper videoMapper;

    @Override
    public Video findDetailById(int videoId) {

        // 需要使用mybaits关联复杂查询
        Video video = videoMapper.findDetailById(videoId);
        return video;
    }

    @Override
    public List<VideoBanner> listBanner() {
        return videoMapper.listVideoBanner();
    }

    @Override
    public List<Video> listVideo() {
        // int i = 1/0;
        return videoMapper.listVideo();
    }
}
