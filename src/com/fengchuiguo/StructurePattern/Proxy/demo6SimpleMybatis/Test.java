package com.fengchuiguo.StructurePattern.Proxy.demo6SimpleMybatis;

import java.util.List;

/**
 * demo6说明：简单的编码学习模拟MyBatis接口式编程的动态代理实现;
 * 以便于理解MyBatis如何从接口类调用方法用而执行xml配置的sql的。
 * 具体实现比这个要复杂很多，详细可以去看MyBatis源码。
 */
public class Test {

    public static void main(String[] args) throws Exception {
        System.out.println("加载配置信息...");
        System.out.println("通过加载配置信息，加载了一个代理工厂Map；");
        System.out.println("这个Map存放的是接口Class与对应的代理工厂。");

        SqlSession sqlSession = new SqlSession();
        MyInterface myInterface = sqlSession.getMapper(MyInterface.class);
        List<Object> list = myInterface.query(new Object());
        System.out.println("测试查询完毕：" + list.size());
    }

}
