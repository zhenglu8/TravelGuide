package com.example.lok87.travelguide;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main2Activity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] continents = {"Asia","Europe","Africa","Australia","North America","South America"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main2, R.id.travel, continents));



    }

    protected void onListItemClick(ListView l, View v, int position, long id){
        switch(position)
        {
            case 0:
                startActivity(new Intent(Main2Activity.this, Main5Activity.class));
                break;

            case 1:
                startActivity(new Intent(Main2Activity.this, Main6Activity.class));
                break;

            case 2:
                startActivity(new Intent(Main2Activity.this, Main7Activity.class));
                break;

            case 3:
                startActivity(new Intent(Main2Activity.this, Main8Activity.class));
                break;

            case 4:
                startActivity(new Intent(Main2Activity.this, Main9Activity.class));
                break;

            case 5:
                startActivity(new Intent(Main2Activity.this, Main10Activity.class));
                break;




        }
    }
}
