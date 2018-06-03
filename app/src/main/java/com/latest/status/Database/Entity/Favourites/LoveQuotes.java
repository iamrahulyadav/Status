package com.latest.status.Database.Entity.Favourites;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;

@Entity(tableName = "fav_lovequotes")
public class LoveQuotes {


    @ColumnInfo(name = "uid")
    private int id;

    @ColumnInfo(name = "type")
    private String type;

    @ColumnInfo(name = "cat")
    private String cat;

    @ColumnInfo(name = "type")
    private String text;

    public LoveQuotes(int id, String type, String cat, String text) {
        this.id = id;
        this.type = type;
        this.cat = cat;
        this.text = text;
    }
}
