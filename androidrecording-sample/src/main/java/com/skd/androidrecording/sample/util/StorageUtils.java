package com.skd.androidrecording.sample.util;

import android.os.Environment;

public class StorageUtils {
    private static final String AUDIO_FILE_NAME = "audiorecordtest.wav";
    private static final String VIDEO_FILE_NAME = "videorecordtest.3gp";

    public static boolean checkExternalStorageAvailable() {
        String state = Environment.getExternalStorageState();
        return Environment.MEDIA_MOUNTED.equals(state);
    }

    public static String getFileName(boolean isAudio) {
        String storageDir = Environment.getExternalStorageDirectory().getAbsolutePath();
        return String.format("%s/%s", storageDir, (isAudio) ? AUDIO_FILE_NAME : VIDEO_FILE_NAME);
    }
}