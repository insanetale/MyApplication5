package com.psystudio.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class SelecetActivity extends AppCompatActivity {

    ImageView ivw1, ivw2, ivw3, ivw4 ;
    LinearLayout line1,line2,line3,line4; // 리니어 레이아웃에 아이디를 줘서 이동시킴
    Button rcBtn;
    Toast toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selecet);

        ivw1 = findViewById(R.id.ivw1);
        ivw2 = findViewById(R.id.ivw2);
        ivw3 = findViewById(R.id.ivw3);
        ivw4 = findViewById(R.id.ivw4);

        line1 = findViewById(R.id.line1);
        line2 = findViewById(R.id.line2);
        line3 = findViewById(R.id.line3);
        line4 = findViewById(R.id.line4);

        rcBtn = findViewById(R.id.rcBtn);

        Animation ani = AnimationUtils.loadAnimation(this,R.anim.appear_line1);
        line1.startAnimation(ani);
        line2.startAnimation(ani);
        line3.startAnimation(ani);
        line4.startAnimation(ani);
    }

    public void Btn1(View view) {
        Intent intent = new Intent(this,LenderActivity.class);
        startActivity(intent);

        String s = "대여소로 가즈야~";
        toast = Toast.makeText(this,s,Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }

    public void Btn2(View view) {
        Intent intent = new Intent(this,SellActivity.class);
        startActivity(intent);

        String s ="판매점으로 가즈야!~";
        toast = Toast.makeText(this,s,Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }

    public void Btn3(View view) {
        Intent intent = new Intent(this,YoutubeActivity.class);
        startActivity(intent);

        String s = "BJ보러 가즈야!~";
        toast = Toast.makeText(this,s,Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }

    public void Btn4(View view) {
        Intent intent = new Intent(this,GuardsActivity.class);
        startActivity(intent);

        String s = "안전으로 가즈야!~";
        toast = Toast.makeText(this,s,Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }

    public void rcBtn(View view) {
        Intent intent = new Intent(this,SelecetActivity.class);
        startActivity(intent);

        String s = "살빼러가즈야~";
        toast = Toast.makeText(this,s,Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();

    }


}
