package com.khan.guu.a2019hackethonshinhan;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.support.design.widget.TabLayout;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class ModeActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView iv1;
    ImageView toggle;
    LinearLayout lo;
    ImageView before;
    EditText edit;
    Button save;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mode);

        iv1 = (ImageView)findViewById(R.id.mode1_1);
        iv1.setOnClickListener(new ModeActivity.MyListener2());

        toggle = (ImageView)findViewById(R.id.toggle);
        toggle.setOnClickListener(new ModeActivity.MyListener3());
        toggle.setImageResource(R.drawable.toggle_off);

        lo = findViewById(R.id.lo);
        lo.setOnClickListener(new ModeActivity.MyListener3());
        lo.setVisibility(View.INVISIBLE);

        before = findViewById(R.id.tab);
        before.setOnClickListener(new ModeActivity.MyListener4());

        edit = (EditText)findViewById(R.id.input);



        String url = "http://10.3.17.205:8000/api/total/get_mode/?user=user1";
        ContentValues _params = new ContentValues();
        NetworkTask networkTask = new NetworkTask(url, _params);
        networkTask.execute();


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

    class MyListener3 implements View.OnClickListener {

        int flag = 0;
        @Override
        public void onClick(View v) {
            if(flag == 0) {
                toggle.setImageResource(R.drawable.toggle_on);
                lo.setVisibility(View.VISIBLE);
                flag =1;
            } else {
                toggle.setImageResource(R.drawable.toggle_off);
                lo.setVisibility(View.INVISIBLE);
                flag =0;
            }

        }
    }


    class MyListener4 implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Intent itt = new Intent(getApplicationContext(), MainActivity2.class);
            startActivity(itt);
        }
    }

    public void OnClickHandler(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setMessage("입력되었습니다");

        AlertDialog alertDialog = builder.create();

        alertDialog.show();



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
//            tv_outPut.setText(stResult);
        }
    }
}
