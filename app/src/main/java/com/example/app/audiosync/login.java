package com.example.app.audiosync;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class login extends Fragment {

    public login() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        //Need to use getActivity()., since Fragment is not an activity (and only activities have access to View?)
        Button fb_login_button = (Button) getActivity().findViewById(R.id.view_fb_login_b);
        Button fb_signup_button = (Button) getActivity().findViewById(R.id.view_fb_signup_b);
        final TextView guest_login = (TextView) getActivity().findViewById(R.id.guest_login);

        fb_login_button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        // Do whatever with the facebook SIGNIN button.
                        // Go to URL (FB Login API)
                        guest_login.setText("login button pressed");
                    }
                }
        );

        fb_signup_button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        // Do whatever with the facebook SINGUP button.
                        // Go to URL (FB Login API)
                        guest_login.setText("Signup button pressed");
                    }
                }
        );

        guest_login.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        // Do whatever with the GUEST LOGIN text.
                        // Go to URL (FB Login API)
                        guest_login.setText("Guest button pressed");

                    }
                }
        );

        return view;
    }

}
