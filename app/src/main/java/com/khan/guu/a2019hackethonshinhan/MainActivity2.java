package com.khan.guu.a2019hackethonshinhan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity2 extends Activity implements View.OnClickListener {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainn);

        ImageView Button_main_filup = (ImageView) findViewById(R.id.img_mainn);
        Button_main_filup.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.img_mainn:
                intent = new Intent(this, ModeActivity.class);
                startActivity(intent);
                break;
            case R.id.imageView_gaip_back:
                finish();
                break;
        }
    }

}
