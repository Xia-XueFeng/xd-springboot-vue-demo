package com.xxf.xdspringbootvuedemo.config;

/**
 * @Author:rooten
 * @Date:2021/2/28
 * @Description: 缓存key管理
 */
public class CacheKeyManager {
    /**
     * 首页轮播图缓存key
     */
    public static final String INDEX_BANNER_KEY = "index:banner:list";

    /**
     * 首页视频列表缓存key
     */
    public static final String INDEX_VIDEL_LIST = "index:video:list";


    /**
     * 视频详情缓存key, %s是视频id
     */
    public static final String VIDEO_DETAIL = "video:detail:%s";
}
