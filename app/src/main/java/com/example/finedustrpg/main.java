package com.example.finedustrpg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick_map(View view){
        Intent intent = new Intent(this, Map.class);
        startActivity(intent);
    }
    public void onClick_settings(View view){
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }
    public void onClick_stronger(View view){
        Intent intent = new Intent(this, Stronger.class);
        startActivity(intent);
    }
}
