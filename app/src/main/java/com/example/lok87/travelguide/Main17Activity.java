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

public class Main17Activity extends AppCompatActivity {

    /*
    long diff;
    long message;
    SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
    String inputString1;
    String inputString2;
    */

    int Cairo = 200;
    int Giza = 130;
    int Alexandria = 180;
    int TurkishAirline = 2090;
    int AirCanada = 2186;
    int AirChina = 2300;
    double total;

    MediaPlayer mp = new MediaPlayer();
    Button button34;
    Button button35;
    Button button36;
    Button button37;
    Button button38;
    TextView textView30;
    TextView textView31;
    TextView textView32;
    TextView textView33;


    Calendar c1 = Calendar.getInstance();
    Calendar c2 = Calendar.getInstance();
    DateFormat fmtDate = DateFormat.getDateInstance();
    DatePickerDialog.OnDateSetListener d1;
    DatePickerDialog.OnDateSetListener d2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main17);

        textView30 = (TextView)findViewById(R.id.textView30);
        button34 = (Button) findViewById(R.id.button34);
        button35 = (Button) findViewById(R.id.button35);
        button36 = (Button) findViewById(R.id.button36);
        button37 = (Button) findViewById(R.id.button37);
        button38 = (Button) findViewById(R.id.button38);
        final Spinner spinner = (Spinner)findViewById(R.id.spinner13);
        final Spinner spinner2 = (Spinner)findViewById(R.id.spinner14);
        final RadioButton rb1 = (RadioButton)findViewById(R.id.radioButton13);
        final RadioButton rb2 = (RadioButton)findViewById(R.id.radioButton14);


        mp = MediaPlayer.create(this, R.raw.japan);





        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();

            }
        });



        button35.setOnClickListener(new View.OnClickListener() {
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

        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main17Activity.this, MapsActivity17.class));
            }
        });

        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.expedia.ca/")));

            }
        });

        button38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(spinner.getSelectedItemPosition() == 0)
                {
                    if(spinner2.getSelectedItemPosition() == 0)
                    {
                        if(rb1.isChecked())
                        {
                            total = (Cairo*10) + TurkishAirline;
                            Toast.makeText(Main17Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }

                        else
                        {
                            total = ((Cairo*10) + TurkishAirline) * 12.92;
                            Toast.makeText(Main17Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }
                    }

                    if(spinner2.getSelectedItemPosition() == 1)
                    {
                        if(rb1.isChecked())
                        {
                            total = (Cairo*10) + AirCanada;
                            Toast.makeText(Main17Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }

                        else
                        {
                            total = ((Cairo*10) + AirCanada) * 12.92;
                            Toast.makeText(Main17Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }
                    }

                    if(spinner2.getSelectedItemPosition() == 2)
                    {
                        if(rb1.isChecked())
                        {
                            total = (Cairo*10) + AirChina;
                            Toast.makeText(Main17Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }

                        else
                        {
                            total = ((Cairo*10) + AirChina) * 12.92;
                            Toast.makeText(Main17Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }
                    }

                }

                if(spinner.getSelectedItemPosition() == 1)
                {
                    if(spinner2.getSelectedItemPosition() == 0)
                    {
                        if(rb1.isChecked())
                        {
                            total = (Giza*10) + TurkishAirline;
                            Toast.makeText(Main17Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }

                        else
                        {
                            total = ((Giza*10) + TurkishAirline) * 12.92;
                            Toast.makeText(Main17Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }
                    }

                    if(spinner2.getSelectedItemPosition() == 1)
                    {
                        if(rb1.isChecked())
                        {
                            total = (Giza*10) + AirCanada;
                            Toast.makeText(Main17Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }

                        else
                        {
                            total = ((Giza*10) + AirCanada) * 12.92;
                            Toast.makeText(Main17Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }
                    }

                    if(spinner2.getSelectedItemPosition() == 2)
                    {
                        if(rb1.isChecked())
                        {
                            total = (Giza*10) + AirChina;
                            Toast.makeText(Main17Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }

                        else
                        {
                            total = ((Giza*10) + AirChina) * 12.92;
                            Toast.makeText(Main17Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }
                    }

                }

                if(spinner.getSelectedItemPosition() == 2)
                {
                    if(spinner2.getSelectedItemPosition() == 0)
                    {
                        if(rb1.isChecked())
                        {
                            total = (Alexandria*10) + TurkishAirline;
                            Toast.makeText(Main17Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }

                        else
                        {
                            total = ((Alexandria*10) + TurkishAirline) * 12.92;
                            Toast.makeText(Main17Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }
                    }

                    if(spinner2.getSelectedItemPosition() == 1)
                    {
                        if(rb1.isChecked())
                        {
                            total = (Alexandria*10) + AirCanada;
                            Toast.makeText(Main17Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }

                        else
                        {
                            total = ((Alexandria*10) + AirCanada) * 12.92;
                            Toast.makeText(Main17Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }
                    }

                    if(spinner2.getSelectedItemPosition() == 2)
                    {
                        if(rb1.isChecked())
                        {
                            total = (Alexandria*10) + AirChina;
                            Toast.makeText(Main17Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }

                        else
                        {
                            total = ((Alexandria*10) + AirChina) * 12.92;
                            Toast.makeText(Main17Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }
                    }

                }
            }
        });


    }


    public void click1(View v) {
        new DatePickerDialog(Main17Activity.this, d1, c1.get(Calendar.YEAR), c1.get(Calendar.MONTH), c1.get(Calendar.DAY_OF_MONTH)).show();

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
        new DatePickerDialog(Main17Activity.this, d2, c2.get(Calendar.YEAR), c2.get(Calendar.MONTH), c2.get(Calendar.DAY_OF_MONTH)).show();

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
