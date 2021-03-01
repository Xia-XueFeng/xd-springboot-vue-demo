package com.xxf.xdspringbootvuedemo.service;


import com.xxf.xdspringbootvuedemo.model.entity.Video;
import com.xxf.xdspringbootvuedemo.model.entity.VideoBanner;

import java.util.List;

public interface VideoService {

    List<Video> listVideo();

    Video findDetailById(int videoId);

    List<VideoBanner> listBanner();
}
