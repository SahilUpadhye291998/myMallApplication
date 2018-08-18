package com.example.sahil.mymallapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import Main_Fragment.DashBoardFragment;
import Main_Fragment.HomeFragment;
import Main_Fragment.NotificationFragment;
import Main_Fragment.SettingFragment;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Fragment fragment = new HomeFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new HomeFragment()).commit();
                    return true;
                case R.id.navigation_dashboard:
                    Fragment fragment1 = new HomeFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new DashBoardFragment()).commit();
                    return true;
                case R.id.navigation_notifications:
                    Fragment fragment2 = new HomeFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new NotificationFragment()).commit();
                    return true;
                case R.id.navigation_setting:
                    Fragment fragment3 = new HomeFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new SettingFragment()).commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new HomeFragment()).commit();

    }

}
