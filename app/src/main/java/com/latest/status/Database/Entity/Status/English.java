package com.latest.status.Database.Entity.Status;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;

@Entity(tableName = "eng_status")
public class English {

    @ColumnInfo(name = "id")
    private int id;

    @ColumnInfo(name = "cat")
    private String cat;

    @ColumnInfo(name = "text")
    private String text;

    public English(int id, String cat, String text) {
        this.id = id;
        this.cat = cat;
        this.text = text;
    }
}
