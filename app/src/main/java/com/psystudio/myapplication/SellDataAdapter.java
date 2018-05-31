package com.psystudio.myapplication;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by alfo6-5 on 2018-05-15.
 */

public class SellDataAdapter extends BaseAdapter {

    ArrayList<LocationData> datas;//객체를 생성하면서 전달받은 data를 멤버변수로 전달
    LayoutInflater inflater;//아래의 다른 멤버 벰소드에서 사용하기 위해서 멤버변수로 참조값 전달
    AssetManager am;//memberdataAdapter 클래스를 객체로 만들어내는 클래스를 레이아웃 인플레이터 객체에 전달

    public SellDataAdapter(ArrayList<LocationData> datas, LayoutInflater inflater, AssetManager am) {
        this.datas = datas; //객체를 생성하면서 전달받은 datas를 멤버변수로 전달
        this.inflater = inflater;//아래의 다른 멤버 메소드에서 사용하기 위해서 멤버변수로 전달
        this.am = am;// 이 memberdataAdapter 클래스를 객체로 만들어 전달
    }

    @Override
    public int getCount() {
        return datas.size();//datas 개수를 리턴
    }

    @Override
    public Object getItem(int position) {
        return datas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertview, ViewGroup parent) {
        if (convertview == null) {

           convertview= inflater.inflate(R.layout.sell_list, null);

        }

        TextView text_name = (TextView) convertview.findViewById(R.id.text_name);
        TextView text_address = (TextView) convertview.findViewById(R.id.text_address);
        ImageView img_seller = (ImageView) convertview.findViewById(R.id.img_seller);

        Typeface typeface = Typeface.createFromAsset(am, "fonts/nanumson.ttf");
        text_name.setTypeface(typeface);


        text_name.setText((datas.get(position).getName()));
        text_address.setText((datas.get(position).getLocation()));
        img_seller.setImageResource((datas.get(position).getImgid()));

        return convertview;
    }
}