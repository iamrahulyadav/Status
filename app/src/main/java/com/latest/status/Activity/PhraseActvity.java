package com.latest.status.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.latest.status.Adapters.PhraseRVAdapter;
import com.latest.status.Database.DataAdapter.LoveQuotesDataAdapter;
import com.latest.status.Database.DataAdapter.StatusDataAdapter;
import com.latest.status.R;

import java.util.ArrayList;
import java.util.List;


public class PhraseActvity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private int cat_id;
    private List<String> text;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view);

        text = new ArrayList<>();

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        if (getIntent() != null) {
            cat_id = getIntent().getIntExtra("cat_id", 0);
            String table = getIntent().getStringExtra("table");
            if (table.equalsIgnoreCase("occasions_statuses") || table.equalsIgnoreCase("love_messages")) {
                text = new LoveQuotesDataAdapter(getApplicationContext()).getCatText(cat_id, table);
            } else if (table.equalsIgnoreCase("english_status") || table.equalsIgnoreCase("hindi_status")) {
                text = new StatusDataAdapter(getApplicationContext()).getCatText(cat_id, table);
            }
            recyclerView.setAdapter(new PhraseRVAdapter(text));
        }
    }
}
