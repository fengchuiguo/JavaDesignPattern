package com.fengchuiguo.BehaviorPattern.Observer.demo;

public class MySubject extends AbstractSubject {
    @Override
    public void operation() {
        System.out.println("update MySubject self!");
        notifyObservers();
    }
}
