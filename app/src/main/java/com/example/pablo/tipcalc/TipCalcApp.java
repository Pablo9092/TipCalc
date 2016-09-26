package com.example.pablo.tipcalc;

import android.app.Application;

/**
 * Created by pablo on 26/09/16.
 */

public class TipCalcApp extends Application {
    private final static String ABOUT_URL = "https://github.com/";

    public String getAboutUrl()
    {
        return ABOUT_URL;
    }
}
