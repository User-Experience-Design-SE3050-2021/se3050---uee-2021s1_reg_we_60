package com.example.gflock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MyAccount extends AppCompatActivity {

    public Button profile, wishlist, signout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_account);

        profile = findViewById(R.id.profilebtn);
        wishlist = findViewById(R.id.interestsBtn);
        signout = findViewById(R.id.btn);


        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyAccount.this, Profile.class);
                startActivity(intent);

                Toast.makeText(MyAccount.this, "Profile...", Toast.LENGTH_SHORT).show();
            }
        });

        wishlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MyAccount.this, Whislist.class);
                startActivity(intent1);


                Toast.makeText(MyAccount.this, "WishList...", Toast.LENGTH_SHORT).show();

            }
        });

        signout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MyAccount.this, Login.class);
                startActivity(intent2);

                Toast.makeText(MyAccount.this, "Logged Out Successfully...", Toast.LENGTH_SHORT).show();
            }
        });


    }
}