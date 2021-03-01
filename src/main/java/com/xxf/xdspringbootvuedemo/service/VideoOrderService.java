package com.xxf.xdspringbootvuedemo.service;

import com.xxf.xdspringbootvuedemo.model.entity.VideoOrder;

import java.util.List;

/**
 * @Author:rooten
 * @Date:2021/2/27
 * @Description:
 */
public interface VideoOrderService {
    int save(Integer userId, int videoId);

    List<VideoOrder> listOrderByUserId(Integer userId);
}
