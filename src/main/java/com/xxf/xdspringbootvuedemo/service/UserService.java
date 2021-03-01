package com.xxf.xdspringbootvuedemo.service;


import com.xxf.xdspringbootvuedemo.model.entity.User;

import java.util.Map;

/**
 * @Author:rooten
 * @Date:2021/2/7
 * @Description:
 */
public interface UserService {
    /**
     * 新增用户
     * @param userInfo
     * @return
     */
    int save(Map<String, String> userInfo);

    String findByPhoneAndPwd(String phone, String pwd);

    User findByUserId(Integer userId);
}
