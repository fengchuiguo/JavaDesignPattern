package com.fengchuiguo.CreatePattern.Builder;

/**
 * Created by Administrator on 2015/12/23 0023.
 */
public class TestBuilder {
    public static void main(String[] args) {
        Builder builder = new Builder();
        System.out.println(builder.getList().size());

        builder.produceMailSender(10);
        System.out.println(builder.getList().size());

        builder.produceSmsSender(5);
        System.out.println(builder.getList().size());

        System.out.println(builder.getList());
    }
}
