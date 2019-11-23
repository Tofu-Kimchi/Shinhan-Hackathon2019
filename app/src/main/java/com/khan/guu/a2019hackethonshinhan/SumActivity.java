package com.khan.guu.a2019hackethonshinhan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SumActivity extends AppCompatActivity {

    android.support.v7.app.ActionBar bar;
    TabLayout tabLayout;
    ImageView iv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        ((TextView) findViewById(R.id.main_toolbar_title)).setText("쏠음주");

        iv2 = (ImageView)findViewById(R.id.mode2_1);
        iv2.setOnClickListener(new SumActivity.MyListener3());
    }

    class MyListener3 implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Intent it = new Intent(getApplicationContext(), ModeActivity.class);
            startActivity(it);
        }
    }
}
