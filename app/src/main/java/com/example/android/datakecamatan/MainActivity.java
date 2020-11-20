package com.example.android.datakecamatan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void WetWaterpack(View view) {
        Intent pindah1 = new Intent(MainActivity.this, WetActivity.class );
        startActivity(pindah1);
    }

    public void TranseraWaterpack(View view) {
        Intent pindah2 = new Intent(MainActivity.this, TranseraActivity.class );
        startActivity(pindah2);
    }


    public void TransSnow(View view) {
        Intent pindah3 = new Intent(MainActivity.this, SnowActivity.class );
        startActivity(pindah3);
    }
}