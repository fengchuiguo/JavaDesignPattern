package com.fengchuiguo.BehaviorPattern.Strategy.demo;

//（demo来实现两位数的简单运算）
public class Test {
    public static void main(String[] args) {
        ICalculator iCalculator1=new Plus();
        System.out.println(iCalculator1.calculate("1+2"));

        ICalculator iCalculator2=new Minus();
        System.out.println(iCalculator2.calculate("1-2"));

        ICalculator iCalculator3=new Multiply();
        System.out.println(iCalculator3.calculate("1*2"));
    }
}
