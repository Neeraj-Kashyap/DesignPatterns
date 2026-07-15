package org.example.designpatterns.behavioural.memento;

public class EditorState {

    private final String content;
    private final String fileName;
    private final int fontSize;

    public EditorState(String content, String fileName, int fontSize){
        this.content=content;
        this.fileName=fileName;
        this.fontSize=fontSize;
    }

    public String getFileName(){
        return fileName;
    }

    public String getContent(){
        return content;
    }

    public int getFontSize(){
        return fontSize;
    }

}
