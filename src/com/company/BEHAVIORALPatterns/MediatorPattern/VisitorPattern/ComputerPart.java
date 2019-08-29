package com.company.BEHAVIORALPatterns.MediatorPattern.VisitorPattern;

public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
