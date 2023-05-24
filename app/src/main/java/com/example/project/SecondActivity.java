package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.SharedPreferences;
import android.content.Context;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        button = findViewById(R.id.Button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Save data to Shared Preferences
                SharedPreferences sharedPreferences = getSharedPreferences("shared_preferances", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("struffies", "future_data_value");
                editor.apply();

                finish();
            }
        });
    }
}