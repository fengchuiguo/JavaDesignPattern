package com.fengchuiguo.StructurePattern.Proxy.demo2;

public class Test {

// 两个代理类（CarTimeProxy、CarLogProxy）与代理对象（Car）都实现了同一个接口（Moveable），
// 并拥有相同方法（move()），可以实现代理类的传入对象是另外一个代理类，可以表现出一种“嵌套再嵌套”的感觉。

    public static void main(String[] args) {

//        先记录时间再记录日志
        Car car = new Car();
        CarLogProxy clp = new CarLogProxy(car);
        CarTimeProxy ctp = new CarTimeProxy(clp);
        ctp.move();

        System.out.println("CarTimeProxy与CarLogProxy更换顺序后");

//        先记录日志再记录时间
        Car car2 = new Car();
        CarTimeProxy ctp2 = new CarTimeProxy(car2);
        CarLogProxy clp2 = new CarLogProxy(ctp2);
        clp2.move();

    }

}
