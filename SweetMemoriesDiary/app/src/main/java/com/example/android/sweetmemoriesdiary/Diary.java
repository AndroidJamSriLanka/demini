package com.example.android.sweetmemoriesdiary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Spinner;

import com.parse.ParseObject;

/**
 * Created by Demini_Indrachapa on 4/16/2015.
 */
public class Diary extends FragmentActivity {
    Spinner sp;
    EditText editText,editTextDate;
    ImageView imageViewpicturegallary;
    String path;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diary);

        final RelativeLayout llContainer=(RelativeLayout)findViewById(R.id.ll_container);
        editText = (EditText) findViewById(R.id.editText2);
        editTextDate = (EditText) findViewById(R.id.editTextDate);

        Button b=(Button)findViewById(R.id.buttonMemories);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Diary.this,RefreshMemories.class);
                startActivity(intent);
            }
        });





       /* Spinner spinner = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, title); //selected item will look like a spinner set from XML
        spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(spinnerArrayAdapter);*/

       /* btnDatePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Diary.this,"date",Toast.LENGTH_LONG).show();
            }
        });*/

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
        });    }

    public void onActivityResult(int reqCode, int resCode,Intent data) {
        if (resCode == RESULT_OK) {
            if (reqCode == 1) {
                imageViewpicturegallary.setImageURI(data.getData());
                path=data.getData().getPath();
            }
        }
    }

    // And to convert the image URI to the direct file system path of the image file




    public void Save(View view){
        String Note = editText.getText().toString();
        String Date = editTextDate.getText().toString();

        ParseObject userObject = new ParseObject("Memories");
        userObject.put("Note", Note);
        userObject.put("Image", path);
        userObject.put("Date", Date);

        userObject.saveInBackground();


    }


}



