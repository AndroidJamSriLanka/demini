package com.example.android.sweetmemoriesdiary;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

/**
 * Created by Demini_Indrachapa on 4/14/2015.
 */
public class SignIn extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in);
    }

    public void goBack(View view){
        setContentView(R.layout.activity_main);
    }
}


