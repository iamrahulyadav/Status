package com.latest.status.Database.Entity.LoveQuotes;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;

@Entity(tableName = "status_quotes")
public class Status {

    @ColumnInfo(name = "id")
    private int id;

    @ColumnInfo(name = "cat")
    private String cat;

    @ColumnInfo(name = "text")
    private String text;

    public Status(int id, String cat, String text) {
        this.id = id;
        this.cat = cat;
        this.text = text;
    }
}
