package com.latest.status.Database.DataAdapter;

import android.content.Context;

import com.latest.status.DataClass.Category;
import com.latest.status.Database.DBHelper.StatusDBHelper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;


public class StatusDataAdapter {

    private StatusDBHelper mDBHelper;
    private Context context;

    public StatusDataAdapter(Context context) {
        this.context = context;
    }

    public void openDB() {
        mDBHelper = new StatusDBHelper(context);
        File database = context.getApplicationContext().getDatabasePath(StatusDBHelper.DBNAME);
        if (!database.exists()) {
            mDBHelper.getReadableDatabase();
            copyDB();
        }
    }

    private boolean copyDB() {
        try {
            InputStream inputStream = context.getAssets().open(StatusDBHelper.DBNAME);
            String outFileName = StatusDBHelper.DBLOC + StatusDBHelper.DBNAME;
            OutputStream outputStream = new FileOutputStream(outFileName);
            byte[] buff = new byte[1024];
            int length;

            while ((length = inputStream.read(buff)) > 0) {
                outputStream.write(buff, 0, length);
            }
            outputStream.flush();
            outputStream.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Category> getCatList(String string) {
        openDB();
        return mDBHelper.getCat(string);
    }

    public List<String> getCatText(int id, String cat) {
        openDB();
        return mDBHelper.getText(id, cat);
    }
}

