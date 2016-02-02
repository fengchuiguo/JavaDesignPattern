package com.fengchuiguo.BehaviorPattern.Observer.demo_JDK;

import java.util.Observable;

public class ObservableSubject extends Observable {

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void update() {
        setChanged();

        notifyObservers();
//        MyObserver1 Observable o ((ObservableSubject)o).getId():998
//        MyObserver1 Observable o ((ObservableSubject)o).getName():小明
//        MyObserver2 Object arg (String)arg:null

//        notifyObservers(name);
////        MyObserver1 Observable o ((ObservableSubject)o).getId():998
////        MyObserver1 Observable o ((ObservableSubject)o).getName():小明
////        MyObserver2 Object arg (String)arg:小明

//        notifyObservers(this);
////        MyObserver1 Observable o ((ObservableSubject)o).getId():998
////        MyObserver1 Observable o ((ObservableSubject)o).getName():小明
////        MyObserver2 Object arg (String)arg:com.fengchuiguo.BehaviorPattern.Observer.demo_JDK.ObservableSubject@4203fcfb

    }

}
