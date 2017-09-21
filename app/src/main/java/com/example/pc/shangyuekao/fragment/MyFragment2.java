package com.example.pc.shangyuekao.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.pc.shangyuekao.R;

/**
 * Desc
 * Author 程茁燕
 * Time 2017/9/20.
 */
public class MyFragment2 extends Fragment {
    public MyFragment2() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag, container, false);
        TextView txt_content = (TextView) view.findViewById(R.id.txt_content);
        txt_content.setText("二个Fragment");
        Log.e("HEHE", "2日狗");
        return view;
    }
}
