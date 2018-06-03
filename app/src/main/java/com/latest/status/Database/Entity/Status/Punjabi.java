package com.latest.status.Database.Entity.Status;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;

@Entity(tableName = "punjabi_status")
public class Punjabi {

    @ColumnInfo(name = "id")
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
}
