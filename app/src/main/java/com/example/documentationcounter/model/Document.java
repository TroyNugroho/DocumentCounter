package com.example.documentationcounter.model;

public class Document {
    private int thesis;
    private int journal;

    public Document(){
    }

    public Document(int thesis, int journal) {
        this.thesis = thesis;
        this.journal = journal;
    }

    public int getThesis() {
        return thesis;
    }

    public int getJournal() {
        return journal;
    }

    public void setThesis(int thesis) {
        this.thesis = thesis;
    }

    public void setJournal(int journal) {
        this.journal = journal;
    }
}
