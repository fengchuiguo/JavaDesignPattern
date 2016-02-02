package com.fengchuiguo.BehaviorPattern.Observer.demo_JDK;

import java.util.Observable;
import java.util.Observer;

public class MyObserver2 implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("MyObserver2 Object arg (String)arg:" + arg);
    }
}
