package com.example.android.sweetmemoriesdiary;

import android.app.DatePickerDialog;
import android.content.Context;
import android.widget.DatePicker;
import android.widget.Toast;

/**
 * Created by Demini_Indrachapa on 4/16/2015.
 */
public class DateSetting implements DatePickerDialog.OnDateSetListener {
    Context context;
    public DateSetting(Context context){
        this.context=context;


    }

    @Override
    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
        Toast.makeText(context, "Selected date : " + monthOfYear + "/ " + dayOfMonth + "/ " + year,
                Toast.LENGTH_SHORT).show();


    }
}
