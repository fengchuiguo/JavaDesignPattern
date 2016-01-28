package com.fengchuiguo.StructurePattern.Adapter.demo.interfaceAdapter;

public class Test {

    public static void main(String[] args) {
        SourceSub1 source1 = new SourceSub1();
        Sourceable source2 = new SourceSub2();

        source1.method1();
        System.out.println("-1-");
        source1.method2();
        System.out.println("-2-");
        source2.method1();
        System.out.println("-3-");
        source2.method2();
    }

}
