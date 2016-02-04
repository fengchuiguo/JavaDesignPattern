package com.fengchuiguo.BehaviorPattern.Mediator.demo;

public class Test {
    public static void main(String[] args) {
        Mediator myMediator=new MyMediator();
        myMediator.createMediator();
        myMediator.workAll();
    }
}
