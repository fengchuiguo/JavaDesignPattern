package com.fengchuiguo.BehaviorPattern.Observer.demo_JDK;

import java.util.Observable;
import java.util.Observer;

public class Test {
    public static void main(String[] args) {
        ObservableSubject observable = new ObservableSubject();
        Observer myObserver1 = new MyObserver1();
        Observer myObserver2 = new MyObserver2();
        observable.addObserver(myObserver2);
        observable.addObserver(myObserver1);
        observable.setId(998);
        observable.setName("小明");
        observable.update();
    }
}
