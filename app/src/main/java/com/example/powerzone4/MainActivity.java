package com.example.powerzone4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    Button button1,button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);






        button1= findViewById(R.id.started1);
        button2= findViewById(R.id.started2);
        button3= findViewById(R.id.started3);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Beginner.class);
                startActivity(intent);

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Intermediate.class);
                startActivity(intent);

            }
        });


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Advanced.class);
                startActivity(intent);

            }
        });





    }

    private void setSupportActionBar(Toolbar toolbar) {
    }

    public void beginner(View view) {
        Intent intent = new Intent(MainActivity.this,Beginner.class);
        startActivity(intent);
    }



    public void intermediate(View view) {
        Intent intent = new Intent(MainActivity.this,Intermediate.class);
        startActivity(intent);
    }

    public void advanced(View view) {
        Intent intent = new Intent(MainActivity.this,Advanced.class);
        startActivity(intent);
    }

    public void Diet(View view) {
        Intent intent = new Intent(MainActivity.this,Diet.class);
        startActivity(intent);
    }
}