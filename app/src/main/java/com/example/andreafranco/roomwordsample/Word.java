package com.example.andreafranco.roomwordsample;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "word_table")
public class Word {

   /* @PrimaryKey(autoGenerate = true)
    private int id;*/

    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "word")
    private String mWord;

    public Word(@NonNull String word) {
        this.mWord = word;
    }

    public void setWord(@NonNull String word) {
        mWord = word;
    }

    public String getWord() {
        return mWord;
    }

}
