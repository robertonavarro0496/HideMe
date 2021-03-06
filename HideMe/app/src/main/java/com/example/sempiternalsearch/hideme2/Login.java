package com.example.sempiternalsearch.hideme2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    Context context;
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button0, login;
    EditText editText;
    private int[] key;
    protected void onCreate(Bundle saved){
        super.onCreate(saved);
        setContentView(R.layout.login);
        context = this;
        editText = (EditText) findViewById(R.id.editText2);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button0 = (Button) findViewById(R.id.button0);
        login = (Button) findViewById(R.id.login);


}

    public void buttonClick(View v) {
        Button b = (Button) v;
        String buttonString = b.getText().toString();
        buttonAppend(buttonString);
    }
    public void buttonLogin(View v){
        Intent intent = new Intent(context, Gallery.class);
        startActivity(intent);
    }
    private void buttonAppend(String buttonString){
        String editString = editText.getText().toString();

        if(buttonString.equals("DEL") && editString.length() > 0) {
            String text = editText.getText().toString();
            editText.setText(text.substring(0, text.length() - 1));
        }
        else if (!buttonString.equals("DEL")) {
            int number = Integer.parseInt(buttonString);
            editString += buttonString;
            editText.append(buttonString);
            //Log.d("DEBUG",editText.getText().toString());
        }
        else{}
        if (editString.length() >= 4) {
            login.setBackgroundResource(R.drawable.login_yes);
        }
        else {
            login.setBackgroundResource(R.drawable.login_not);
        }
    }
}
