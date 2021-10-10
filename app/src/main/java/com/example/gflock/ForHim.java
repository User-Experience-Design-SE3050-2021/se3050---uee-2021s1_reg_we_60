package com.example.gflock;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ForHim extends AppCompatActivity {

    public CardView cardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_him);

        cardView = findViewById(R.id.crewneck);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ForHim.this, ClothDetails.class);
                startActivity(intent);

                Toast toast = Toast.makeText(ForHim.this, "Crew Neck T- Shirt Selected...", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}