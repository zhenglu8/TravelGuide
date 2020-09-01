package com.example.lok87.travelguide;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main6Activity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] europe = {"Germany","Italy","France"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main6, R.id.travel, europe));
    }

    protected void onListItemClick(ListView l, View v, int position, long id){
        switch(position)
        {
            case 0:
                startActivity(new Intent(Main6Activity.this, Main14Activity.class));
                break;

            case 1:
                startActivity(new Intent(Main6Activity.this, Main15Activity.class));
                break;

            case 2:
                startActivity(new Intent(Main6Activity.this, Main16Activity.class));
                break;




        }
    }
}