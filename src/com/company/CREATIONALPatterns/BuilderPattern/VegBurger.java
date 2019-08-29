package com.company.CREATIONALPatterns.BuilderPattern;

public class VegBurger extends Burger{

    @Override
    public float price() {
        return 6.00f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
