package com.fengchuiguo.StructurePattern.Proxy.demo6SimpleMybatis;

import java.lang.reflect.Proxy;

/**
 * SqlSession类，动态代理产生代理对象的地方
 */
public class SqlSession {

    public <T> T getMapper(Class<T> type) {
        System.out.println("通过接口的Class从代理工厂Map取出对应的代理工厂");
        System.out.println("通过代理工厂实例化一个代理类");
        System.out.println("用这个代理类生成一个代理实例返回出去");
        return (T) Proxy.newProxyInstance(type.getClassLoader(), new Class[]{type}, new MapperProxy());
    }

}
