package com.example.gflock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class review extends AppCompatActivity {

    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);

        button = findViewById(R.id.continu);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(review.this,payement1.class);
                startActivity(intent);

                Toast toast = Toast.makeText(review.this, "Saved...", Toast.LENGTH_SHORT);
                toast.show();

            }
        });

    }
}