package com.example.sempiternalsearch.hideme2;

import android.net.Uri;
import android.os.AsyncTask;
import android.provider.MediaStore;
import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;

public class MediaLoader extends AsyncTask<String, Void, String> {
    ArrayList<HashMap<String, String>> albumList = new ArrayList<HashMap<String, String>>();

    public MediaLoader(){

    }
    protected void onPreExecute() {
        super.onPreExecute();
        albumList.clear();
    }

    @Override
    protected String doInBackground(String... strings) {
        String xml="";
        String path= null;
        String album = null;
        String timestamp = null;
        String countPhoto = null;
        Uri uriExternal = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        Uri uriInternal = android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI;

        Log.d("Hello Son", "");

        String[] projection = { MediaStore.MediaColumns.DATA,
                MediaStore.Images.Media.BUCKET_DISPLAY_NAME, MediaStore.MediaColumns.DATE_MODIFIED };
        Log.d("Hello World", ""+projection);
        return null;
    }


}
