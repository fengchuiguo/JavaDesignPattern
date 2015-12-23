package com.fengchuiguo.Factory.AbstractFactory;

/**
 * Created by Administrator on 2015/12/23 0023.
 */
public class ConcreteFactory2 extends AbstractFactory {
    @Override
    public AbstractProductA CreateProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB CreateProductB() {
        return new ProductB2();
    }
}
