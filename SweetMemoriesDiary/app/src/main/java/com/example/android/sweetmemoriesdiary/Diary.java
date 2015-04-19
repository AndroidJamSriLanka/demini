package com.example.android.sweetmemoriesdiary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Spinner;

/**
 * Created by Demini_Indrachapa on 4/16/2015.
 */
public class Diary extends FragmentActivity {
    Spinner sp;
    ImageView imageViewpicturegallary;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diary);
        final RelativeLayout llContainer=(RelativeLayout)findViewById(R.id.ll_container);

        Button b=(Button)findViewById(R.id.buttonDate);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PickerDialogs pickerDialogs=new PickerDialogs();
                pickerDialogs.show(getSupportFragmentManager(),"date_picker");
            }
        });


        imageViewpicturegallary=(ImageView)findViewById(R.id.imageViewGallery);

        imageViewpicturegallary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setType("image/");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(intent, "select image "), 1);
            }
        });

        sp=(Spinner)findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> ar=ArrayAdapter.createFromResource(this,R.array.themes,android.R.layout.simple_list_item_1);
        ar.setDropDownViewResource(android.R.layout.simple_list_item_1);
        sp.setAdapter(ar);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                llContainer.setBackgroundResource(R.drawable.bigwaterheart);
                else if(position==1)
                    llContainer.setBackgroundResource(R.drawable.pinkbear);
                else if (position==2)
                    llContainer.setBackgroundResource(R.drawable.balloons);
                else if(position==3)
                    llContainer.setBackgroundResource(R.drawable.red_rose);
                else
                    llContainer.setBackgroundResource(R.drawable.lovelycouple);



            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void onActivityResult(int reqCode, int resCode,Intent data) {
        if (resCode == RESULT_OK) {
            if (reqCode == 1) {
                imageViewpicturegallary.setImageURI(data.getData());
            }
        }
    }


     /* public void setDate(View view){
        PickerDialogs pickerDialogs=new PickerDialogs();
        pickerDialogs.show(getSupportFragmentManager(),"date_picker");
    }*/


}
