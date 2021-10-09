package com.example.gflock.HelperClasses.HomeAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gflock.R;


import java.util.ArrayList;

public class MostViewedAdapter extends RecyclerView.Adapter<MostViewedAdapter.MostViewedViewHolder> {

    ArrayList<MostViewedHelperClass> mostViewedLocations;

    public MostViewedAdapter(ArrayList<MostViewedHelperClass> mostViewedLocations) {
        this.mostViewedLocations = mostViewedLocations;
    }

    @NonNull
    @Override
    public MostViewedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.best_sellers, parent, false);
        MostViewedViewHolder mostViewedViewHolder = new MostViewedViewHolder(view);
        return mostViewedViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MostViewedViewHolder holder, int position) {
        MostViewedHelperClass helperClass = mostViewedLocations.get(position);

        holder.imageView.setImageResource(helperClass.getImage());
        holder.textView.setText(helperClass.getTitle());
        holder.textView.setText(helperClass.getDescription());
    }

    @Override
    public int getItemCount() {
        return mostViewedLocations.size();
    }

    public static class MostViewedViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;

        public MostViewedViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.bs_image);
            textView = itemView.findViewById(R.id.bs_text);
            textView =itemView.findViewById(R.id.bs_text1);
        }
    }
}