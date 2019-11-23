package com.khan.guu.a2019hackethonshinhan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;

public class GaipActivity extends Activity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gaip);

        Button Button_main_filup = (Button) findViewById(R.id.Button_to_mode);
        Button_main_filup.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.Button_to_mode:
                intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
        }
    }
}
