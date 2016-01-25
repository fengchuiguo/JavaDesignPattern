package com.fengchuiguo.CreatePattern.Factory.AbstractFactory;

/**
 * Created by Administrator on 2015/12/23 0023.
 */
public class TestAbstractFactory {

    public static void main(String[] args) {
        AbstractFactory abstractFactory1 = new ConcreteFactory1();
        Environment environment1 = new Environment(abstractFactory1);
        environment1.run();

        AbstractFactory abstractFactory2 = new ConcreteFactory1();
        Environment environment2 = new Environment(abstractFactory1);
        environment2.run();
    }

}
