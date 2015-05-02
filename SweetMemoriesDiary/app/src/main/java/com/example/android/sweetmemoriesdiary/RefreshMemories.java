package com.example.android.sweetmemoriesdiary;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.parse.FindCallback;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.util.List;

/**
 * Created by Demini_Indrachapa on 5/2/2015.
 */
public class RefreshMemories extends ListActivity {
    String [] dates;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.refresh_memories);

         final ParseQuery<ParseObject> query = new ParseQuery<ParseObject>("Memories");
        query.findInBackground(new FindCallback<ParseObject>() {

            @Override
            public void done(List<ParseObject> parseObjects, com.parse.ParseException e) {
                if (e == null) {
                    dates = new String[parseObjects.size()];
                    int i = 0;
                    for (ParseObject obj : parseObjects) {
                        dates[i] = obj.getString("Date");
                        i++;

                        //RefreshMemories.this.setListAdapter(new ArrayAdapter<String>(this, R.layout.list_item, R.id.label, dates));
                    }
                } else {
                    // handle Parse Exception here
                }
            }
            // this.setListAdapter(new ArrayAdapter<String>(this, R.layout.list_item, R.id.label, dates));

        }
    }
}


        // Binding resources Array to ListAdapter



