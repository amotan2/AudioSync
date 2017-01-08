package com.example.app.audiosync;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //setTheme(R.style.splashScreenTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Calling the Login fragment from the main activity
        Fragment newFrag = new Fragment();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.add(R.id.login_fragment, newFrag);
        ft.commit();
    }
}
