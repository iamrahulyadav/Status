package com.latest.status.Database.Entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;

@Entity(tableName = "shayari")
public class Shayari {

    @ColumnInfo(name = "id")
    private int id;

    @ColumnInfo(name = "cat")
    private String cat;

    @ColumnInfo(name = "text")
    private String text;

    public Shayari(int id, String cat, String text) {
        this.id = id;
        this.cat = cat;
        this.text = text;
    }
}
