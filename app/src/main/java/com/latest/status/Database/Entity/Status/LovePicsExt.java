package com.latest.status.Database.Entity.Status;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.util.TableInfo;

import java.sql.Blob;

@Entity(tableName = "lovePicsExt_status")
public class LovePicsExt {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(typeAffinity = ColumnInfo.BLOB)
    private byte[] image;

    @ColumnInfo(name = "desc")
    private String desc;

    public LovePicsExt(int id, byte[] image, String desc) {
        this.id = id;
        this.image = image;
        this.desc = desc;
    }

}

