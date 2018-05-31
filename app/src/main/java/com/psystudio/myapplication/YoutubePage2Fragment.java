package com.psystudio.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by alfo6-5 on 2018-05-17.
 */

public class YoutubePage2Fragment extends Fragment {



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        Log.i("test100", "page2fragment");


        View view =inflater.inflate(R.layout.youtubetab2,container,false);


        return view;


    }
}
