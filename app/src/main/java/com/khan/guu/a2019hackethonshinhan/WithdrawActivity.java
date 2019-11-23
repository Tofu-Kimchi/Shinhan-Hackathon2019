package com.khan.guu.a2019hackethonshinhan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class WithdrawActivity extends Activity implements View.OnClickListener  {

    public ListView mList;
    public ArrayList<Withdraw> data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_withdraw);

//        private ArrayList<Withdraw> data = new ArrayList<>();
//        data.add()
        Withdraw withdraw = new Withdraw();
        withdraw.setIdx("1");
        withdraw.setDate("2019-07-26");
        withdraw.setPrice(210000);
        withdraw.setTotal(210000);
        data.add(withdraw);

        withdraw.setIdx("2");
        withdraw.setDate("2019-08-26");
        withdraw.setPrice(194600);
        withdraw.setTotal(404600);
        data.add(withdraw);

        withdraw.setIdx("3");
        withdraw.setDate("2019-09-26");
        withdraw.setPrice(87000);
        withdraw.setTotal(491600);
        data.add(withdraw);

        withdraw.setIdx("4");
        withdraw.setDate("2019-11-24");
        withdraw.setPrice(370000);
        withdraw.setTotal(861600);
        data.add(withdraw);

        ImageView gaip_back = (ImageView) findViewById(R.id.imageView_withdraw_back);
        gaip_back.setOnClickListener(this);

        mList = (ListView)findViewById(R.id.listview_withdraw);
        ListviewAdapter adapter = new ListviewAdapter(this,R.layout.list_layout,data);
        mList.setAdapter(adapter);
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

