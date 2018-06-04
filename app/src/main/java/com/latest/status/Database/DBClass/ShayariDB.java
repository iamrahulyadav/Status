package com.latest.status.Database.DBClass;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.latest.status.Database.Entity.Shayari;

@Database(entities = {Shayari.class}, version = 1)
public abstract class ShayariDB extends RoomDatabase {

    private static ShayariDB INSTANCE;

    public static ShayariDB getDB(Context context) {
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(), ShayariDB.class, "Shayari").build();
        }
        return INSTANCE;
    }

    public static void destroy() {
        INSTANCE = null;
    }
}
