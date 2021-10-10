package com.example.gflock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import android.os.Bundle;
import android.widget.Toast;

public class ClothDetails extends AppCompatActivity {

    int minteger = 0;

    public ImageView wishlist;
    public Button cart, buy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cloth_details);

        wishlist = findViewById(R.id.wish);
        cart = findViewById(R.id.addtocart);
        buy = findViewById(R.id.buynow);

        wishlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClothDetails.this, Whislist.class);
                startActivity(intent);

                Toast toast = Toast.makeText(ClothDetails.this, "Wishlist....", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(ClothDetails.this, Cart.class);
                startActivity(intent1);

                Toast toast = Toast.makeText(ClothDetails.this, "Added to cart successfully....", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(ClothDetails.this, Adress.class);
                startActivity(intent2);

                Toast toast = Toast.makeText(ClothDetails.this, "Buy now....", Toast.LENGTH_SHORT);
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
                R.id.integer_number);
        displayInteger.setText("" + number);
    }
}