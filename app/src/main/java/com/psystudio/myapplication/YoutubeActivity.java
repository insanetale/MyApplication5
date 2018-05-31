package com.psystudio.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class YoutubeActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager pager;
    YoutubeAdapter youtubeAdapter;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube);

        pager = findViewById(R.id.pager);
        youtubeAdapter = new YoutubeAdapter(getSupportFragmentManager());
        pager.setAdapter(youtubeAdapter);


        tabLayout = findViewById(R.id.layout_tab);
        tabLayout.setupWithViewPager(pager);

        getSupportActionBar().setTitle("Enjoy your Life");

//        Log.i("test100", "Activity.onCreate");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {//이미 객체가 만들어지는 자동콜백 메소드
        getMenuInflater().inflate(R.menu.actionbar_main, menu);

        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        switch (id) {

            case R.id.menu_search:
                Toast.makeText(this, "항목표시줄입니다", Toast.LENGTH_SHORT).show();


                break;

            case R.id.menu_lender:
                Intent menu_lender = new Intent(this,LenderActivity.class);
                startActivity(menu_lender);
                Toast.makeText(this, "대여소", Toast.LENGTH_SHORT).show();
                break;

            case R.id.menu_sell:
                Intent menu_sell = new Intent(this,SellActivity.class);
                startActivity(menu_sell);
                Toast.makeText(this, "판매점", Toast.LENGTH_SHORT).show();
                break;

            case R.id.menu_guard:
                Intent menu_guard = new Intent(this,GuardsActivity.class);
                startActivity(menu_guard);
                Toast.makeText(this, "안전", Toast.LENGTH_SHORT).show();
                break;

        }


        return super.onOptionsItemSelected(item);
    }



}