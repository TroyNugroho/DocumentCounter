package com.example.documentationcounter.viewmodel;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import androidx.lifecycle.ViewModel;

import com.example.documentationcounter.model.Document;

public class DashboardCounterViewModel extends ViewModel {

    public MutableLiveData<Document> scoreMutableLiveData = new MutableLiveData<>();
    public Document doc = new Document();

    public LiveData<Document> getScore(){
        return scoreMutableLiveData;
    }

    public void addJournal(int point){
        doc.setJournal(doc.getJournal()+point);
        scoreMutableLiveData.setValue(doc);
        Log.d("Journal : ", String.valueOf(doc.getJournal()));
    }

    public void addThesis(int point){
        doc.setThesis(doc.getThesis()+point);
        scoreMutableLiveData.setValue(doc);
        Log.d("Thesis : ", String.valueOf(doc.getThesis()));
    }

    public void decJournal(int point){
        if (doc.getJournal() > 0) {
            doc.setJournal(doc.getJournal()-point);
            scoreMutableLiveData.setValue(doc);
            Log.d("Journal", String.valueOf(doc.getJournal()));
        } else {
            doc.setJournal(doc.getJournal());
            scoreMutableLiveData.setValue(doc);
            Log.d("Journal", String.valueOf(doc.getJournal()));
        }
    }

    public void decThesis(int point){
        if (doc.getJournal() > 0) {
            doc.setThesis(doc.getThesis()-point);
            scoreMutableLiveData.setValue(doc);
            Log.d("Thesis", String.valueOf(doc.getThesis()));
        } else {
            doc.setThesis(doc.getThesis());
            scoreMutableLiveData.setValue(doc);
            Log.d("Thesis", String.valueOf(doc.getThesis()));
        }

    }

    public void resetJournal(){
        doc.setJournal(doc.getJournal()*0);
        scoreMutableLiveData.setValue(doc);
        Log.d("Journal : ", String.valueOf(doc.getJournal()));
    }

    public void resetThesis(){
        doc.setThesis(doc.getThesis()*0);
        scoreMutableLiveData.setValue(doc);
        Log.d("Thesis : ", String.valueOf(doc.getThesis()));
    }
}