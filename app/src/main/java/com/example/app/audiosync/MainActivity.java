package com.example.app.audiosync;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    /* Problem right now:
       The project works when the fragment is removed (works == blank screen of the main activity)
       Something seems to be wrong with the incorparation of the login_fragment
       Could be someting inside the fragment itself too
     */


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
