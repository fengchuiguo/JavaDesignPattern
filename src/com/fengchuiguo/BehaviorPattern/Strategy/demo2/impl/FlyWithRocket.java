package com.fengchuiguo.BehaviorPattern.Strategy.demo2.impl;

import com.fengchuiguo.BehaviorPattern.Strategy.demo2.FlyingStragety;

public class FlyWithRocket implements FlyingStragety {

	public void performFly() {
		System.out.println("用火箭在太空遨游");
	}

}
