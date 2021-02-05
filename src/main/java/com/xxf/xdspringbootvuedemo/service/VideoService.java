package com.xxf.xdspringbootvuedemo.service;


import com.xxf.xdspringbootvuedemo.domain.Video;
import com.xxf.xdspringbootvuedemo.domain.VideoBanner;

import java.util.List;

public interface VideoService {

    List<Video> listVideo();

    Video findDetailById(int videoId);

    List<VideoBanner> listBanner();
}
