package com.xxf.xdspringbootvuedemo.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

public class Video {

    private int id;

    @Autowired
    private String title;


    public void init(){
        System.out.println("video类 init 方法被调用");
    }


    public void destroy(){
        System.out.println("video类 destroy 方法被调用");
    }


    public Video(){

        System.out.println("video 空构造函数被调用");

    }

    public Video(String title){
        //System.out.println("video 带参数构造函数被调用");
        this.title = title;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        //System.out.println("Video setId方法被调用");
        this.id = id;
    }

    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {

        //System.out.println("Video setTitle方法被调用");
        this.title = title;
    }
}
