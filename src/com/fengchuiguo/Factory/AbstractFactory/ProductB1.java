package com.fengchuiguo.Factory.AbstractFactory;

/**
 * Created by Administrator on 2015/12/23 0023.
 */
public class ProductB1 extends AbstractProductB {
    @Override
    public void Interact(AbstractProductA a) {
//        interact :互动; 相互作用; 互相影响;
        System.out.println(this + " interacts with " + a);
    }
}
