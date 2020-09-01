package com.example.lok87.travelguide;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main8Activity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] Australia = {"Australia","New Zealand"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main5, R.id.travel, Australia));
    }

    protected void onListItemClick(ListView l, View v, int position, long id){
        switch(position)
        {
            case 0:
                startActivity(new Intent(Main8Activity.this, Main20Activity.class));
                break;

            case 1:
                startActivity(new Intent(Main8Activity.this, Main21Activity.class));
                break;

            case 2:
                startActivity(new Intent(Main8Activity.this, Main22Activity.class));
                break;




        }
    }
}
