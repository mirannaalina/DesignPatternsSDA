package com.company.STRUCTURALPatterns.DecoratorPattern;


import com.company.CREATIONALPatterns.FactoryPattern.Shape;

public class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator (Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
