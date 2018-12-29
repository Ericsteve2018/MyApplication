package com.example.stevenemangou.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.BottomBarTab;
import com.roughike.bottombar.OnTabSelectListener;


public class HomePageA1 extends AppCompatActivity {


     public BottomBar bottomBarsearch = (BottomBar) findViewById(R.id.spread);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page_a1);
    }
}
