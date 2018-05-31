package com.psystudio.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.error.VolleyError;
import com.android.volley.request.SimpleMultiPartRequest;
import com.android.volley.toolbox.Volley;

public class LoginActivity extends AppCompatActivity {

    private EditText etid,etpassword,etpasswordconfirm,etage,etphone;
    private Button btnok,btnno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etid = (EditText) findViewById(R.id.et1);
        etpassword = (EditText) findViewById(R.id.et2);
        etpasswordconfirm = (EditText) findViewById(R.id.et3);
        etage = (EditText) findViewById(R.id.et4);
        etphone = (EditText) findViewById(R.id.et5);

        btnok = findViewById(R.id.btn1);
        btnno = findViewById(R.id.btn2);

        //비밀번호 일치 검사

//        etpasswordconfirm.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//                String etpassword = etpassword.getText().toString();
//                String etpasswordconfirm = etpasswordconfirm.getText().toString();
//            }
//
//            @Override
//            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//                etpassword.setBackgroundColor(Color.GREEN);
//                etpasswordconfirm.setBackgroundColor(Color.GREEN);
//            }
//
//            @Override
//            public void afterTextChanged(Editable editable) {
//
//            }
//        });

        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //이름 입력확인

                String serverURL = "";


                if (etid.getText().toString().length() == 0) {
                    Toast.makeText(LoginActivity.this, "아이디를 입력하세요", Toast.LENGTH_SHORT).show();
                    etid.requestFocus();

                }
                //비밀번호  입력확인
                if (etpassword.getText().toString().length() == 0) {
                    Toast.makeText(LoginActivity.this, "비밀번호를 입력하세요", Toast.LENGTH_SHORT).show();
                    etpassword.requestFocus();//호출할때 커서를 준다

                }
                //비밀번호 확인입력확인
                if (!etpasswordconfirm.getText().toString().equals(etpassword.getText().toString())) {
                    Toast.makeText(LoginActivity.this, "비밀번호입력 확인란", Toast.LENGTH_SHORT).show();
                    etpasswordconfirm.requestFocus();

                }
                //나이 입력확인
                if (etage.getText().toString().length() == 0) {
                    Toast.makeText(LoginActivity.this, "나이를 입력해주세요", Toast.LENGTH_SHORT).show();
                    etage.requestFocus();

                }
                //핸드폰 입력번호 확인
                if (etphone.getText().toString().length() == 0) {
                    Toast.makeText(LoginActivity.this, "핸드폰번호를 입력해주세요", Toast.LENGTH_SHORT).show();


                    SimpleMultiPartRequest multiPartRequest = new SimpleMultiPartRequest(Request.Method.POST, serverURL, new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {

                        }
                    }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            Toast.makeText(LoginActivity.this, error.getMessage(), Toast.LENGTH_SHORT).show();
                            ;

                        }
                    });
                    //요청 객체에 데이터 추가하기 서버로 전달할 데이터
                    multiPartRequest.addStringParam("id", etid.getText().toString() + "");//name:"id" = php $변수명의 값,value:etid
                    multiPartRequest.addStringParam("password", etpassword.getText().toString()+ "");
                    multiPartRequest.addStringParam("inputage", etage.getText().toString()+ "");//+""age+""문자열로 변환해서 보낸다
                    multiPartRequest.addStringParam("inputphone", etphone.getText().toString() + "");

                    //요청큐 객체 생성하기 큐에 저장을 하고 매소드
                    RequestQueue requestQueue = Volley.newRequestQueue(LoginActivity.this);
                    //요청큐 요청객체 추가... 아웃풋 인풋 없음
                    requestQueue.add(multiPartRequest);

                }
            }
        });
    }
       public void Btn2(View view) {
           Intent intent = new Intent(this,MainActivity.class);
           startActivity(intent);
    }

}
