package com.company.BEHAVIORALPatterns.MediatorPattern.TemplatePattern;

public abstract class Game {

    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //template method

    public final void play(){

        initialize();

        startPlay();

        endPlay();

    }
}
