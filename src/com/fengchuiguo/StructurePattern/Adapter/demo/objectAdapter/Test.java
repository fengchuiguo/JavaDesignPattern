package com.fengchuiguo.StructurePattern.Adapter.demo.objectAdapter;

public class Test {

    public static void main(String[] args) {
        Source source=new Source();
        Targetable targetable = new Wrapper(source);
        targetable.method1();
        targetable.method2();
    }

}
