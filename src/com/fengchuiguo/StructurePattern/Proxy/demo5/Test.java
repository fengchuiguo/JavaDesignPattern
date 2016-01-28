package com.fengchuiguo.StructurePattern.Proxy.demo5;

/**
 * 编码模拟jdk动态代理的实现
 */
public class Test {

	public static void main(String[] args) throws Exception {
		Car car = new Car();
		InvocationHandler h = new TimeHandler(car);
		Moveable m = (Moveable)Proxy.newProxyInstance(Moveable.class,h);
//		m.move();
//		m.move2();

		//例如这样：简单的“aop”的实现。
		InvocationHandler hlog = new LogHandler(m);
		Moveable m2 = (Moveable)Proxy.newProxyInstance(Moveable.class,hlog);
		m2.move();

	}

}
