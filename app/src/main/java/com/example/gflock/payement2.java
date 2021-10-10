package com.example.gflock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class payement2 extends AppCompatActivity {

    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payement2);

        button= findViewById(R.id.pay);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(payement2.this, HomePage.class);
                startActivity(intent);

                Toast.makeText(payement2.this, "Paid Successfully...", Toast.LENGTH_SHORT).show();
            }
        });
    }
}