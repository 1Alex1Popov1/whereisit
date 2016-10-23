package com.helpfulapp.whereisit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void onSearchSomeThing(View view) {
        Intent intent = new Intent(Main.this, Info.class);
        startActivity(intent);
    }
}
