package com.fengchuiguo.StructurePattern.Adapter.demo.classAdapter;

public class Test {

    public static void main(String[] args) {
        Targetable targetable = new Adapter();
        targetable.method1();
        targetable.method2();
//        这样Targetable接口的实现类Adapter就具有了Source类的功能。
    }

}
