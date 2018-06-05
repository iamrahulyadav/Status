package com.latest.status.Database.DBHelper;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.latest.status.DataClass.Category;

import java.util.ArrayList;
import java.util.List;

public class JokesDBHelper extends SQLiteOpenHelper {
    public static final String DBNAME = "Jokes.sqlite";
    public static final String DBLOC = "/data/data/com.latest.status/databases/";
    private Context context;
    private SQLiteDatabase mDatabase;

    public JokesDBHelper(Context context) {
        super(context, DBNAME, null, 1);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void openDatabase() {
        String DBPATH = context.getDatabasePath(DBNAME).getPath();
        if (mDatabase != null && mDatabase.isOpen()) {
            return;
        }
        mDatabase = SQLiteDatabase.openDatabase(DBPATH, null, SQLiteDatabase.OPEN_READWRITE);
    }

    public void closeDatabase() {
        if (mDatabase != null) {
            mDatabase.close();
        }
        mDatabase = null;
    }

    public List<Category> getCat(String string) {
        List<Category> cat = new ArrayList<>();
        openDatabase();
        Cursor cursor = mDatabase.rawQuery("SELECT cat_id, cat_name FROM " + string, null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            cat.add(new Category(cursor.getInt(0), cursor.getString(1)));
            cursor.moveToNext();
        }
        cursor.close();
        closeDatabase();
        return cat;
    }

    public List<String> getText(int id, String cat) {
        List<String> text = new ArrayList<>();
        openDatabase();
        Cursor cursor = mDatabase.rawQuery("SELECT status FROM " + cat + " WHERE cat_id = " + id, null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            text.add(cursor.getString(0));
            cursor.moveToNext();
        }
        cursor.close();
        closeDatabase();
        return text;
    }
}
