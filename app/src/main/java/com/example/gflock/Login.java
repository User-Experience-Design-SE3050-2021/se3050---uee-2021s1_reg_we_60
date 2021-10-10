package com.example.gflock;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    public Button button;
    public TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        button =(Button) findViewById(R.id.btn);
        textView = (TextView)  findViewById(R.id.reg);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this,HomePage.class);
                startActivity(intent);

                Toast toast = Toast.makeText(Login.this, "SuccessFully Logged In...", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Login.this, Signup.class);
                startActivity(intent1);

                Toast toast = Toast.makeText(Login.this, "Sign Up....", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}