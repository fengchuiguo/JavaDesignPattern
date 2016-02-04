package com.fengchuiguo.BehaviorPattern.Command.demo;

public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action() {
        System.out.println("Invoker action()");
        command.exe();
    }

}
