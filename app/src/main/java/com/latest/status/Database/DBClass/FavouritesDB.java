package com.latest.status.Database.DBClass;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.latest.status.Database.Entity.Favourites.Jokes;
import com.latest.status.Database.Entity.Favourites.LoveQuotes;
import com.latest.status.Database.Entity.Favourites.Shayari;
import com.latest.status.Database.Entity.Favourites.Status;

@Database(entities = {Jokes.class, LoveQuotes.class, Shayari.class, Status.class}, version = 1)
public abstract class FavouritesDB extends RoomDatabase {

    private static FavouritesDB INSTANCE;

    public static FavouritesDB getDB(Context context) {
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(), FavouritesDB.class, "Favourites").build();
        }
        return INSTANCE;
    }

    public static void destroy() {
        INSTANCE = null;
    }
}
