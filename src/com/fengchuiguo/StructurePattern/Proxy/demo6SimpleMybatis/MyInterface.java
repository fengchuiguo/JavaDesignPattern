package com.fengchuiguo.StructurePattern.Proxy.demo6SimpleMybatis;

import java.util.List;

/**
 * MyBatis执行增删改查的接口类
 */
public interface MyInterface {
    public List<Object> query(Object object);
}
