package com.xxf.xdspringbootvuedemo.mapper;

import com.xxf.xdspringbootvuedemo.model.entity.User;
import com.xxf.xdspringbootvuedemo.model.request.LoginRequest;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @Author:rooten
 * @Date:2021/2/7
 * @Description:
 */
@Repository
public interface UserMapper {
    int save(User user);

    User findByPhone(@Param("phone") String phone);


    User findByPhoneAndPwd(String phone, String pwd);

    User findByUserId(Integer userId);
}
