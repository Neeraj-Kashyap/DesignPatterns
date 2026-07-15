package org.example.designpatterns.behavioural.command;

public class MainCommand {

    public static void main(String[] args) {

        TV tv = new TV(); // executor
        Remote remote = new Remote(); //controller

        Command tvOnCommand = new TvOnCommand(tv); //tv on command
        Command tvOffCommand = new TvOffCommand(tv); //tv off command

        remote.setCommand(tvOnCommand);
        remote.pressButton();

        remote.setCommand(tvOffCommand);
        remote.pressButton();

    }


}
