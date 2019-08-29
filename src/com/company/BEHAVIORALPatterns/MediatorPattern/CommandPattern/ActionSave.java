package com.company.BEHAVIORALPatterns.MediatorPattern.CommandPattern;


public class ActionSave implements ActionListenerCommand {
    private Document doc;

    public ActionSave(Document doc){

        this.doc =doc;
    }

    @Override
    public void execute() {
        doc.save();
    }
}
