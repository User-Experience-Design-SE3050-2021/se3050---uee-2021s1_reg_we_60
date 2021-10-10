package com.example.gflock;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.WindowManager;

import com.example.gflock.HelperClasses.HomeAdapter.CategoriesHelperClass;
import com.example.gflock.HelperClasses.HomeAdapter.CategoriesAdapter;
import com.example.gflock.HelperClasses.HomeAdapter.FeaturedAdapter;
    import com.example.gflock.HelperClasses.HomeAdapter.FeaturedHelperClass;
import com.example.gflock.HelperClasses.HomeAdapter.MostViewedAdapter;
import com.example.gflock.HelperClasses.HomeAdapter.MostViewedHelperClass;

import java.util.ArrayList;

public class HomePage extends AppCompatActivity {
    RecyclerView featurerecycled,mostViewedRecycler,categoriesRecycler;
    RecyclerView.Adapter adapter;
   // private GradientDrawable gradient1,gradient2,gradient3,gradient4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_home_page);

        //Hooks
        featurerecycled = findViewById(R.id.feature_recycled);
        mostViewedRecycler= findViewById(R.id.bestseller_recycled);
        categoriesRecycler = findViewById(R.id.categories_recycled);


        featurerecycled();
       mostViewedRecycler();
       categoriesRecycler();


    }


    //Main
    private void featurerecycled() {

        featurerecycled.setHasFixedSize(true);
        featurerecycled.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        ArrayList<FeaturedHelperClass> featuredLocations = new ArrayList<>();

        featuredLocations.add(new FeaturedHelperClass(R.drawable.men4,"Washed Blue Jeans","LKR3,850.00"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.image3,"Off Shoulder Top","LkR2450.00"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.iamge8,"Ribbed Cropped Tank Top","LKR1580.00"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.image6,"Long Sleeved Peplum Top","LKR1580.00"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.image7,"Maxi Dress-789","LKR4580.00"));

    adapter = new FeaturedAdapter(featuredLocations);
    featurerecycled.setAdapter(adapter);

        //GradientDrawable gradient1 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT,new int[]{0xffeff400,0xffaff600});

    }


    private void mostViewedRecycler() {

       mostViewedRecycler.setHasFixedSize(true);
       mostViewedRecycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<MostViewedHelperClass> mostViewedLocations = new ArrayList<>();
        mostViewedLocations.add(new MostViewedHelperClass(R.drawable.image3,"Off Shoulder Top","LKR1,850.00"));
        mostViewedLocations.add(new MostViewedHelperClass(R.drawable.image2,"Maxi Dress-789","LKR2,850.00"));
        mostViewedLocations.add(new MostViewedHelperClass(R.drawable.image7,"Maxi Dress-500","LKR3,850.00"));
        mostViewedLocations.add(new MostViewedHelperClass(R.drawable.image7,"Maxi Dress-500","LKR3,850.00"));


        adapter = new MostViewedAdapter(mostViewedLocations);
        mostViewedRecycler.setAdapter(adapter);

    }

    private void categoriesRecycler() {

        //All Gradients
       // gradient2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xffd4cbe5, 0xffd4cbe5});
        //gradient1 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xff7adccf, 0xff7adccf});
        //gradient3 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xfff7c59f, 0xFFf7c59f});
        //gradient4 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xffb8d7f5, 0xffb8d7f5});


        ArrayList<CategoriesHelperClass> categoriesHelperClasses = new ArrayList<>();
        categoriesHelperClasses.add(new CategoriesHelperClass(R.drawable.image6,"Tops"));
        categoriesHelperClasses.add(new CategoriesHelperClass(R.drawable.men3,"Jeans"));
        categoriesHelperClasses.add(new CategoriesHelperClass(R.drawable.men1,"Menswear"));
        categoriesHelperClasses.add(new CategoriesHelperClass(R.drawable.image7,"Frocks"));
        categoriesHelperClasses.add(new CategoriesHelperClass(R.drawable.image4,"Blouse"));


        categoriesRecycler.setHasFixedSize(true);
        adapter = new CategoriesAdapter(categoriesHelperClasses);
        categoriesRecycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        categoriesRecycler.setAdapter(adapter);

    }


}