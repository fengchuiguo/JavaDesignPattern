package com.fengchuiguo.StructurePattern.Bridge.demo;

public class MyBridge extends Bridge{
    @Override
    public void method() {
        getSource().method();
    }
}
