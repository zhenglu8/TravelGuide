package com.example.lok87.travelguide;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.Calendar;

public class Main14Activity extends AppCompatActivity {

    int Berlin = 300;
    int Munich = 230;
    int Frankfurt = 280;
    int AirCanada = 1264;
    int UnitedAirline = 1294;
    int DeltaAirline = 1190;
    double total;

    MediaPlayer mp = new MediaPlayer();
    Button button9;
    Button button10;
    Button button11;
    Button button12;
    Button button13;
    TextView textView5;
    TextView textView6;
    TextView textView7;
    TextView textView8;


    Calendar c1 = Calendar.getInstance();
    Calendar c2 = Calendar.getInstance();
    DateFormat fmtDate = DateFormat.getDateInstance();
    DatePickerDialog.OnDateSetListener d1;
    DatePickerDialog.OnDateSetListener d2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);

        textView5 = (TextView)findViewById(R.id.textView5);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        button11 = (Button) findViewById(R.id.button11);
        button12 = (Button) findViewById(R.id.button12);
        button13 = (Button) findViewById(R.id.button13);
        final Spinner spinner3 = (Spinner)findViewById(R.id.spinner3);
        final Spinner spinner4 = (Spinner)findViewById(R.id.spinner4);
        final RadioButton rb3 = (RadioButton)findViewById(R.id.radioButton3);
        final RadioButton rb4 = (RadioButton)findViewById(R.id.radioButton4);


        mp = MediaPlayer.create(this, R.raw.germany);


        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();

            }
        });



        button10.setOnClickListener(new View.OnClickListener() {
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

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main14Activity.this, MapsActivity14.class));
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.expedia.ca/")));

            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(spinner3.getSelectedItemPosition() == 0)
                {
                    if(spinner4.getSelectedItemPosition() == 0)
                    {
                        if(rb3.isChecked())
                        {
                            total = (Berlin*10) + AirCanada;
                            Toast.makeText(Main14Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }

                        else if(rb4.isChecked())
                        {
                            total = ((Berlin*10) + AirCanada) * 0.67;
                            Toast.makeText(Main14Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }
                    }

                    if(spinner4.getSelectedItemPosition() == 1)
                    {
                        if(rb3.isChecked())
                        {
                            total = (Berlin*10) + UnitedAirline;
                            Toast.makeText(Main14Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }

                        else if(rb4.isChecked())
                        {
                            total = ((Berlin*10) + UnitedAirline) * 0.67;
                            Toast.makeText(Main14Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }
                    }

                    if(spinner4.getSelectedItemPosition() == 2)
                    {
                        if(rb3.isChecked())
                        {
                            total = (Berlin*10) + DeltaAirline;
                            Toast.makeText(Main14Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }

                        else if(rb4.isChecked())
                        {
                            total = ((Berlin*10) + DeltaAirline) * 0.67;
                            Toast.makeText(Main14Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }
                    }

                }

                if(spinner3.getSelectedItemPosition() == 1)
                {
                    if(spinner4.getSelectedItemPosition() == 0)
                    {
                        if(rb3.isChecked())
                        {
                            total = (Munich*10) + AirCanada;
                            Toast.makeText(Main14Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }

                        else if(rb4.isChecked())
                        {
                            total = ((Munich*10) + AirCanada) * 0.67;
                            Toast.makeText(Main14Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }
                    }

                    if(spinner4.getSelectedItemPosition() == 1)
                    {
                        if(rb3.isChecked())
                        {
                            total = (Munich*10) + UnitedAirline;
                            Toast.makeText(Main14Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }

                        else if(rb4.isChecked())
                        {
                            total = ((Munich*10) + UnitedAirline) * 0.67;
                            Toast.makeText(Main14Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }
                    }

                    if(spinner4.getSelectedItemPosition() == 2)
                    {
                        if(rb3.isChecked())
                        {
                            total = (Munich*10) + DeltaAirline;
                            Toast.makeText(Main14Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }

                        else if(rb4.isChecked())
                        {
                            total = ((Munich*10) + DeltaAirline) * 0.67;
                            Toast.makeText(Main14Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }
                    }

                }

                if(spinner3.getSelectedItemPosition() == 2)
                {
                    if(spinner4.getSelectedItemPosition() == 0)
                    {
                        if(rb3.isChecked())
                        {
                            total = (Frankfurt*10) + AirCanada;
                            Toast.makeText(Main14Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }

                        else if(rb4.isChecked())
                        {
                            total = ((Frankfurt*10) + AirCanada) * 0.67;
                            Toast.makeText(Main14Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }
                    }

                    if(spinner4.getSelectedItemPosition() == 1)
                    {
                        if(rb3.isChecked())
                        {
                            total = (Frankfurt*10) + UnitedAirline;
                            Toast.makeText(Main14Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }

                        else if(rb4.isChecked())
                        {
                            total = ((Frankfurt*10) + UnitedAirline) * 0.67;
                            Toast.makeText(Main14Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }
                    }

                    if(spinner4.getSelectedItemPosition() == 2)
                    {
                        if(rb3.isChecked())
                        {
                            total = (Frankfurt*10) + DeltaAirline;
                            Toast.makeText(Main14Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }

                        else if(rb4.isChecked())
                        {
                            total = ((Frankfurt*10) + DeltaAirline) * 0.67;
                            Toast.makeText(Main14Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }
                    }

                }
            }
        });


    }

    public void click1(View v) {
        new DatePickerDialog(Main14Activity.this, d1, c1.get(Calendar.YEAR), c1.get(Calendar.MONTH), c1.get(Calendar.DAY_OF_MONTH)).show();

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
        new DatePickerDialog(Main14Activity.this, d2, c2.get(Calendar.YEAR), c2.get(Calendar.MONTH), c2.get(Calendar.DAY_OF_MONTH)).show();

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
