package com.example.android.Utility;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.android.bluetoothchat.Constants;
import com.example.android.common.logger.Log;

/**
 * Created by saboo on 1/30/16.
 */
public class Utility {

    public static Integer getBalance(Context context){
        SharedPreferences prefs = context.getSharedPreferences(Constants.SHARED_PREF, Context.MODE_PRIVATE);
        Constants.BALANCE_AMT = prefs.getInt(Constants.BALANCE, 0);
        return Constants.BALANCE_AMT;
    }

}
