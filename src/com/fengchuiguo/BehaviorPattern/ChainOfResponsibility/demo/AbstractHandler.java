package com.fengchuiguo.BehaviorPattern.ChainOfResponsibility.demo;

public class AbstractHandler {
    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
