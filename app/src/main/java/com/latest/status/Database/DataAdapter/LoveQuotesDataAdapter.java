package com.latest.status.Database.DataAdapter;

import android.content.Context;

import com.latest.status.DataClass.Category;
import com.latest.status.Database.DBHelper.LoveQuotesDBHelper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

public class LoveQuotesDataAdapter {

    private LoveQuotesDBHelper mDBHelper;
    private Context context;

    public LoveQuotesDataAdapter(Context context) {
        this.context = context;
    }

    public void openDB() {
        mDBHelper = new LoveQuotesDBHelper(context);
        File database = context.getApplicationContext().getDatabasePath(LoveQuotesDBHelper.DBNAME);
        if (!database.exists()) {
            mDBHelper.getReadableDatabase();
            copyDB();
        }
    }

    private boolean copyDB() {
        try {
            InputStream inputStream = context.getAssets().open(LoveQuotesDBHelper.DBNAME);
            String outFileName = LoveQuotesDBHelper.DBLOC + LoveQuotesDBHelper.DBNAME;
            OutputStream outputStream = new FileOutputStream(outFileName);
            byte[] buff = new byte[1024];
            int length = 0;

            while ((length = inputStream.read(buff)) > 0) {
                outputStream.write(buff, 0, length);
            }
            outputStream.flush();
            outputStream.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
