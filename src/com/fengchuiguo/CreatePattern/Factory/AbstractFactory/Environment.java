package com.fengchuiguo.CreatePattern.Factory.AbstractFactory;

/**
 * Created by Administrator on 2015/12/23 0023.
 */
public class Environment {
    private AbstractProductA abstractProductA;
    private AbstractProductB abstractProductB;

    public Environment(AbstractFactory abstractFactory) {
        abstractProductA = abstractFactory.CreateProductA();
        abstractProductB = abstractFactory.CreateProductB();
    }

    public void run() {
        abstractProductB.Interact(abstractProductA);
    }

}
