package com.example.sempiternalsearch.hideme2;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.content.DialogInterface;
import java.util.ArrayList;

public class Gallery extends AppCompatActivity {
    GridView gridView;
    Drawable img;
    AlertDialog.Builder alertDialog;
    String folderName;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallery);
        ArrayList<ArrayList<String>> imageUrl = new ArrayList<>();
         gridView = (GridView) findViewById(R.id.gridView);

        int iDisplayWidth = getResources().getDisplayMetrics().widthPixels ;
        Resources resources = getApplicationContext().getResources();
        DisplayMetrics metrics = resources.getDisplayMetrics();
        float dp = iDisplayWidth / (metrics.densityDpi / 160f);
        //Log.d("Hello Mom", "thrkele");
        //MediaLoader mLoader = new MediaLoader();
        //mLoader.execute();
        //Log.d("Hello Mom", "kdjfkd");
        final ArrayList<GalleryModel> galleryModel = new ArrayList<>();
        img = (Drawable) getResources().getDrawable(R.drawable.add);
        galleryModel.add(new GalleryModel("New Folder",img));
        gridView.setAdapter(new GalleryAdapter(this, R.layout.gallery, galleryModel));
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d("GridView", ""+gridView.getItemAtPosition(position));
                ImageView imageView = (ImageView) findViewById(R.id.imageView);
                folderName = galleryModel.get(position).getFileName();
                Log.d("Selection",""+ folderName);
                if (folderName == "New Folder" && galleryModel.get(position).getfImage() == img ){
                    alertDialog = new AlertDialog.Builder(Gallery.this);
                    EditText text = new EditText(getApplicationContext());
                    text.setInputType(InputType.TYPE_CLASS_TEXT);
                    alertDialog.setView(text);
                    alertDialog.setTitle("New Folder");
                    alertDialog.setMessage("Enter the name of the new folder");
                    alertDialog.setPositiveButton("Enter", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alertDialog.show();
                }
                //Intent intent = new Intent(Gallery.this, Files.class);
                //if(gridView.getItemAtPosition(position) == )
            }

            /*@Override
            public void onItemClick(AdapterView<?> adapterView, View view, final int i, long l) {
                if (lView.getItemAtPosition(i) == "Quick Access") {
                    Intent intent = new Intent(context, MenuClicks.class);
                    stopSelf();
                    startService(intent);
                    Toast.makeText(getApplicationContext(), "Hello you selected quick access", Toast.LENGTH_LONG).show();
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                }
            }*/
        });
    }


}
