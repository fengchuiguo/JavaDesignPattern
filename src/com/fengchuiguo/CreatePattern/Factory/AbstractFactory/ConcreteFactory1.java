package com.fengchuiguo.CreatePattern.Factory.AbstractFactory;

/**
 * Created by Administrator on 2015/12/23 0023.
 */
public class ConcreteFactory1 extends AbstractFactory {
    @Override
    public AbstractProductA CreateProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB CreateProductB() {
        return new ProductB1();
    }
}
