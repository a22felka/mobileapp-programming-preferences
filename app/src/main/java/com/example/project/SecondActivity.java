package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.SharedPreferences;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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
                SharedPreferences sharedPreferences = getSharedPreferences("my_preferances", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();

                EditText editText = findViewById(R.id.editText);
                String inputValue = editText.getText().toString();

                editor.putString("inputKey", "inputValue");
                editor.apply();

                finish();
            }
        });
    }
}