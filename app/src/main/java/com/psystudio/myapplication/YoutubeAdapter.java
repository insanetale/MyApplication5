package com.psystudio.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by alfo6-5 on 2018-05-17.
 */

public class YoutubeAdapter extends FragmentPagerAdapter {

    Fragment[] frages =new Fragment[3];
    String[] titles = {"소개","모험왕별이","지엔"};

    public YoutubeAdapter(FragmentManager fm) {
        super(fm);
        frages[0] = new YoutubePage1Fragment();
        frages[1] = new YoutubePage2Fragment();
        frages[2] = new YoutubePage3Fragment();
    }

    @Override
    public Fragment getItem(int position) {
        return frages[position];
    }

    @Override
    public int getCount() {
        return frages.length;
    }

    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
