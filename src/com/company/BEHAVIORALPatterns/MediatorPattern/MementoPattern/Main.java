package com.company.BEHAVIORALPatterns.MediatorPattern.MementoPattern;

public class Main {

    public static void main(String[] args) {

        Originator org = new Originator();
        CareTaker caretk = new CareTaker();

        org.setState("State 1");
        org.setState("State 2");
        caretk.add(org.saveStateToMemento());

        org.setState("State 4");

        org.setState("State 5");
        caretk.add(org.saveStateToMemento());

        org.getStateFromMemento(caretk.get(0));

        System.out.println("First saved state: " + org.getState());
        org.getStateFromMemento(caretk.get(1));
        System.out.println("Second saved State: " + org.getState());
    }
}
