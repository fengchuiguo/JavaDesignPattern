package com.fengchuiguo.Singleton;

/**
 * Created by Administrator on 2015/12/17 0017.
 */
public class TestSingleton {

    public static void main(String[] args) {
        //普通类
        NotSingleton n01 = new NotSingleton();
        NotSingleton n02 = new NotSingleton();
        if (n01 == n02) {
            System.out.println("n01和n02是同一个实例");
        } else {
            System.out.println("n01和n02不是同一个实例");
        }

        //饿汉模式
        Singleton s11 = Singleton.getInstance();
        Singleton s12 = Singleton.getInstance();
        if (s11 == s12) {
            System.out.println("s11和s12是同一个实例");
        } else {
            System.out.println("s11和s12不是同一个实例");
        }

        //懒汉模式
        Singleton2 s21 = Singleton2.getInstance();
        Singleton2 s22 = Singleton2.getInstance();
        if (s21 == s22) {
            System.out.println("s21和s22是同一个实例");
        } else {
            System.out.println("s21和s22不是同一个实例");
        }

        //懒汉模式（线程安全）
        Singleton3 s31 = Singleton3.getInstance3();
        Singleton3 s32 = Singleton3.getInstance3();
        if (s31 == s32) {
            System.out.println("s31和s32是同一个实例");
        } else {
            System.out.println("s31和s32不是同一个实例");
        }

    }

}
