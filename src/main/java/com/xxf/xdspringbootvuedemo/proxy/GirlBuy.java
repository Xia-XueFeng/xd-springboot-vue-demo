package com.xxf.xdspringbootvuedemo.proxy;

/**
 * @Author:rooten
 * @Date:2021/1/19
 * @Description:
 */
public class GirlBuy implements IBuy {
    @Override
    public String buy() {
        System.out.println("女孩买了一条漂亮的裙子");

        return "裙子";
    }
}
