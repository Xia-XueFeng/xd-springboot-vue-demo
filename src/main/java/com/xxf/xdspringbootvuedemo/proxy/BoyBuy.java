package com.xxf.xdspringbootvuedemo.proxy;

/**
 * @Author:rooten
 * @Date:2021/1/19
 * @Description:
 */
public class BoyBuy implements IBuy{
    @Override
    public String buy() {
        System.out.println("男孩买了一个游戏机");
        return "游戏机";
    }
}
