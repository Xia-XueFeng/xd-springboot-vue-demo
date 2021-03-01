package com.xxf.xdspringbootvuedemo.mapper;

import com.xxf.xdspringbootvuedemo.model.entity.VideoOrder;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author:rooten
 * @Date:2021/2/27
 * @Description:
 */
@Repository
public interface VideoOrderMapper {

    VideoOrder findByUserIdAndVideoIdAndState(@Param("user_id") Integer userId,@Param("video_id") int videoId, @Param("state") int i);

    int saveOrder(VideoOrder newVideoOrder);

    List<VideoOrder> listOrderByUserId(Integer userId);
}
