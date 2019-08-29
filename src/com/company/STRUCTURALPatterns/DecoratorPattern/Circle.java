package com.company.STRUCTURALPatterns.DecoratorPattern;

import com.company.CREATIONALPatterns.FactoryPattern.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
