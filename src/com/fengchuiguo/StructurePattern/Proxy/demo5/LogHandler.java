package com.fengchuiguo.StructurePattern.Proxy.demo5;

import java.lang.reflect.Method;

public class LogHandler implements InvocationHandler {

    private Object target;

    public LogHandler(Object target) {
        this.target = target;
    }

    @Override
    public void invoke(Object o, Method m) {
        try {
            System.out.println("日志开始....");
            m.invoke(target);
            long endTime = System.currentTimeMillis();
            System.out.println("日志结束....");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
