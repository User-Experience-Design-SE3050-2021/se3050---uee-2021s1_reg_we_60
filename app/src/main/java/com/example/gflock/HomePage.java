package com.example.gflock;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;

import com.example.gflock.HelperClasses.HomeAdapter.FeaturedAdapter;
import com.example.gflock.HelperClasses.HomeAdapter.FeaturedHelperClass;

import java.util.ArrayList;

public class HomePage extends AppCompatActivity {
    RecyclerView featurerecycled;
    RecyclerView.Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_home_page);

        //Hooks
        featurerecycled = findViewById(R.id.feature_recycled);

        featurerecycled();

    }

    private void featurerecycled() {

        featurerecycled.setHasFixedSize(true);
        featurerecycled.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        ArrayList<FeaturedHelperClass> featuredLocations = new ArrayList<>();
        featuredLocations.add(new FeaturedHelperClass(R.drawable.men3,"Trouser","ghghsgd bjbbjaja bjjds"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.image2,"Trouser","ghghsgd bjbbjaja bjjds"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.image4,"Trouser","ghghsgd bjbbjaja bjjds"));

    adapter = new FeaturedAdapter(featuredLocations);
    featurerecycled.setAdapter(adapter);

    }
}