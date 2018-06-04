package com.latest.status.Database.Entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "shayari")
public class Shayari {

    @PrimaryKey(autoGenerate = true)
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

    public int getId() {
        return id;
    }

    public String getCat() {
        return cat;
    }

    public String getText() {
        return text;
    }
}
