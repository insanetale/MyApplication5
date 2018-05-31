package com.psystudio.myapplication;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by alfo6-5 on 2018-05-16.
 */

public class ImageAdapter extends BaseAdapter {
   Context context;

    public ImageAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return guards.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        ImageView imageView;

        if(convertView == null) {
            imageView = new ImageView(context);
            imageView.setAdjustViewBounds(true);
            imageView.setPadding(8,8,8,8);
        }else{

            imageView = (ImageView)convertView;
        }


        Glide.with(context).load(guards[i]).into(imageView);

        return imageView;
    }
    private String[] guard = { // 홈페이지에서 직접 불러오는 법 String으로 보냄
            "http://firewine.dothome.co.kr/Images/bicycle.jpg",
            "http://firewine.dothome.co.kr/Images/bicycle2.jpg",
            "http://firewine.dothome.co.kr/Images/bicycle3.jpg",
            "http://firewine.dothome.co.kr/Images/bicycle4.jpg",
            "http://firewine.dothome.co.kr/Images/bicycle5.jpg",
            "http://firewine.dothome.co.kr/Images/bicycle6.jpg",
            "http://firewine.dothome.co.kr/Images/bicycle7.jpg",
            "http://firewine.dothome.co.kr/Images/bicycle8.jpg",
            "http://firewine.dothome.co.kr/Images/bicycle9.jpg",
            "http://firewine.dothome.co.kr/Images/bicycle11.jpg",
            "http://firewine.dothome.co.kr/Images/bicycle12.jpg",
            "http://firewine.dothome.co.kr/Images/bicycle13.jpg",
            "http://firewine.dothome.co.kr/Images/bicycle14.jpg"

    };


    private Integer[]guards= { // Glide를 써서 인트형으로 배열을 만들어서 보냄
            R.drawable.bicycle,R.drawable.bicycle2,
            R.drawable.bicycle3,R.drawable.bicycle4,
            R.drawable.bicycle5,R.drawable.bicycle6,
            R.drawable.bicycle7,R.drawable.bicycle8,
            R.drawable.bicycle9,R.drawable.bicycle11,
            R.drawable.bicycle12,R.drawable.bicycle13,
            R.drawable.bicycle14,R.drawable.bicycle15,
            R.drawable.bicycle16,R.drawable.bicycle17,
            R.drawable.bicycle18,R.drawable.bicycle19,
            R.drawable.bicycle20,R.drawable.bicycle21,
            R.drawable.bicycle22,R.drawable.bicycle23,
            R.drawable.bicycle24,R.drawable.bicycle25,
            R.drawable.bicycle26
    };
}
