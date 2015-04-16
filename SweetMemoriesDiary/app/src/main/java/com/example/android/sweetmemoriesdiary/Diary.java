package com.example.android.sweetmemoriesdiary;

import android.support.v4.app.FragmentActivity;
import android.view.View;

/**
 * Created by Demini_Indrachapa on 4/16/2015.
 */
public class Diary extends FragmentActivity {
    public void setDate(View view){
        PickerDialogs pickerDialogs=new PickerDialogs();
        pickerDialogs.show(getSupportFragmentManager(),"date_picker");
    }
}
