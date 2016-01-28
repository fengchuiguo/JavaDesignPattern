package com.fengchuiguo.StructurePattern.Proxy.demo3JDK;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理测试类
 */
public class Test {
    public static void main(String[] args) {
        Car car=new Car();
        InvocationHandler invocationHandler=new TimeHandler(car);
        Class<?> clazz=car.getClass();

        /**
         * Proxy.newProxyInstance参数说明
         *类加载器、实现接口、InvocationHandler对象
         */
        Moveable moveable=(Moveable) Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),invocationHandler);
        moveable.move();
    }
}
