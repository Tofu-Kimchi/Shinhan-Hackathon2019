package com.khan.guu.a2019hackethonshinhan;

import android.app.Activity;
import android.os.Bundle;

public class GaipActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getIntent();
    }
}
