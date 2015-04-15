package com.example.android.sweetmemoriesdiary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{
    Button sign_in,sign_up,about_us;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sign_in=(Button)findViewById(R.id.signIn);
        sign_up=(Button)findViewById(R.id.SignUp);
        about_us=(Button)findViewById(R.id.about);

        sign_in.setOnClickListener(this);
        sign_up.setOnClickListener(this);

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



    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.signIn:
                Intent intent=new Intent(this,SignIn.class);
                startActivity(intent);
                break;
            case R.id.SignUp:
                Intent intent2=new Intent(this,SignUP.class);
                startActivity(intent2);
                break;
            case R.id.about:
                break;

        }

    }
}
