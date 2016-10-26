package com.example.pablo.tipcalc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.pablo.tipcalc.fragments.TipHistoryListFragment;

import static android.R.id.message;

public class Display_Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display__details2);

        Intent intent = getIntent();
        String date = intent.getStringExtra("DateT");
        double bill = intent.getDoubleExtra("Bill", 0);
        double tip = intent.getDoubleExtra("Tip", 0);
        String details;

        details  = date + "\n\nTotal de la cuenta: " + bill + "\nLa propina fue: " + tip ;
        TextView textView = new TextView(this);
        textView.setTextSize(30);
        textView.setText(details);

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_display__details2);
        layout.addView(textView);
    }

}
