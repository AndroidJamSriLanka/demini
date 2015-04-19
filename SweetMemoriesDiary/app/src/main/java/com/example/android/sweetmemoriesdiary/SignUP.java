package com.example.android.sweetmemoriesdiary;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Demini_Indrachapa on 4/14/2015.
 */
public class SignUP extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);

        Button b=(Button)findViewById(R.id.ButtonRegister);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "You have successfully registered", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER,0,0);
                toast.show();


            }
        });
    }

  /*  public void Register(View view){
        Toast toast=Toast.makeText(getApplicationContext(),"you have successfully registered",
                Toast.LENGTH_LONG);
        toast.show();
    }*/
}

