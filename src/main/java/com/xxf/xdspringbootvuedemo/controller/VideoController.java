package com.xxf.xdspringbootvuedemo.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:xxf
 * @Date:2020/11/18
 * @Description:
 */
@RestController
@RequestMapping("/api/v1/video")
public class VideoController {

    @GetMapping("json")
    public Object getJSONString() {
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String,Object> map = new HashMap<>();
        map.put("1","Elastis");
        map.put("2","ribbtmq");
        return map;
    }

}
