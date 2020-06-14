package com.example.xyzreader.util;

import android.content.Context;
import android.util.DisplayMetrics;

public class Utils {

    private static DisplayMetrics displayMetrics;

    public static float getScaledWidth(Context context) {
        displayMetrics = context.getResources().getDisplayMetrics();
        return (displayMetrics.widthPixels / displayMetrics.scaledDensity);
    }

    public static int getSpan(Context context) {
        float scaledWidth = getScaledWidth(context);
        if (scaledWidth > 600 && scaledWidth <= 900) {
            return 2;
        } else if (scaledWidth > 900) {
            return 3;
        } else return 1;
    }

}
