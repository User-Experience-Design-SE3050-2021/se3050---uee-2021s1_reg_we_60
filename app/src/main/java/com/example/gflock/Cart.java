package com.example.gflock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class Cart extends AppCompatActivity {
    int minteger = 0;

    public Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        button = findViewById(R.id.check);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Cart.this, Adress.class);
                startActivity(intent);

                Toast toast = Toast.makeText(Cart.this, "Add address...", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }

    public void increaseInteger(View view) {
        minteger = minteger + 1;
        display(minteger);

    }

    public void decreaseInteger(View view) {
        minteger = minteger - 1;
        display(minteger);
    }

    private void display(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.integer_number1);
        displayInteger.setText("" + number);
    }


}