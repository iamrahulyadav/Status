package com.latest.status.Database.DBClass;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.latest.status.Database.Entity.LoveQuotes.Message;
import com.latest.status.Database.Entity.LoveQuotes.Status;

@Database(entities = {Message.class, Status.class}, version = 1)
public abstract class LoveQuotesDB extends RoomDatabase {

    private static LoveQuotesDB INSTANCE;

    public static LoveQuotesDB getDB(Context context) {
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(), LoveQuotesDB.class, "LoveQuotes").build();
        }
        return INSTANCE;
    }

    public static void destroy() {
        INSTANCE = null;
    }
}
