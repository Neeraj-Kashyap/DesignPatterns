package org.example.designpatterns.behavioural.memento;

public class Editor {

    private String content;
    private int fileSize;
    private String fileName;

    public void setContent(String content){
        this.content = content;
    }

    public String getContent(){
        return content;
    }
    public void setFileName(String fileName){
        this.fileName=fileName;
    }

    public String setFileName(){
        return fileName;
    }

    public void setFileSize(int fileSize){
        this.fileSize=fileSize;
    }

    public int getFileSize(){
        return fileSize;
    }

    public EditorState createState(){
        return new EditorState(content,fileName,fileSize);
    }

    public void restore(EditorState state){
        content = state.getContent();
    }



}
