package com.fengchuiguo.Factory.FactoryMethod;

/**
 * Created by Administrator on 2015/12/23 0023.
 */
public class SendFactory2 {

    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }

}
