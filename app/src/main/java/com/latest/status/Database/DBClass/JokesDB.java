package com.latest.status.Database.DBClass;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.latest.status.Database.Entity.Jokes.English;
import com.latest.status.Database.Entity.Jokes.Hindi;

@Database(entities = {English.class, Hindi.class}, version = 1)
public abstract class JokesDB extends RoomDatabase {

    private static JokesDB INSTANCE;

    public static JokesDB getDB(Context context) {
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(), JokesDB.class, "Jokes").build();
        }
        return INSTANCE;
    }

    public static void destroy() {
        INSTANCE = null;
    }
}
