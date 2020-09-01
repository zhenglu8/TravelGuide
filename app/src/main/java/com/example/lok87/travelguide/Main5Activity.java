package com.example.lok87.travelguide;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main5Activity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] asia = {"Japan","China","Thaliand"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main5, R.id.travel, asia));
    }

    protected void onListItemClick(ListView l, View v, int position, long id){
        switch(position)
        {
            case 0:
                startActivity(new Intent(Main5Activity.this, Main11Activity.class));
                break;

            case 1:
                startActivity(new Intent(Main5Activity.this, Main12Activity.class));
                break;

            case 2:
                startActivity(new Intent(Main5Activity.this, Main13Activity.class));
                break;




        }
    }
}
