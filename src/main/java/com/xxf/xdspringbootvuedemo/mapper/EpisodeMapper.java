package com.xxf.xdspringbootvuedemo.mapper;

import com.xxf.xdspringbootvuedemo.model.entity.Episode;
import org.apache.ibatis.annotations.Param;

public interface EpisodeMapper {


    Episode findFirstEpisodeByVideoId(@Param("video_id") int videoId);

}
