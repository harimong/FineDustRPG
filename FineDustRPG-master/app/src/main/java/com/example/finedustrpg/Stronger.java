package com.example.finedustrpg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Stronger extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stronger);
    }
    public void onClick_return_stom(View view){
        Intent intent = new Intent(this, main.class);
        startActivity(intent);
    }
}
