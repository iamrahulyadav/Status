package com.latest.status.Database.Entity.LoveQuotes;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;

@Entity(tableName = "message_quotes")
public class Message {

    @ColumnInfo(name = "id")
    private int id;

    @ColumnInfo(name = "cat")
    private String cat;

    @ColumnInfo(name = "text")
    private String text;

    public Message(int id, String cat, String text) {
        this.id = id;
        this.cat = cat;
        this.text = text;
    }
}
