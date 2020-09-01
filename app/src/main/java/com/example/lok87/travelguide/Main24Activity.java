package com.example.lok87.travelguide;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.system.Os;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Main24Activity extends AppCompatActivity {

    /*
    long diff;
    long message;
    SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
    String inputString1;
    String inputString2;
    */

    int city1 = 500;
    int city2 = 480;
    int city3 = 400;
    int flight1 = 325;
    int flight2 = 386;
    int flight3 = 394;
    double currency = 0.75;
    double total;

    MediaPlayer mp = new MediaPlayer();
    Button button64;
    Button button65;
    Button button66;
    Button button67;
    Button button68;
    TextView textView54;
    TextView textView55;
    TextView textView56;
    TextView textView57;


    Calendar c1 = Calendar.getInstance();
    Calendar c2 = Calendar.getInstance();
    DateFormat fmtDate = DateFormat.getDateInstance();
    DatePickerDialog.OnDateSetListener d1;
    DatePickerDialog.OnDateSetListener d2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main24);

        textView54 = (TextView)findViewById(R.id.textView54);
        button64 = (Button) findViewById(R.id.button64);
        button65 = (Button) findViewById(R.id.button65);
        button66 = (Button) findViewById(R.id.button66);
        button67 = (Button) findViewById(R.id.button67);
        button68 = (Button) findViewById(R.id.button68);
        final Spinner spinner = (Spinner)findViewById(R.id.spinner25);
        final Spinner spinner2 = (Spinner)findViewById(R.id.spinner26);
        final RadioButton rb1 = (RadioButton)findViewById(R.id.radioButton25);
        final RadioButton rb2 = (RadioButton)findViewById(R.id.radioButton26);


        mp = MediaPlayer.create(this, R.raw.japan);





        button64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();

            }
        });



        button65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.pause();

                //Toast.makeText(Main11Activity.this,inputString1,Toast.LENGTH_LONG).show();

                /*
                try {
                    Date date1 = myFormat.parse(inputString1);
                    Date date2 = myFormat.parse(inputString2);
                    diff = date2.getTime() - date1.getTime();
                    message = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
                } catch (ParseException e) {
                    e.printStackTrace();
                }


                textView1.setText(message);
                */
            }


        });

        button66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main24Activity.this, MapsActivity24.class));
            }
        });

        button67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.expedia.ca/")));

            }
        });

        button68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(spinner.getSelectedItemPosition() == 0)
                {
                    if(spinner2.getSelectedItemPosition() == 0)
                    {
                        if(rb1.isChecked())
                        {
                            total = (city1*10) + flight1;
                            Toast.makeText(Main24Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }

                        else
                        {
                            total = ((city1*10) + flight1) * currency;
                            Toast.makeText(Main24Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }
                    }

                    if(spinner2.getSelectedItemPosition() == 1)
                    {
                        if(rb1.isChecked())
                        {
                            total = (city1*10) + flight2;
                            Toast.makeText(Main24Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }

                        else
                        {
                            total = ((city1*10) + flight2) * currency;
                            Toast.makeText(Main24Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }
                    }

                    if(spinner2.getSelectedItemPosition() == 2)
                    {
                        if(rb1.isChecked())
                        {
                            total = (city1*10) + flight3;
                            Toast.makeText(Main24Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }

                        else
                        {
                            total = ((city1*10) + flight3) * currency;
                            Toast.makeText(Main24Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }
                    }

                }

                if(spinner.getSelectedItemPosition() == 1)
                {
                    if(spinner2.getSelectedItemPosition() == 0)
                    {
                        if(rb1.isChecked())
                        {
                            total = (city2*10) + flight1;
                            Toast.makeText(Main24Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }

                        else
                        {
                            total = ((city2*10) + flight1) * currency;
                            Toast.makeText(Main24Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }
                    }

                    if(spinner2.getSelectedItemPosition() == 1)
                    {
                        if(rb1.isChecked())
                        {
                            total = (city2*10) + flight2;
                            Toast.makeText(Main24Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }

                        else
                        {
                            total = ((city2*10) + flight2) * currency;
                            Toast.makeText(Main24Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }
                    }

                    if(spinner2.getSelectedItemPosition() == 2)
                    {
                        if(rb1.isChecked())
                        {
                            total = (city2*10) + flight3;
                            Toast.makeText(Main24Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }

                        else
                        {
                            total = ((city2*10) + flight3) * currency;
                            Toast.makeText(Main24Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }
                    }

                }

                if(spinner.getSelectedItemPosition() == 2)
                {
                    if(spinner2.getSelectedItemPosition() == 0)
                    {
                        if(rb1.isChecked())
                        {
                            total = (city3*10) + flight1;
                            Toast.makeText(Main24Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }

                        else
                        {
                            total = ((city3*10) + flight1) * currency;
                            Toast.makeText(Main24Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }
                    }

                    if(spinner2.getSelectedItemPosition() == 1)
                    {
                        if(rb1.isChecked())
                        {
                            total = (city3*10) + flight2;
                            Toast.makeText(Main24Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }

                        else
                        {
                            total = ((city3*10) + flight2) * currency;
                            Toast.makeText(Main24Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }
                    }

                    if(spinner2.getSelectedItemPosition() == 2)
                    {
                        if(rb1.isChecked())
                        {
                            total = (city3*10) + flight3;
                            Toast.makeText(Main24Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }

                        else
                        {
                            total = ((city3*10) + flight3) * currency;
                            Toast.makeText(Main24Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }
                    }

                }
            }
        });


    }


    public void click1(View v) {
        new DatePickerDialog(Main24Activity.this, d1, c1.get(Calendar.YEAR), c1.get(Calendar.MONTH), c1.get(Calendar.DAY_OF_MONTH)).show();

        d1 = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                c1.set(Calendar.YEAR, year);
                c1.set(Calendar.MONTH, month);
                c1.set(Calendar.DAY_OF_MONTH, dayOfMonth);

            }
        };


        //inputString1 = String.valueOf(c1.get(Calendar.DAY_OF_MONTH)) +" "+ String.valueOf(c1.get(Calendar.MONTH)) +" "+ String.valueOf(c1.get(Calendar.YEAR));



    }

    public void click2(View v) {
        new DatePickerDialog(Main24Activity.this, d2, c2.get(Calendar.YEAR), c2.get(Calendar.MONTH), c2.get(Calendar.DAY_OF_MONTH)).show();

        d2 = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                c2.set(Calendar.YEAR, year);
                c2.set(Calendar.MONTH, month);
                c2.set(Calendar.DAY_OF_MONTH, dayOfMonth);


            }
        };

        //inputString2 = String.valueOf(c2.get(Calendar.DAY_OF_MONTH)) + String.valueOf(c2.get(Calendar.MONTH)) + String.valueOf(c2.get(Calendar.YEAR));


    }




}