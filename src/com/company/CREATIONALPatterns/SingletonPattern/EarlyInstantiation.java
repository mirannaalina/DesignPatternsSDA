package com.company.CREATIONALPatterns.SingletonPattern;

public class EarlyInstantiation {

    private static EarlyInstantiation ob = new EarlyInstantiation();

    private EarlyInstantiation(){};

    public static EarlyInstantiation getEarlyInstantiation(){
        return ob;
    }
    public void doSomething(){
        System.out.println("instatiarea inainte");
    }
}
