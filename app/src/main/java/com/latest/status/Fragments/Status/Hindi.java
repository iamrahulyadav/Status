package com.latest.status.Fragments.Status;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.latest.status.Activity.PhraseActvity;
import com.latest.status.Adapters.PhraseRVAdapter;
import com.latest.status.Adapters.RecyclerItemClickListener;
import com.latest.status.DataClass.Category;
import com.latest.status.Database.DataAdapter.StatusDataAdapter;
import com.latest.status.R;

import java.util.ArrayList;
import java.util.List;


public class Hindi extends Fragment {
    private RecyclerView recyclerView;
    private List<Category> categories;
    private List<String> cat_name;
    private List<Integer> cat_id;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.recycler_view,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        categories = new StatusDataAdapter(getContext()).getCatList("hindi_cat");

        cat_name = new ArrayList<>();
        cat_id = new ArrayList<>();

        for (int i = 0; i < categories.size(); i++) {
            cat_id.add(categories.get(i).getId());
            cat_name.add(categories.get(i).getCat());
        }

        recyclerView.setAdapter(new PhraseRVAdapter(cat_name));

        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(getContext(), new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Intent intent = new Intent(getContext(), PhraseActvity.class);
                intent.putExtra("cat_id", categories.get(position).getId());
                intent.putExtra("table", "hindi_status");
                startActivity(intent);
            }
        }));
    }
}
