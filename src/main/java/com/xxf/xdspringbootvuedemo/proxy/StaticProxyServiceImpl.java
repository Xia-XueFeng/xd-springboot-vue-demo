package com.xxf.xdspringbootvuedemo.proxy;

/**
 * @Author:rooten
 * @Date:2021/1/28
 * @Description:由程序创建或特定工具自动生成源代码，在程序运行前，代理类的.class文件就已经存在
 * A->B->C
 */
public class StaticProxyServiceImpl implements PayService{
    private PayService payService;

    public StaticProxyServiceImpl(PayService payService) {
        this.payService = payService;
    }

    @Override
    public String callback(String outTradeNo) {
        System.out.println("静态代理 --- start");
        String result = payService.callback(outTradeNo);
        System.out.println("静态代理 --- end");
        return result;
    }

    @Override
    public int save(int userId, int productId) {
        System.out.println("静态代理 --- start");
        int result = payService.save(userId, productId);
        System.out.println("静态代理 --- end");
        return result;
    }
}
