package com.fengchuiguo.StructurePattern.Proxy.demo6SimpleMybatis;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * MyBatis中的
 */
public class MapperProxy implements InvocationHandler{


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("通过接口与method获取对应的配置文件中的信息：");
        System.out.println("接口名称.方法==namespace.id");
        System.out.println("通过配置文件中的信息获取SQL语句的类型，");
        System.out.println("根据SQL语句类型调用sqlSession对应的增删改查方法，");
        System.out.println("当SQL语句类型是查询时：");
        System.out.println("根据返回值的类型是List、Map、Object");
        System.out.println("分别调用selectList、selectMap、selectOne方法");
        System.out.println("然后,就返回查询结果...");
        List<Object> list=new ArrayList<Object>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        return list;
    }

}
