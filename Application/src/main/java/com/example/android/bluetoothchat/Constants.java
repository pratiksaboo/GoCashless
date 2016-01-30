package com.example.android.bluetoothchat;

/**
 * Defines several constants used between {@link BluetoothChatService} and the UI.
 */
public final class Constants {

    // Message types sent from the BluetoothChatService Handler
    public static final int MESSAGE_STATE_CHANGE = 1;
    public static final int MESSAGE_READ = 2;
    public static final int MESSAGE_WRITE = 3;
    public static final int MESSAGE_DEVICE_NAME = 4;
    public static final int MESSAGE_TOAST = 5;

    // Key names received from the BluetoothChatService Handler
    public static final String DEVICE_NAME = "device_name";
    public static final String TOAST = "toast";
    public static final String LOG = "Looking at";

    public static final String SHARED_PREF = "shared_pref";
    public static Integer BALANCE_AMT = null;
    public static final String BALANCE = "balance";

    public static final String USER_TYPE = "user_type";
    public static final String USER_TYPE_CODE = "user_type_code";




}
