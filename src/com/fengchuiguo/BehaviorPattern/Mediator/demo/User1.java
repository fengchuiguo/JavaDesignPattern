package com.fengchuiguo.BehaviorPattern.Mediator.demo;

public class User1 extends User {

    public User1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user1 work()!");
    }
}
