package com.example.gflock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class payement1 extends AppCompatActivity {

    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payement1);

        button = findViewById(R.id.pay1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(payement1.this,payement2.class);
                startActivity(intent);
                Toast toast = Toast.makeText(payement1.this, "Next....", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}