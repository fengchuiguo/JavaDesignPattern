package com.fengchuiguo.BehaviorPattern.Interpreter.demo;

public class Test {
    public static void main(String[] args) {
        // 计算5+6-7的值
        System.out.println(new Minus().interpret(new Context(new Plus().interpret(new Context(5, 6)), 7)));
    }
}
