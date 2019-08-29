package com.company.CREATIONALPatterns.BuilderPattern;

public abstract class Burger implements Item{

    @Override
    public Packing packing() {
        return new Wrapper();
    }
    public abstract float price();
}
