package com.latest.status.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.latest.status.R;

import java.util.List;

public class PhraseRVAdapter extends RecyclerView.Adapter<PhraseRVAdapter.PhraseViewHolder>{

    private List<String> textList;

    public PhraseRVAdapter(List<String> textList){
        this.textList = textList;
    }

    @NonNull
    @Override
    public PhraseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PhraseViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.phrase_view_template,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull PhraseViewHolder holder, int position) {
            holder.text.setText(textList.get(position));
    }

    @Override
    public int getItemCount() {
        return textList.size();
    }

    @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public static class PhraseViewHolder extends RecyclerView.ViewHolder{

        private TextView text;

        private PhraseViewHolder(View itemView) {
            super(itemView);

            text = itemView.findViewById(R.id.phrase);
        }
    }
}
