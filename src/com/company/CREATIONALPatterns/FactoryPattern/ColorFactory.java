package com.company.CREATIONALPatterns.FactoryPattern;

public class ColorFactory extends AbstractFactory{

    public Shape getShape(String shapeType){
        return null;
    }
    public Color getColor(String color){

        if(color== null){
            return null;
        }
        if(color.equalsIgnoreCase("red")){
            return new Red();
        }
        if(color.equalsIgnoreCase("Green")){
            return new Green();
        }
        if(color.equalsIgnoreCase("blue")){
            return new Blue();
        }
        return null;
    }
}
