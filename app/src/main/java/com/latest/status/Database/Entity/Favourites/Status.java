package com.latest.status.Database.Entity.Favourites;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "fav_status")
public class Status {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "type")
    private String type;

    @ColumnInfo(name = "cat")
    private String cat;

    @ColumnInfo(name = "text")
    private String text;

    public Status(int id, String type, String cat, String text) {
        this.id = id;
        this.type = type;
        this.cat = cat;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getCat() {
        return cat;
    }

    public String getText() {
        return text;
    }
}
