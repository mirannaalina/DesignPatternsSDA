package com.company.BEHAVIORALPatterns.MediatorPattern.TemplatePattern;

public class Football extends Game {

    @Override
    void endPlay() {
        System.out.println("Football finished");
    }

    @Override
    void initialize() {
        System.out.println("Footbal initialized");
    }

    @Override
    void startPlay() {
        System.out.println("Football started");
    }
}
