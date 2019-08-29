package com.company.BEHAVIORALPatterns.MediatorPattern.VisitorPattern;

public class Main {
    public static void main(String[] args) {
        ComputerPart comp = new Computer();
        comp.accept(new ComputerPartDisplayVisitor());
    }
}
