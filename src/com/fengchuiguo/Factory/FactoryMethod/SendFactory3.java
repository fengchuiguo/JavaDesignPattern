package com.fengchuiguo.Factory.FactoryMethod;

/**
 * Created by Administrator on 2015/12/23 0023.
 */
public class SendFactory3 {

    public static Sender produce3(String typeStr){
        Sender sender=null;
        try {
            //利用反射
            sender=(Sender)Class.forName("com.fengchuiguo.Factory.FactoryMethod."+typeStr).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return sender;
    }

}
