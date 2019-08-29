package com.company.BEHAVIORALPatterns.MediatorPattern.TemplatePattern;

public class Cricket extends Game{

    @Override
    void startPlay() {
        System.out.println("Cricket started");
    }

    @Override
    void initialize() {
        System.out.println("Cricket initialized");
    }

    @Override
    void endPlay() {
        System.out.println("Cricked stopped");
    }
}
