package com.fengchuiguo.BehaviorPattern.Observer.demo_JDK;

import java.util.Observable;
import java.util.Observer;

public class MyObserver1 implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("MyObserver1 Observable o ((ObservableSubject)o).getId():"
                + ((ObservableSubject)o).getId());
        System.out.println("MyObserver1 Observable o ((ObservableSubject)o).getName():"
                + ((ObservableSubject)o).getName());
    }
}
