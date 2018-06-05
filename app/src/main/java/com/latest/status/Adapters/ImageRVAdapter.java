package com.latest.status.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.latest.status.DataClass.ImageTemplate;
import com.latest.status.R;

import java.util.List;

public class ImageRVAdapter extends RecyclerView.Adapter<ImageRVAdapter.ImageViewHolder> {

    private List<ImageTemplate> imageTemplates;

    public ImageRVAdapter(List<ImageTemplate> imageTemplates) {
        this.imageTemplates = imageTemplates;
    }

    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ImageViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.image_template, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ImageViewHolder holder, int position) {
        ImageTemplate temp = imageTemplates.get(position);
        holder.imageView.setImageResource(temp.getImageId());
        holder.textView.setText(temp.getImageDesc());
    }

    @Override
    public int getItemCount() {
        return imageTemplates.size();
    }

    public static class ImageViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;
        private TextView textView;

        public ImageViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.image_view);
            textView = itemView.findViewById(R.id.image_desc);
        }
    }
}

