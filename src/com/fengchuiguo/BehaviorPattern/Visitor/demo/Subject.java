package com.fengchuiguo.BehaviorPattern.Visitor.demo;

public interface Subject {
    public void accept(Visitor visitor);

    public String getSubject();
}
