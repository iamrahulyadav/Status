package com.latest.status.Database.Entity.Jokes;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "hindi_jokes")
public class Hindi {

    @PrimaryKey(autoGenerate = true)
    private long uid;

    @ColumnInfo(name = "cat")
    private String cat;

    @ColumnInfo(name = "text")
    private String text;

    public Hindi(long uid, String cat, String text) {
        this.uid = uid;
        this.cat = cat;
        this.text = text;
    }

    public long getUid() {
        return uid;
    }

    public String getCat() {
        return cat;
    }

    public String getText() {
        return text;
    }
}
