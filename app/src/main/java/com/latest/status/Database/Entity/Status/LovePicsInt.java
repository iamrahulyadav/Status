package com.latest.status.Database.Entity.Status;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "lovPicsInt_status")
public class LovePicsInt {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(typeAffinity = ColumnInfo.BLOB)
    private byte[] image;

    @ColumnInfo(name = "views")
    private int views;

    @ColumnInfo(name = "downloads")
    private int downloads;

    public LovePicsInt(int id, byte[] image) {
        this.id = id;
        this.image = image;
        downloads = views = 0;
    }

    public void incDownloads(){ downloads++; }

    public void incViews(){ views++; }

    public int getId() {
        return id;
    }

    public byte[] getImage() {
        return image;
    }

    public int getViews() {
        return views;
    }

    public int getDownloads() {
        return downloads;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public void setDownloads(int downloads) {
        this.downloads = downloads;
    }
}
