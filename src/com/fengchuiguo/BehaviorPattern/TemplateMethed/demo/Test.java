package com.fengchuiguo.BehaviorPattern.TemplateMethed.demo;

public class Test {
    public static void main(String[] args) {
        String exp = "1+2";
        AbstractCalculator abstractCalculator=new Plus();
        System.out.println(abstractCalculator.calculate(exp, "\\+"));
    }
}
