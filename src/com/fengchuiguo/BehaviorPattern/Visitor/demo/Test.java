package com.fengchuiguo.BehaviorPattern.Visitor.demo;

public class Test {
    public static void main(String[] args) {
        Visitor visitor=new MyVisitor();
        Subject subject=new MySubject();
        subject.accept(visitor);
    }
}
