package com.fengchuiguo.Builder;

/**
 * Created by Administrator on 2015/12/23 0023.
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is SmsSender!");
    }
}
