package com.xxf.xdspringbootvuedemo.service.impl;


import com.xxf.xdspringbootvuedemo.config.CacheKeyManager;
import com.xxf.xdspringbootvuedemo.model.entity.Video;
import com.xxf.xdspringbootvuedemo.model.entity.VideoBanner;
import com.xxf.xdspringbootvuedemo.mapper.VideoMapper;
import com.xxf.xdspringbootvuedemo.service.VideoService;
import com.xxf.xdspringbootvuedemo.utils.BaseCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    private VideoMapper videoMapper;

    @Autowired
    private BaseCache baseCache;

    @Override
    public Video findDetailById(int videoId) {
        // 单独构建一个缓存key，每个视频的key是不一样的
        String videoCachekey = String.format(CacheKeyManager.VIDEO_DETAIL,videoId);
        System.out.println("视频详情key"+videoCachekey);
        try{

            Object cacheObject = baseCache.getOneHourCache().get( videoCachekey, ()->{
                System.out.println("查询数据库");
                // 需要使用mybaits关联复杂查询
                Video video = videoMapper.findDetailById(videoId);

                return video;

            });

            if(cacheObject instanceof Video){
                System.out.println("查询Guava缓存");
                Video video = (Video)cacheObject;
                return video;
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public List<VideoBanner> listBanner() {
        /*try{

            Object cacheObj =  baseCache.getTenMinuteCache().get(CacheKeyManager.INDEX_BANNER_KEY, ()->{
*/
                List<VideoBanner> bannerList =  videoMapper.listVideoBanner();

                System.out.println("从数据库里面找轮播图列表");

                return bannerList;
//
//            });
//
//            if(cacheObj instanceof List){
//                List<VideoBanner> bannerList = (List<VideoBanner>)cacheObj;
//                return bannerList;
//            }
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        return null;
    }

    @Override
    public List<Video> listVideo() {
        try{
            Object cacheObj = baseCache.getTenMinuteCache().get(CacheKeyManager.INDEX_VIDEL_LIST, () -> {
                List<Video> videoList = videoMapper.listVideo();
                return videoList;
            });
            if(cacheObj instanceof List) {
                List<Video> videoList = (List<Video>) cacheObj;
                return videoList;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //可以返回兜底数据，业务系统降级-》SpringCloud专题课程
        return null;
    }
}
