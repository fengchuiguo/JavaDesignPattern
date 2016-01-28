package com.fengchuiguo.StructurePattern.Proxy.demo5;

import java.util.Random;

public class Car implements Moveable {

    @Override
    public void move() {
        try {
            Thread.sleep(new Random().nextInt(1000));
            System.out.println("汽车行驶中....");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void move2() {
        System.out.println("汽车行驶中move2move2move2");
    }

}
