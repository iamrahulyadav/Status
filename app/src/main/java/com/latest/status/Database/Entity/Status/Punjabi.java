package com.latest.status.Database.Entity.Status;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "punjabi_status")
public class Punjabi {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "cat")
    private int cat;

    @ColumnInfo(name = "text")
    private String text;

    public Punjabi(int id, int cat, String text) {
        this.id = id;
        this.cat = cat;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public int getCat() {
        return cat;
    }

    public String getText() {
        return text;
    }
}
