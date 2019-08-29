package com.company.BEHAVIORALPatterns.MediatorPattern.MediatorPattern;

public class Main {

    public static void main(String[] args) {


        User rob = new User("Robert");
        User john = new User("John");

        rob.sendMessage("Hi John");
        john.sendMessage("Hello Robert");

    }
}
