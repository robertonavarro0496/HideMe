package com.example.sempiternalsearch.hideme2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

public class Gallery extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallery);

        GridView gridView = (GridView) findViewById(R.id.gridView);

    }

}
