package com.fengchuiguo.StructurePattern.Adapter.demo.objectAdapter;

//Adapter类，这次不继承Source类，而是持有Source类的实例，实现Targetable接口
public class Wrapper implements Targetable {

    private Source source;

    public Wrapper(Source source) {
        super();
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }

}
