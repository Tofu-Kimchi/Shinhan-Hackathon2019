package com.khan.guu.a2019hackethonshinhan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv = (ImageView)findViewById(R.id.img_main);
        iv.setOnClickListener(new MyListener());
    }

    class MyListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Intent it = new Intent(getApplicationContext(), GaipActivity.class);
            startActivity(it);
        }
    }
}
