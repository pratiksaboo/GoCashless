package com.example.android;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;

import com.example.android.bluetoothchat.Constants;

/**
 * Created by saboo on 1/30/16.
 */
public class CashlessAplication extends Application
{
    @Override
    public void onCreate() {
        super.onCreate();
        if(checkFirstTimeUser())
        {
            //fresher
        }
        else
        {
            //non-fresher
        }

        Toast.makeText(this,"yoyoyo",Toast.LENGTH_LONG).show();
//        Todo: Add Fonts
//        FontsOverride.setDefaultFont(this, "DEFAULT", "Gotham-Book.ttf");
//        FontsOverride.setDefaultFont(this, "MONOSPACE", "Gotham-Book.ttf");
//        FontsOverride.setDefaultFont(this, "SERIF", "Gotham-Bold.ttf");
//        FontsOverride.setDefaultFont(this, "SANS_SERIF", "Gotham-Book.ttf");
    }

    private boolean checkFirstTimeUser() {
        SharedPreferences prefs = getSharedPreferences(Constants.USER_TYPE, Context.MODE_PRIVATE);
        return prefs.getBoolean(Constants.USER_TYPE_CODE, false);  //if returning user, it would be true, else false
    }

}