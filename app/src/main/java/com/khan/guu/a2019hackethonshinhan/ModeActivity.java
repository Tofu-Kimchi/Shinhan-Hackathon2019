package com.khan.guu.a2019hackethonshinhan;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.support.design.widget.TabLayout;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

public class ModeActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView iv1;
    EditText et;
    Switch s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mode);

        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        //((TextView) findViewById(R.id.main_toolbar_title)).setText("쏠음주");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        et = findViewById(R.id.input);
        s = findViewById(R.id.visibilitySwitch);
        et.setVisibility(View.INVISIBLE);

        iv1 = (ImageView)findViewById(R.id.mode1_1);
        iv1.setOnClickListener(new ModeActivity.MyListener2());




        s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // do something, the isChecked will be
                // true if the switch is in the On position
                if(isChecked)
                    et.setVisibility(View.VISIBLE);
                else
                    et.setVisibility(View.INVISIBLE);
            }
        });

//        ImageButton ImageButton_account_before = (ImageButton) findViewById(R.id.ImageButton_withdraw_before);
//        ImageButton_account_before.setOnClickListener(this);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:{ //toolbar의 back키 눌렀을 때 동작
                finish();
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }

    class MyListener2 implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Intent it = new Intent(getApplicationContext(), SumActivity.class);
            startActivity(it);
        }
    }



    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.Button_to_mode:
                intent = new Intent(this, ModeActivity.class);
                startActivity(intent);
                break;
            case R.id.imageView_gaip_back:
                finish();
                break;
        }






//        switch (view.getId()) {
//            case R.id.ImageButton_withdraw_before:
//                finish();
//                break;
//        }
    }


    String url = "http://10.3.17.205:8000/api/total/get_total/?user=user1";
//    ContentValues _params = new ContentValues();
//    NetworkTask networkTask = new NetworkTask(url, _params);
//    networkTask.execute();
//
//    public class NetworkTask extends AsyncTask<Void, Void, String> {
//
//        private String url;
//        private ContentValues values;
//
//        public NetworkTask(String url, ContentValues values) {
//
//            this.url = url;
//            this.values = values;
//        }
//
//        @Override
//        protected String doInBackground(Void... params) {
//
//            String result; // 요청 결과를 저장할 변수.
//            HttpConnection httpConnection = new HttpConnection();
//            result = httpConnection.request(url, values); // 해당 URL로 부터 결과물을 얻어온다.
//            if(result == null){
//                result = "0";
//            }else{
//                //result ="1";
//            }
//            return result;
//
//
//        }
//
//        @Override
//        protected void onPostExecute(String s) {
//            super.onPostExecute(s);
//            String stResult = s;
//            //doInBackground()로 부터 리턴된 값
////            if(s.equals("1")){
////                 stResult = "결제 완료!";
////        }
////            else{
////                stResult = "결제가 실패했습니다.";
////            }
//            tv_outPut.setText(stResult);
//        }
//    }
}
