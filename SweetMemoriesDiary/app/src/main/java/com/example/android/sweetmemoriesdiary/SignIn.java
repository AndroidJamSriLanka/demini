package com.example.android.sweetmemoriesdiary;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.GetCallback;
import com.parse.ParseObject;
import com.parse.ParseQuery;

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
        final String username = editTextUserName.getText().toString();
        final String password = editTextPassword.getText().toString();

        ParseQuery<ParseObject> query = ParseQuery.getQuery("Register");
        query.whereEqualTo("Username", username);

        query.getFirstInBackground(new GetCallback<ParseObject>() {
            @Override
            public void done(ParseObject object, com.parse.ParseException e) {

                if (object == null) {
                    Toast.makeText(getApplicationContext(), "Wrong username & password", Toast.LENGTH_SHORT).show();
                } else {
                    if(object.getString("Password").equals(password)){
                        SharedPreferences sp = getSharedPreferences("preferences", MODE_PRIVATE);
                        SharedPreferences.Editor editor = sp.edit();
                        editor.putBoolean("hasLoggedinPreviously", true);
                        editor.putString("Username", username);
                        editor.commit();
                        Intent intent = new Intent(SignIn.this, Diary.class);
                        startActivity(intent);
                    }else{
                        Toast.makeText(getApplicationContext(), "Wrong username & password", Toast.LENGTH_SHORT).show();

                    }
                }

            }
        });


    }

   /* public void setDate(View view){
        PickerDialogs pickerDialogs=new PickerDialogs();
        pickerDialogs.show(getSupportFragmentManager(),"date_picker");
    }*/
}


