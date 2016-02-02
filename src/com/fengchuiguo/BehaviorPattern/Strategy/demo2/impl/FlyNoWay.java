package com.fengchuiguo.BehaviorPattern.Strategy.demo2.impl;

import com.fengchuiguo.BehaviorPattern.Strategy.demo2.FlyingStragety;

public class FlyNoWay implements FlyingStragety {

	public void performFly() {
		System.out.println("我不会飞行！");
	}

}
