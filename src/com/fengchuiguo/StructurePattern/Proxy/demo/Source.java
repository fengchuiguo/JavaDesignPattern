package com.fengchuiguo.StructurePattern.Proxy.demo;

public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("the original method!");
    }
}
