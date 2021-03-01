package com.xxf.xdspringbootvuedemo.mapper;



import com.xxf.xdspringbootvuedemo.model.entity.Video;
import com.xxf.xdspringbootvuedemo.model.entity.VideoBanner;
import com.xxf.xdspringbootvuedemo.model.entity.Video;
import com.xxf.xdspringbootvuedemo.model.entity.VideoBanner;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VideoMapper{

    /**
     * 查询视频列表
     * @return
     */
    List<Video> listVideo();

    List<VideoBanner> listVideoBanner();

    Video findDetailById(@Param("video_id") int videoId);

    Video findById(int videoId);
}
