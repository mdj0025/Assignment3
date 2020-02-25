package com.example.assignment_3;

public class Note {
    private int id;
    private String noteContent;

    public Note(int id_in, String noteContentIn){
        this.id = id_in;
        this.noteContent = noteContentIn;
    }

    public String getText(){
        return this.noteContent;
    }

    public int getId(){
        return this.id;
    }

    public void setNoteContent(String noteIn){
        this.noteContent = noteIn;
    }

    public void setId(int id_in){
        this.id = id_in;
    }

}
