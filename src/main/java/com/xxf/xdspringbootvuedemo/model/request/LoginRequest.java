package com.xxf.xdspringbootvuedemo.model.request;

/**
 * @Author:rooten
 * @Date:2021/2/20
 * @Description: 用户登录请求体
 */
public class LoginRequest {
    private String phone;

    private String pwd;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
