package com.company.STRUCTURALPatterns.DecoratorPattern;

import com.company.CREATIONALPatterns.FactoryPattern.Shape;

public class RedShapeDecorator extends ShapeDecorator{

    //nu afectezi structura, doar o infrumusetezi

    public RedShapeDecorator(Shape decoratedShape ){
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border color: red");
    }
}
