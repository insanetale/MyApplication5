package com.psystudio.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SellActivity extends AppCompatActivity {

    ArrayList<LocationData>datas = new ArrayList<LocationData>();
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell);

        datas.add(new LocationData("청계바이크","02-2293-5054 서울 성동구 무학로 50",R.drawable.seller2));
        datas.add(new LocationData("삼천리자전거","02-2281-8989 서울 성동구 무학로 6",R.drawable.seller2));
        datas.add(new LocationData("행복한자전거","02-2299-9485 서울 성동구 마조로 67 ",R.drawable.seller2));
        datas.add(new LocationData("벨로데이","070-4120-8989 서울 성동구 왕십리로 294-2 기 ",R.drawable.seller2));
        datas.add(new LocationData("성진바이크","02-2282-0108 서울 성동구 고산자로 132 ",R.drawable.seller2));
        datas.add(new LocationData("자전거총각 ","02-6013-8582 서울 성동구 천호대로 268  ",R.drawable.seller2));
        datas.add(new LocationData("삼천리자전거 용답점","02-2246-7989 서울 성동구 천호대로 268 ",R.drawable.seller2));
        datas.add(new LocationData("첼로 킴스바이크","02-2281-0880 서울 성동구 금호로 48-1 ",R.drawable.seller2));
        datas.add(new LocationData("삼천리자전거 골드휠금호점   자전거판매점 ","02-2298-2723 서울 성동구 독서당로 322  ",R.drawable.seller2));
        datas.add(new LocationData("알톤자전거 서울숲점   자전거판매점","02-499-2450 서울 성동구 서울숲6길 21 ",R.drawable.seller2));
        datas.add(new LocationData("알톤 용답점 ","서울 성동구 용답15길 14 ",R.drawable.seller2));
        datas.add(new LocationData("벨라전기자전거","02-461-5736 서울 성동구 성수일로 11 ",R.drawable.seller2));


    listView = (ListView)findViewById(R.id.listview);

    SellDataAdapter adapter = new SellDataAdapter(datas,getLayoutInflater(),getAssets());

        listView.setAdapter(adapter);


    }
}
