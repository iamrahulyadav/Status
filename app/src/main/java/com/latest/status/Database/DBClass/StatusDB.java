package com.latest.status.Database.DBClass;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.latest.status.Database.Entity.Status.English;
import com.latest.status.Database.Entity.Status.Hindi;
import com.latest.status.Database.Entity.Status.LovePicsExt;
import com.latest.status.Database.Entity.Status.LovePicsInt;
import com.latest.status.Database.Entity.Status.Punjabi;
import com.latest.status.Database.Entity.Status.Tamil;
import com.latest.status.Database.Entity.Status.Videos;

@Database(entities = {English.class, Hindi.class, LovePicsExt.class, LovePicsInt.class, Punjabi.class, Tamil.class, Videos.class}, version = 1)
public abstract class StatusDB extends RoomDatabase {

    private static StatusDB INSTANCE;

    public static StatusDB getDB(Context context) {
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(), StatusDB.class, "Status").build();
        }
        return INSTANCE;
    }

    public static void destroy() {
        INSTANCE = null;
    }
}
