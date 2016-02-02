package com.fengchuiguo.BehaviorPattern.Observer.demo;

public class Test {
    public static void main(String[] args) {
        Subject subject = new MySubject();
        Observer observer1 = new Observer1();
        Observer observer2 = new Observer2();
        subject.add(observer1);
        subject.add(observer2);
        subject.operation();
    }
}
