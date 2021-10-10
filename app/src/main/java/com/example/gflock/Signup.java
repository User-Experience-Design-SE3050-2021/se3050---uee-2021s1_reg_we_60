package com.example.gflock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Signup extends AppCompatActivity {

    public Button button ;
    public TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        button = findViewById(R.id.signupButton);
        textView = findViewById(R.id.log);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Signup.this, Login.class);
                startActivity(intent);

                Toast toast = Toast.makeText(Signup.this, "Successfully Signed up...",Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Signup.this, Login.class);
                startActivity(intent1);

                Toast toast = Toast.makeText(Signup.this, "To Sign up...",Toast.LENGTH_SHORT);
                toast.show();
            }
        });

    }
}