package com.fengchuiguo.CreatePattern.Factory.FactoryMethod;

/**
 * Created by Administrator on 2015/12/23 0023.
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is MailSender!");
    }

}
