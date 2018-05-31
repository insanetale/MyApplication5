package com.psystudio.myapplication;

import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class LenderActivity extends AppCompatActivity {

        ArrayList<String> items =new ArrayList<>();
        RecyclerView recyclerView;
        LenderAdapter lenderAdapter;
        AssetManager am;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lender);


        items.add(new String("응봉역 1번출구  /      15  서울특별시 성동구 고산자로 123 응봉동 3-10 "));
        items.add(new String("상왕십리역 1번출구     10  서울특별시 성동구 하왕십리동 860-1 상왕십리역 1번출구 "));
        items.add(new String("왕십리교회옆           10  서울특별시 성동구 상왕십리동 350-1 왕십리교회옆 "));
        items.add(new String("금호 어울림 아파트 앞    7  서울특별시 성동구 광나루로 249 송정금호어울림 아파트 앞 "));
        items.add(new String("성수아이에스비즈타워 앞  7  서울특별시 성동구 성수이로 147 아이에스비즈타워 앞 "));
        items.add(new String("성수아카데미타워 앞       10  서울특별시 성동구 성수이로 118 라성아카데미타워 앞 "));
        items.add(new String("이마트 버스정류소 옆      20  서울특별시 성동구 뚝섬로 379 이마트 버스정류소 옆 "));
        items.add(new String("서울숲 남문 버스정류소 옆 10  서울특별시 성동구 왕십리로11길 9 서울숲남문 버스정류소 옆 "));
        items.add(new String("서울숲역 4번 출구 옆      16  서울특별시 성동구 왕십리로 지하77 서울숲역 4번 출구 옆 "));
        items.add(new String("뚝섬역 1번 출구 옆        15  서울특별시 성동구 아차산로 18 뚝섬역 1번 출구 옆 "));

        items.add(new String("뚝섬역 5번 출구 정류소 옆  8  서울특별시 성동구 아차산로 18 뚝섬역 5번 출구 정류소 옆 "));
        items.add(new String("성수사거리 버스정류장 앞   7  서울특별시 성동구 아차산로 171 성수사거리 버스정류장 앞 "));
        items.add(new String("청계천 박물관 앞          20  서울특별시 성동구 마장동 610 청계천 박물관 앞 "));
        items.add(new String("양지사거리                20  서울특별시 성동구 홍익동 590 양지사거리 "));
        items.add(new String("상왕십리역 4번 출구 앞    10  서울특별시 성동구 하왕십리동 960-3 상왕십리역 4번 출구 "));
        items.add(new String("왕십리역 11번 출구 앞               14  서울특별시 성동구 행당동 188-9 왕십리역 11번 출구 앞 "));
        items.add(new String("금호역 1번출구 앞                    9  서울특별시 성동구 금호동3가 1575-3 금호역 1번출구 앞 "));
        items.add(new String("옥수동성당 옆                       11  서울특별시 성동구 옥수동 산5-148 옥수동성당 옆 "));
        items.add(new String("래미안금호하이리버 아파트 102동 옆  10  서울특별시 성동구 금호동2가 1220-1 래미안금호하이리버 아파트 102동 옆 "));
        items.add(new String("한양대병원사거리                    20  서울특별시 성동구 행당동 20-2 한양대병원사거리"));

        items.add(new String("용답토속공원 앞                     10  서울특별시 성동구 용답동 224-1 용답토속공원 앞 "));
        items.add(new String("장한평역 8번 출구 앞                15  서울특별시 성동구 용답동 224-3 장안평역 8번 출구 앞 "));
        items.add(new String("한양대병원사거리                    20  서울특별시 성동구 행당동 20-2 한양대병원사거리"));
        items.add(new String("청계벽산아파트 앞 운영중             9  서울특별시 성동구 하왕십리동 286-24 청계벽산아파트 텐즈힐아파트 정류소 "));
        items.add(new String("우리은행 금호동 지점 앞 운영중       7  서울특별시 성동구 금호동4가 1101 우리은행 금호동 지점 앞"));
        items.add(new String("금호사거리 운영중                   20  서울특별시 성동구 금호동2가 1205-1 금호사거리 "));
        items.add(new String(" 응봉삼거리                          16    서울특별시 성동구 응봉동 134-26 응봉삼거리 "));
        items.add(new String(" 행당역 2번출구 앞                    8  서울특별시 성동구 행당동 347-11 행당역 2번출구 앞 "));
        items.add(new String("한양대후문역 부근                   10 서울특별시 성동구 행당동 10 한양대후문역 부근 (양키캔들 앞)"));
        items.add(new String("답십리역 8번출구 앞                 15  서울특별시 성동구 용답동 102-1 답십리역 8번출구 앞 "));

        items.add(new String("달맞이공원                          20  서울특별시 성동구 금호동4가 367-1 달맞이공원 "));
        items.add(new String("도선동 주민센터 앞                  10  서울특별시 성동구 무학로10길 6 도선동 주민센터 앞 "));
        items.add(new String("성동광진 교육지원청 앞              20  서울특별시 성동구 고산자로 260 성동광진 교육지원청 앞"));
        items.add(new String("왕십리역 4번 출구 건너편            10  서울특별시 성동구 왕십리광장로 10-1 왕십리역 4번 출구 건너편 "));
        items.add(new String("비전교회 앞                          8  서울특별시 성동구 동일로 213 비전교회 앞"));
        items.add(new String("서울숲역 2번출구 앞          10  서울특별시 성동구 왕십리로 64 서울숲역 2번출구 앞 "));
        items.add(new String("군자지하보도 앞              10  서울특별시 성동구 동일로 313 군자지하보도 앞 "));
        items.add(new String("성동세무서 건너편            10  서울특별시 성동구 광나루로 302 성동세무서 건너편 "));
        items.add(new String("금호역 3번출구               15  서울특별시 성동구 동호로 99 금호역 3번출구 "));
        items.add(new String("옥수역 3번출구               20  서울특별시 성동구 한림말길 56 옥수역 3번출구 "));

        items.add(new String("성수역 2번출구 앞            15  서울특별시 성동구 아차산로 113 성수역 2번출구 앞 "));
        items.add(new String("청계8가사거리 부근           10  서울특별시 동대문구 청계천로 417 청계8가사거리 부근 "));
        items.add(new String("응봉현대아파트 정류소        10  서울특별시 성동구 독서당로 381 응봉동현대아파트 정류소 "));
        items.add(new String("마장역 4번출구                8  서울특별시 성동구 마장로 292-1 마장역 4번출구  "));
        items.add(new String("신금호역 3번출구 뒤           6  서울특별시 성동구 무수막길 97 신금호역 3번출구 뒤 "));
        items.add(new String("용답초등학교                 13  서울특별시 성동구 용답25길 1 용답초등학교 "));
        items.add(new String("경일중학교 앞                10  서울특별시 성동구 성수일로 27 경일중학교 앞 "));
        items.add(new String(" 청계천 생태교실 앞           20  서울특별시 성동구 마장로39길 51 청계천 생태교실 앞 "));
        items.add(new String(" 성수2가1동 공영주차장         9  서울특별시 성동구 성수동2가 569-3 성수2가1동 공영주차장 인근 "));
        items.add(new String("마장동 주민센터                  10      서울특별시 성동구 마장로42길 14 마장동 주민센터 "));

        items.add(new String("KEB하나은행 성수중앙지점         10      서울특별시 성동구 성수동2가 276-5 KEB하나은행 성수중앙지점 "));
        items.add(new String("성수역3번출구 운영중              8      서울특별시 성동구 아차산로 100 성수동2가 315-105 "));
        items.add(new String(" 중랑물재생센터(서울새활용플라자) 15  서울특별시 성동구 자동차시장길 49 중랑물재생센터 "));
        items.add(new String("한양대병원사거리                    20  서울특별시 성동구 행당동 20-2 한양대병원사거리"));

        recyclerView = findViewById(R.id.recycler);
        lenderAdapter = new LenderAdapter(this,items,getAssets());
        recyclerView.setAdapter(lenderAdapter);
    }
}
