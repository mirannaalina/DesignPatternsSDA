package com.company.CREATIONALPatterns.FactoryPattern;

public class Main {
    public static void main(String[] args) {


        AbstractFactory shapefactory = FactoryProducer.getFactory("shape");

        Shape s1 = shapefactory.getShape("CIRCLE");
        Shape s2 = shapefactory.getShape("RECTANGLE");
        Shape s3 = shapefactory.getShape("SQUARE");

        s1.draw();
        s2.draw();
        s3.draw();

        AbstractFactory colorfactory =  FactoryProducer.getFactory("color");

        Color c1 = colorfactory.getColor("RED");
        Color c2 = colorfactory.getColor("GREEN");
        Color c3 = colorfactory.getColor("Blue");

        c1.fill();
        c2.fill();
        c3.fill();

    }
}
