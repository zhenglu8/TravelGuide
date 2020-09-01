package com.example.lok87.travelguide;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main7Activity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] africa = {"Egypt","Morocco","South Africa"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main5, R.id.travel, africa));
    }

    protected void onListItemClick(ListView l, View v, int position, long id){
        switch(position)
        {
            case 0:
                startActivity(new Intent(Main7Activity.this, Main17Activity.class));
                break;

            case 1:
                startActivity(new Intent(Main7Activity.this, Main18Activity.class));
                break;

            case 2:
                startActivity(new Intent(Main7Activity.this, Main19Activity.class));
                break;




        }
    }
}
