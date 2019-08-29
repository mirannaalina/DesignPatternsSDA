package com.company.CREATIONALPatterns.BuilderPattern;

public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 5.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
