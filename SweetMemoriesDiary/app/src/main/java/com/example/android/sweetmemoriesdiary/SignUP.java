package com.example.android.sweetmemoriesdiary;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Demini_Indrachapa on 4/14/2015.
 */
public class SignUP extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);
    }

    public void Register(View view){
        Toast toast=Toast.makeText(getApplicationContext(),"you have successfully resistered",
                Toast.LENGTH_LONG);
        toast.show();
    }
}

