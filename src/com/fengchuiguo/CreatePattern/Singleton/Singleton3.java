package com.fengchuiguo.CreatePattern.Singleton;

/**
 * 单例模式Singleton【懒汉模式，同时实现线程安全】
 * 懒汉式单例的实现没有考虑线程安全问题，它是线程不安全的，并发环境下很可能出现多个Singleton实例，
 * 要实现线程安全，有以下三种方式，都是对getInstance这个方法改造，保证了懒汉式单例的线程安全
 * 【方法3比方法1、2都好一些，既实现了线程安全，又避免了同步带来的性能影响。建议第三种】
 * Created by Administrator on 2015/12/17 0017.
 */
public class Singleton3 {
    private Singleton3() {
    }

    private static Singleton3 instance = null;


    //    方法1、在getInstance方法上加同步
    public static synchronized Singleton3 getInstance1() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }


    //    方法2、双重检查锁定
//   【注意】此种方式需要将instance声明为 volatile；
//    也就是：private volatile static Singleton3 instance = null;
    public static Singleton3 getInstance2() {
        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }

    //    方法3、静态内部类
// 【注意】此方式：不需要 private static Singleton3 instance = null;这一段代码了

    /**
     * 类级的内部类，也就是静态的成员式内部类，该内部类的实例与外部类的实例没有绑定关系，
     * 而且只有被调用到时才会装载，从而实现了延迟加载。
     */
    private static class LazyHolder {
        /**
         * 静态初始化器，由JVM来保证线程安全
         */
        private static final Singleton3 INSTANCE = new Singleton3();
    }

    public static Singleton3 getInstance3() {
        return LazyHolder.INSTANCE;
    }

}
