package com.khan.guu.a2019hackethonshinhan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class WithdrawActivity extends Activity implements View.OnClickListener  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_withdraw);


        ImageView gaip_back = (ImageView) findViewById(R.id.imageView_withdraw_back);
        gaip_back.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
//        Intent intent;
        switch (v.getId()) {
            case R.id.imageView_withdraw_back:
                finish();
                break;
            }
        }
    }
}
