package com.company.CREATIONALPatterns.SingletonPattern;

public class s {

    public static void main(String[] args) {

        //SingletonPattern ob = new SingletonPattern(); //eroare, constructorul meu e privat, are o singura instanta pe care o pot apela

        SingletonPattern ob = SingletonPattern.getInstance();

        ob.showMessage();
    }
}
