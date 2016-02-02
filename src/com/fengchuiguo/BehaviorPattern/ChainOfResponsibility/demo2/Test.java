package com.fengchuiguo.BehaviorPattern.ChainOfResponsibility.demo2;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setPriceHandler(PriceHandlerFactory.createPriceHandler());
        Random rand = new Random();
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ":");
            customer.requestDiscount(rand.nextFloat());
        }
    }
}
