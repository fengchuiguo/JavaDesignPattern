package com.fengchuiguo.Factory.FactoryMethod;

/**
 * Created by Administrator on 2015/12/23 0023.
 */
public class SendFactory{

    public static Sender produce(String typeStr){
        if ("mail".equals(typeStr)) {
            return new MailSender();
        } else if ("sms".equals(typeStr)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }

}
