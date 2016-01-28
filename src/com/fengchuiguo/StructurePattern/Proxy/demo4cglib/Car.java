package com.fengchuiguo.StructurePattern.Proxy.demo4cglib;

import java.util.Random;

public class Car {
	public void move() {
		try {
			Thread.sleep(new Random().nextInt(1000));
			System.out.println("汽车行驶中....");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
