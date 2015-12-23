package com.fengchuiguo.Factory.FactoryMethod;

/**
 * Created by Administrator on 2015/12/23 0023.
 */
public class TestSimpleFactory {
    public static void main(String[] args) {
        Sender sender1 = SendFactory.produce("mail");
        sender1.send();
        Sender sender2 = SendFactory.produce("sms");
        sender2.send();
//        Sender sender3 = SendFactory.produce("ddd");
//        sender3.send();

        SendFactory2.produceMail().send();
        SendFactory2.produceSms().send();

        SendFactory3.produce3("MailSender").send();
        SendFactory3.produce3("SmsSender").send();
    }
}
