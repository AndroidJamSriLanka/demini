package com.example.android.sweetmemoriesdiary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Demini_Indrachapa on 4/14/2015.
 */
public class SignIn extends ActionBarActivity {
    EditText editTextUserName;
    EditText editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in);

        editTextUserName=(EditText)findViewById(R.id.editTextLoginUsername);

        editTextPassword=(EditText)findViewById(R.id.editTextLoginPassword);
    }

    public void goBack(View view) {
        setContentView(R.layout.activity_main);
    }

    public void OK(View view) {
        String username = editTextUserName.getText().toString();
        String password = editTextPassword.getText().toString();
        if ("demini".equals(username) && "demini123".equals(password)) {
            Intent intent;
            intent = new Intent(SignIn.this,Diary.class);
            startActivity(intent);
        } else {
            Toast.makeText(getBaseContext(), "wrong username or password", Toast.LENGTH_SHORT).show();

        }
    }
}


