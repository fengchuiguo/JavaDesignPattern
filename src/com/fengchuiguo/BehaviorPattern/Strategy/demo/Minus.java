package com.fengchuiguo.BehaviorPattern.Strategy.demo;

/**
 * 三个实现类 之 减-
 */
public class Minus implements ICalculator {
    @Override
    public int calculate(String exp) {
        int arrayInt[] = CalculatorHelp.split(exp, "-");
        return arrayInt[0] - arrayInt[1];
    }
}
