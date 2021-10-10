package com.example.gflock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Adress extends AppCompatActivity {

    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adress);

        button = findViewById(R.id.next);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Adress.this,review.class);
                startActivity(intent);

                Toast toast = Toast.makeText(Adress.this, "Saved And Continue...", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}