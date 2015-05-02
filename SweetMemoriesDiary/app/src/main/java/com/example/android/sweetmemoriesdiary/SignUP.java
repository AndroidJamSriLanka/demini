package com.example.android.sweetmemoriesdiary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.ParseObject;

/**
 * Created by Demini_Indrachapa on 4/14/2015.
 */
public class SignUP extends ActionBarActivity {
    EditText editText1,editText2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);
        editText1 = (EditText) findViewById(R.id.editTextUsername);
        editText2 = (EditText) findViewById(R.id.editTextPassword);
        Button b2=(Button)findViewById(R.id.buttonBack);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(SignUP.this,MainActivity.class);
                startActivity(intent);

            }
        });

       /* Button b=(Button)findViewById(R.id.ButtonRegister);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "You have successfully registered", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER,0,0);
                toast.show();


            }
        });*/
    }

      public void Register(View view){
         String Username = editText1.getText().toString();
         String Password = editText2.getText().toString();


        ParseObject userObject = new ParseObject("Register");
        userObject.put("Username", Username);
        userObject.put("Password", Password);

        userObject.saveInBackground();
          Toast toast = Toast.makeText(getApplicationContext(), "You have successfully registered", Toast.LENGTH_SHORT);
          toast.setGravity(Gravity.CENTER,0,0);
          toast.show();


}

}

