package com.khan.guu.a2019hackethonshinhan;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.os.AsyncTask;
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
    TextView total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        ((TextView) findViewById(R.id.main_toolbar_title)).setText("쏠음주");

        iv2 = (ImageView)findViewById(R.id.mode2_1);
        iv2.setOnClickListener(new SumActivity.MyListener3());
        total = (TextView)findViewById(R.id.mode2);
        String url = "http://10.3.17.205:8000/api/total/get_total/?user=user1";
        ContentValues _params = new ContentValues();
        NetworkTask networkTask = new NetworkTask(url, _params);
        networkTask.execute();
    }

    class MyListener3 implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Intent it = new Intent(getApplicationContext(), ModeActivity.class);
            startActivity(it);
        }
    }

    public class NetworkTask extends AsyncTask<Void, Void, String> {

        private String url;
        private ContentValues values;

        public NetworkTask(String url, ContentValues values) {

            this.url = url;
            this.values = values;
        }

        @Override
        protected String doInBackground(Void... params) {

            String result; // 요청 결과를 저장할 변수.
            HttpConnection httpConnection = new HttpConnection();
            result = httpConnection.request(url, values); // 해당 URL로 부터 결과물을 얻어온다.
            if(result == null){
                result = "0";
            }else{
                //result ="1";
            }
            return result;


        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            String stResult = s;
            //doInBackground()로 부터 리턴된 값
//            if(s.equals("1")){
//                 stResult = "결제 완료!";
//        }
//            else{
//                stResult = "결제가 실패했습니다.";
//            }
            total.setText(stResult);
        }
    }
}
