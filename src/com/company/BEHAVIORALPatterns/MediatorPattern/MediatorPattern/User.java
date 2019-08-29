package com.company.BEHAVIORALPatterns.MediatorPattern.MediatorPattern;

import com.company.BEHAVIORALPatterns.MediatorPattern.MediatorPattern.ChatRoom;

public class User {

    //comunicarea intre 2 obiecte

    private String name;

    public String getName(){
        return name;
    }

    public User (String name){
        this.name =name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}
