package com.example.gflock.HelperClasses.HomeAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
//import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gflock.R;


import java.util.ArrayList;



public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.AdapterAllCategoriesViewHolder> {

    ArrayList<CategoriesHelperClass> mostCategoryLocations;

    public CategoriesAdapter(ArrayList<CategoriesHelperClass>  mostCategoryLocations) {
        this. mostCategoryLocations=  mostCategoryLocations;
    }

    @NonNull
    @Override
    public AdapterAllCategoriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.categories_design, parent, false);
        AdapterAllCategoriesViewHolder lvh = new AdapterAllCategoriesViewHolder(view);
        return lvh;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterAllCategoriesViewHolder holder, int position) {

        CategoriesHelperClass helperClass =  mostCategoryLocations.get(position);
        holder.imageView.setImageResource(helperClass.getImage());
        holder.textView.setText(helperClass.getTitle());
        //holder.linearlayout.setBackground(helperClass.getGradient());
    }

    @Override
    public int getItemCount() {
        return  mostCategoryLocations.size();
    }

    public static class AdapterAllCategoriesViewHolder extends RecyclerView.ViewHolder {

        //LinearLayout linearLayout;
        ImageView imageView;
        TextView textView;

        public AdapterAllCategoriesViewHolder(@NonNull View itemView) {
            super(itemView);

            //relativeLayout = itemView.findViewById(R.id.);
            imageView = itemView.findViewById(R.id.c_image);
            textView = itemView.findViewById(R.id.c_text);
        }
    }
}