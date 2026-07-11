package org.example.designpatterns.behavioural.command;

public class Remote {

    Command command;

    public Remote(){

    }
    public void setCommand(Command command){
        this.command = command;
    }

    public void pressButton(){
        this.command.execute();
    }
}
