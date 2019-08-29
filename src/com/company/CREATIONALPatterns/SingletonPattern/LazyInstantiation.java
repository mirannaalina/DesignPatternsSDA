package com.company.CREATIONALPatterns.SingletonPattern;

public class LazyInstantiation {

    private static LazyInstantiation obj;

    private LazyInstantiation(){};

    public static LazyInstantiation getLazyInstatiation(){

        //cream obiectul in metoda
        if(obj ==null){
            obj = new LazyInstantiation();
        }
        return obj;
    }

    public void doSomething(){
        System.out.println("obiectul se creaza in metoda.");
    }
}
