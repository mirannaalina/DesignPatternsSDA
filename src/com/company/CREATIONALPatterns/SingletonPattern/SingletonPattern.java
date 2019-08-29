package com.company.CREATIONALPatterns.SingletonPattern;

public class SingletonPattern {

    //instanta de singleton

    private static SingletonPattern instance = new SingletonPattern();

    //constructor private

    private SingletonPattern() {
    }



    //metoda getinstance  (numai prin getinstance poti apela instanta)

    public static SingletonPattern getInstance() {
        return instance;
    }



    public void showMessage() {
        System.out.println("test");
    }


}
