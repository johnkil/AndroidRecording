package com.skd.androidrecording.sample.util;

import android.app.AlertDialog;
import android.content.Context;

public class NotificationUtils {

    public static void showInfoDialog(Context context, String msg) {
        new AlertDialog.Builder(context)
                .setMessage(msg)
                .setPositiveButton(android.R.string.ok, null)
                .create().show();
    }
}