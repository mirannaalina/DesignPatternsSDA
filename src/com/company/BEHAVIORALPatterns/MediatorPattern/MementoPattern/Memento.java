package com.company.BEHAVIORALPatterns.MediatorPattern.MementoPattern;

public class Memento {

    //oricand poti reveni la o versiune anterioara

    private String state;

    public Memento(String state){
        this.state= state;
    }
    public String getState(){
        return state;
    }
}
