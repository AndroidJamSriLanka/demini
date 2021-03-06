package com.example.android.sweetmemoriesdiary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.parse.Parse;
import com.parse.ParseInstallation;


public class MainActivity extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Parse.initialize(this, "AjyI8LvP7KNNKAQkBZX70hRIYOyL3bGQU1itlVTE", "4AgDqepdnj56twBb9Mzmw9pIJ44eSv5GM3yOTvNL");
        ParseInstallation.getCurrentInstallation().saveInBackground();

        Button b=(Button)findViewById(R.id.butSignIn);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Toast toast = Toast.makeText(getApplicationContext(), "You can login now", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER,0,0);
                toast.show();*/
               // setContentView(R.layout.sign_in);
                Intent intent = new Intent(MainActivity.this,SignIn.class);
                startActivity(intent);
            }
        });

        Button b2=(Button)findViewById(R.id.buttSignUp);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Toast toast=Toast.makeText(getApplicationContext(),"you can register now",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER,0,0);
                toast.show();*/
                Intent intent2;
                intent2 = new Intent(MainActivity.this,SignUP.class);
                startActivity(intent2);
              /*  setContentView(R.layout.sign_up);*/
            }
        });

        Button b3=(Button)findViewById(R.id.buttAboutUs);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Toast toast=Toast.makeText(getApplicationContext(),"you can register now",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER,0,0);
                toast.show();*/
                Intent intent2;
                intent2 = new Intent(MainActivity.this,AboutUs.class);
                startActivity(intent2);
              /*  setContentView(R.layout.sign_up);*/
            }
        });



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

  /*  public void signup(View view){
        Intent intent=new Intent(this,SignUP.class);
        startActivity(intent);
        setContentView(R.layout.sign_up);


    }*/


}
