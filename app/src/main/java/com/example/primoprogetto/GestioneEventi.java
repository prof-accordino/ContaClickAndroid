package com.example.primoprogetto;

import android.view.View;
import android.widget.TextView;

public class GestioneEventi implements View.OnClickListener
{
    private final TextView textView;
    private int clickCount = 0;
    public GestioneEventi(TextView textView)
    {
        this.textView = textView;
    }

    @Override
    public void onClick(View v)
    {
        textView.setText("Click count: " + (++clickCount));
    }
}
