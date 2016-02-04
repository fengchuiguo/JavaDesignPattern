package com.fengchuiguo.BehaviorPattern.Command.demo;

public class MyCommand implements Command {

    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exe() {
        System.out.println("MyCommand exe()");
        receiver.action();
    }

}
