package com.khan.guu.a2019hackethonshinhan;

import android.app.Activity;
import android.content.ContentValues;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ModeActivity extends Activity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mode);

//        ImageButton ImageButton_account_before = (ImageButton) findViewById(R.id.ImageButton_withdraw_before);
//        ImageButton_account_before.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
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
