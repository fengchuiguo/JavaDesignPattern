package com.fengchuiguo.StructurePattern.Decorator.demo;

/**
 * Created by Administrator on 2016/1/26 0026.
 */
public class Source implements Sourceable{
    @Override
    public void method() {
        System.out.println("the original method!");
    }
}
