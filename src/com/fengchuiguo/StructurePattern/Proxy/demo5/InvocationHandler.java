package com.fengchuiguo.StructurePattern.Proxy.demo5;

import java.lang.reflect.Method;

public interface InvocationHandler {
	public void invoke(Object o, Method m);
}
