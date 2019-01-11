package com.example.andreafranco.roomwordsample;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

@Database(entities = {Word.class}, version = 1, exportSchema = false)
public abstract class WordRoomDatabase extends RoomDatabase {

    public abstract WordDao workDao();

    private static volatile WordRoomDatabase INSTANCE;

    static WordRoomDatabase getDatabase(Context context) {
        if (INSTANCE == null) {
            synchronized (WordRoomDatabase.class) {
                if (INSTANCE == null) {
                    //Create DB
                    INSTANCE = Room.databaseBuilder(
                            context,
                            WordRoomDatabase.class,
                            "word_database").build();
                }
            }
        }

        return INSTANCE;
    }
}
