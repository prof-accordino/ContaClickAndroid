package com.example.contaclick;
import static com.example.contaclick.R.*;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.activity.ComponentActivity;

public class MainActivity extends ComponentActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        TextView textView = findViewById(R.id.label);
        GestioneEventi g = new GestioneEventi(textView);
        button.setOnClickListener(g);
    }
}
