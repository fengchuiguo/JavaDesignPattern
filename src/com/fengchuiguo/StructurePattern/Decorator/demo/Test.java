package com.fengchuiguo.StructurePattern.Decorator.demo;

/**
 * Created by Administrator on 2016/1/26 0026.
 */
public class Test {
    public static void main(String[] args) {
        Sourceable source=new Source();
        Sourceable decorator=new Decorator(source);
        decorator.method();
    }
}
