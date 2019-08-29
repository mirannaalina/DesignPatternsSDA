package com.company.BEHAVIORALPatterns.MediatorPattern.StrategyPattern;

public class Main {
    public static void main(String[] args) {

        Context context = new Context(new OperationAdd()); //aplicam la runtime (ca decorator pattern)
        System.out.println("10 + 5 = " + context.executeStrategy(10,5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = "+ context.executeStrategy(10,5));

        context = new Context(new OperationMultiply());
        System.out.println(("10 * 5 = " +context.executeStrategy(10,5)));
    }
}
