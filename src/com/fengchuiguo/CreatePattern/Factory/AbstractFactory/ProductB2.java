package com.fengchuiguo.CreatePattern.Factory.AbstractFactory;

/**
 * Created by Administrator on 2015/12/23 0023.
 */
public class ProductB2 extends AbstractProductB {
    @Override
    public void Interact(AbstractProductA a) {
        System.out.println(this + " interacts with " + a);
    }
}
