package com.fengchuiguo.BehaviorPattern.Strategy.demo2.impl;

import com.fengchuiguo.BehaviorPattern.Strategy.demo2.FlyingStragety;

public class FlyWithWin implements FlyingStragety {

	public void performFly() {
		System.out.println("振翅高飞");
	}

}
