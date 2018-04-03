package com.example.sempiternalsearch.hideme2;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.util.Log;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Function;

public class Gallery extends AppCompatActivity {

    MediaLoader loader;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallery);
        ArrayList<ArrayList<String>> imageUrl = new ArrayList<>();

        GridView gridView = (GridView) findViewById(R.id.gridView);
        int iDisplayWidth = getResources().getDisplayMetrics().widthPixels ;
        Resources resources = getApplicationContext().getResources();
        DisplayMetrics metrics = resources.getDisplayMetrics();
        float dp = iDisplayWidth / (metrics.densityDpi / 160f);
        Log.d("Hello Mom", "thrkele");
        //MediaLoader mLoader = new MediaLoader();
        //mLoader.execute();
        Log.d("Hello Mom", "kdjfkd");
        ArrayList<FolderModel> folderModel  = new ArrayList<>();
            folderModel.add(new FolderModel(null,null));
            gridView.setAdapter(new GalleryAdapter(this, R.layout.gallery, folderModel));



    }


}
