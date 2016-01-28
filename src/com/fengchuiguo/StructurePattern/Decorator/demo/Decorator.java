package com.fengchuiguo.StructurePattern.Decorator.demo;

/**
 * Created by Administrator on 2016/1/26 0026.
 */
public class Decorator implements Sourceable {

    private Sourceable source;

    public Decorator(Sourceable source) {
        this.source = source;
    }

    @Override
    public void method() {
        System.out.println("before decorator!");
        source.method();
        System.out.println("after decorator!");
    }
}
