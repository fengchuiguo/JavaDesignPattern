package com.fengchuiguo.StructurePattern.Proxy.demo3JDK;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimeHandler implements InvocationHandler{

    private Object target;

    public TimeHandler(Object target) {
        this.target = target;
    }

    /**
     *
     * @param proxy 被代理对象
     * @param method 被代理对象的方法
     * @param args 方法的参数
     * @return 方法的返回值（Object）
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long startTime=System.currentTimeMillis();
        System.out.println("汽车开始行驶....");
        method.invoke(target);
        long endTime=System.currentTimeMillis();
        System.out.println("汽车结束行驶....");
        System.out.println("汽车行驶时间：" + (endTime - startTime) + "毫秒！");
        return null;
    }


}
