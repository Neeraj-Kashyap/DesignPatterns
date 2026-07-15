package org.example.designpatterns.behavioural.memento;

public class Main {
    public static void main(String[] args){
        Editor editor = new Editor();
        History history = new History();


        editor.setContent("a");
        history.push(editor.createState());
        System.out.println("First state: "+editor.getContent());

        editor.setContent("b");
        history.push(editor.createState());
        System.out.println("Second state: "+editor.getContent());

        editor.setContent("c");
        editor.restore(history.pop());
        System.out.println("Editor after restore state: "+editor.getContent());

        editor.restore(history.pop());

        System.out.println(editor.getContent());

    }
}
