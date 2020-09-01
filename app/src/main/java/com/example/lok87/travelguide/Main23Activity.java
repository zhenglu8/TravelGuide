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

public class Main23Activity extends AppCompatActivity {

    /*
    long diff;
    long message;
    SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
    String inputString1;
    String inputString2;
    */

    int city1 = 200;
    int city2 = 180;
    int city3 = 170;
    int flight1 = 693;
    int flight2 = 786;
    int flight3 = 694;
    //double currency = 1.11;
    double total;

    MediaPlayer mp = new MediaPlayer();
    Button button59;
    Button button60;
    Button button61;
    Button button62;
    Button button63;
    TextView textView50;
    TextView textView51;
    TextView textView52;
    TextView textView53;


    Calendar c1 = Calendar.getInstance();
    Calendar c2 = Calendar.getInstance();
    DateFormat fmtDate = DateFormat.getDateInstance();
    DatePickerDialog.OnDateSetListener d1;
    DatePickerDialog.OnDateSetListener d2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main23);

        textView50 = (TextView)findViewById(R.id.textView50);
        button59 = (Button) findViewById(R.id.button59);
        button60 = (Button) findViewById(R.id.button60);
        button61 = (Button) findViewById(R.id.button61);
        button62 = (Button) findViewById(R.id.button62);
        button63 = (Button) findViewById(R.id.button63);
        final Spinner spinner = (Spinner)findViewById(R.id.spinner23);
        final Spinner spinner2 = (Spinner)findViewById(R.id.spinner24);
        final RadioButton rb1 = (RadioButton)findViewById(R.id.radioButton23);
        //final RadioButton rb2 = (RadioButton)findViewById(R.id.radioButton22);


        mp = MediaPlayer.create(this, R.raw.japan);





        button59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();

            }
        });



        button60.setOnClickListener(new View.OnClickListener() {
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

        button61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main23Activity.this, MapsActivity23.class));
            }
        });

        button62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.expedia.ca/")));

            }
        });

        button63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(spinner.getSelectedItemPosition() == 0)
                {
                    if(spinner2.getSelectedItemPosition() == 0)
                    {
                        if(rb1.isChecked())
                        {
                            total = (city1*10) + flight1;
                            Toast.makeText(Main23Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }


                    }

                    if(spinner2.getSelectedItemPosition() == 1)
                    {
                        if(rb1.isChecked())
                        {
                            total = (city1*10) + flight2;
                            Toast.makeText(Main23Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }


                    }

                    if(spinner2.getSelectedItemPosition() == 2)
                    {
                        if(rb1.isChecked())
                        {
                            total = (city1*10) + flight3;
                            Toast.makeText(Main23Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
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
                            Toast.makeText(Main23Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }


                    }

                    if(spinner2.getSelectedItemPosition() == 1)
                    {
                        if(rb1.isChecked())
                        {
                            total = (city2*10) + flight2;
                            Toast.makeText(Main23Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }


                    }

                    if(spinner2.getSelectedItemPosition() == 2)
                    {
                        if(rb1.isChecked())
                        {
                            total = (city2*10) + flight3;
                            Toast.makeText(Main23Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
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
                            Toast.makeText(Main23Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }


                    }

                    if(spinner2.getSelectedItemPosition() == 1)
                    {
                        if(rb1.isChecked())
                        {
                            total = (city3*10) + flight2;
                            Toast.makeText(Main23Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }


                    }

                    if(spinner2.getSelectedItemPosition() == 2)
                    {
                        if(rb1.isChecked())
                        {
                            total = (city3*10) + flight3;
                            Toast.makeText(Main23Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }


                    }

                }
            }
        });


    }


    public void click1(View v) {
        new DatePickerDialog(Main23Activity.this, d1, c1.get(Calendar.YEAR), c1.get(Calendar.MONTH), c1.get(Calendar.DAY_OF_MONTH)).show();

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
        new DatePickerDialog(Main23Activity.this, d2, c2.get(Calendar.YEAR), c2.get(Calendar.MONTH), c2.get(Calendar.DAY_OF_MONTH)).show();

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
