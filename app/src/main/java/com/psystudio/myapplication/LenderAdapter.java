package com.psystudio.myapplication;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by alfo6-5 on 2018-05-15.
 */

public class LenderAdapter extends RecyclerView.Adapter {

    Context context;
    ArrayList<String> items;
    AssetManager am;

    public LenderAdapter( Context context, ArrayList<String> items,AssetManager am) {
        this.context = context;
        this.items = items;
        this.am = am;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context); //운영체제 대리인으로부터 레이아웃인플레이터생성
        View itemView = inflater.inflate(R.layout.lender_cardview,parent,false); //직접리사이클러뷰에 붙일 것인가 안하겠다 대신 아래서 리턴값으로 자동으로 홀더로 넘겨준다
        VH holder = new VH(itemView);

        return holder;

        //뷰 = 레이아웃을 불러주는 인플레이터가 팽창시킨다. 팽창

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        VH vh = (VH)holder;

        String s = items.get(position);
        vh.tv.setText(s);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class VH extends RecyclerView.ViewHolder{//텍스트뷰를 편하게 쓸 수 있는 이너클래스 VH를 생성

        TextView tv;

        public VH(View itemView) {

        super(itemView);
        tv = itemView.findViewById(R.id.Ltv);
            Typeface typeface = Typeface.createFromAsset(am,"fonts/nanumson.ttf");
            tv.setTypeface(typeface);

        }
    }

}
