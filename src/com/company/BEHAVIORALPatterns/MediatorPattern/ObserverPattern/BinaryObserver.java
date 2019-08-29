package com.company.BEHAVIORALPatterns.MediatorPattern.ObserverPattern;


public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subj){
        this.subject = subj;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String " + Integer.toBinaryString(subject.getState()));
    }
}
