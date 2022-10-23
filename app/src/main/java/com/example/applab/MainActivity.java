package com.example.applab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnNewPostulant = findViewById(R.id.btnNewPostulant);
        Button btnSearchPostulant = findViewById(R.id.btnSearchPostulant);


        btnNewPostulant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent next = new Intent(getApplicationContext(), CreatePostulantActivity.class);
                startActivity(next);
                String str = "";

                Log.d(TAG, str);
            }
        });

        btnSearchPostulant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent next = new Intent(getApplicationContext(), SearchPostulantActivity.class);
                startActivity(next);
                String str = "";

                Log.d(TAG, str);
            }
        });
    }
}