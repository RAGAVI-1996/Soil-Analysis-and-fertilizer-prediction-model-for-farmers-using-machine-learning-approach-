package com.cropanalysis;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;

public class Fertile extends AppCompatActivity {

    class C03371 implements OnClickListener {
        C03371() {
        }

        public void onClick(View view) {
            Snackbar.make(view, (CharSequence) "Replace with your own action", 0).setAction((CharSequence) "Action", null).show();
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0360R.layout.activity_fertile);
        setSupportActionBar((Toolbar) findViewById(C0360R.id.toolbar));
        ((FloatingActionButton) findViewById(C0360R.id.fab)).setOnClickListener(new C03371());
    }
}
