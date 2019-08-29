package com.company.BEHAVIORALPatterns.MediatorPattern.VisitorPattern;

public class Mouse implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
