package com.company.CREATIONALPatterns.FactoryPattern;

public class ShapeFactory extends AbstractFactory {

    public Color getColor(String color){
        return null;
    }

    public Shape getShape(String shapetype){
        if(shapetype ==null){
            return null;
        }
        if(shapetype.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        if(shapetype.equalsIgnoreCase("RECTANGLE")){
            return  new Rectangle();
        }
        if(shapetype.equalsIgnoreCase("SQUARE")){
            return  new Square();
        }
        return null;
    }
}
