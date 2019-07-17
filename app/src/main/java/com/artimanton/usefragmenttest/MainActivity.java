package com.artimanton.usefragmenttest;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private FragmentManager mFragmentManager;
    private FragmentTransaction mFragmentTransaction;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        mFragmentManager = getFragmentManager();
    }

    public void onClick(View v) {
        mFragmentTransaction = mFragmentManager.beginTransaction();
        switch (v.getId()) {
            case R.id.button1:
                BlueFragment bluefragment = new BlueFragment();
                mFragmentTransaction.add(R.id.container, bluefragment);
                BlueFragment.count+=1;
                break;
            case R.id.button2:
                RedFragment redfragment = new RedFragment();
                mFragmentTransaction.add(R.id.container, redfragment);
                break;
        }
        mFragmentTransaction.commit();

    }
}
