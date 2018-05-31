package com.psystudio.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView iv1, iv2,iv3,rogIv;
    TextView tv1,tv2,tv3;
    Toast toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        getSupportActionBar().setIcon(R.mipmap.ic_laucherbycle_round);

    iv1 = findViewById(R.id.iv1);
    iv2 = findViewById(R.id.iv2);
    iv3 = findViewById(R.id.iv3);
    tv1 = findViewById(R.id.tv1);
    tv2 = findViewById(R.id.tv2);
    tv3 = findViewById(R.id.tv3);
    rogIv =findViewById(R.id.rogIv);

    Animation ani = AnimationUtils.loadAnimation(this,R.anim.appear_main);

        iv1.startAnimation(ani);
        iv2.startAnimation(ani);
        iv3.startAnimation(ani);
        tv1.startAnimation(ani);
        tv2.startAnimation(ani);
        tv3.startAnimation(ani);
        rogIv.startAnimation(ani);
    }

    public void clickBtn1(View view){ //비회원가입

        Intent intent = new Intent(this,SelecetActivity.class);
        startActivity(intent);

       toast = Toast.makeText(getApplicationContext(),"Loading..",Toast.LENGTH_LONG);
       toast.setGravity(Gravity.CENTER,20,20);
       toast.show();

    }

    public void clickBtn2(View view) { //이멜
        Intent email = new Intent(Intent.ACTION_SEND);
        email.setType("plain/text");

        String[] address = {"insanetale@hanmail.net"};

        email.putExtra(Intent.EXTRA_EMAIL,address);
        email.putExtra(Intent.EXTRA_SUBJECT,"보내질 email 제목");
        email.putExtra(Intent.EXTRA_TEXT,"보내질 내용을 입력하세요");

        toast = toast.makeText(getApplicationContext(),"욕설금지",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }
    public void clickBtn3(View view) {//회원가입

        Intent intent = new Intent(this,LoginActivity.class);
        startActivity(intent);

        toast = Toast.makeText(getApplicationContext(),"가입화면으로 이동중입니다",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,20,20);
        toast.show();

    }
}
