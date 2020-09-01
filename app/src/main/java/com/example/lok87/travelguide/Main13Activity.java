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

public class Main13Activity extends AppCompatActivity {

    /*
    long diff;
    long message;
    SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
    String inputString1;
    String inputString2;
    */

    int Bangkok = 250;
    int ChiangMai = 300;
    int Pattaya = 200;
    int ChinaEasternAirline = 1070;
    int HongKongAirline = 977;
    int PhilippineAirline = 625;
    int total;

    MediaPlayer mp = new MediaPlayer();
    Button button19;
    Button button20;
    Button button21;
    Button button22;
    Button button23;
    TextView textView18;
    TextView textView19;
    TextView textView20;
    TextView textView21;


    Calendar c1 = Calendar.getInstance();
    Calendar c2 = Calendar.getInstance();
    DateFormat fmtDate = DateFormat.getDateInstance();
    DatePickerDialog.OnDateSetListener d1;
    DatePickerDialog.OnDateSetListener d2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);

        textView18 = (TextView)findViewById(R.id.textView18);
        button19 = (Button) findViewById(R.id.button19);
        button20 = (Button) findViewById(R.id.button20);
        button21 = (Button) findViewById(R.id.button21);
        button22 = (Button) findViewById(R.id.button22);
        button23 = (Button) findViewById(R.id.button23);
        final Spinner spinner = (Spinner)findViewById(R.id.spinner7);
        final Spinner spinner2 = (Spinner)findViewById(R.id.spinner8);
        final RadioButton rb1 = (RadioButton)findViewById(R.id.radioButton7);
        final RadioButton rb2 = (RadioButton)findViewById(R.id.radioButton8);


        mp = MediaPlayer.create(this, R.raw.japan);





        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();

            }
        });



        button20.setOnClickListener(new View.OnClickListener() {
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

        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main13Activity.this, MapsActivity13.class));
            }
        });

        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.expedia.ca/")));

            }
        });

        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(spinner.getSelectedItemPosition() == 0)
                {
                    if(spinner2.getSelectedItemPosition() == 0)
                    {
                        if(rb1.isChecked())
                        {
                            total = (Bangkok*10) + ChinaEasternAirline;
                            Toast.makeText(Main13Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }

                        else
                        {
                            total = ((Bangkok*10) + ChinaEasternAirline) * 23;
                            Toast.makeText(Main13Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }
                    }

                    if(spinner2.getSelectedItemPosition() == 1)
                    {
                        if(rb1.isChecked())
                        {
                            total = (Bangkok*10) + HongKongAirline;
                            Toast.makeText(Main13Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }

                        else
                        {
                            total = ((Bangkok*10) + HongKongAirline) * 23;
                            Toast.makeText(Main13Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }
                    }

                    if(spinner2.getSelectedItemPosition() == 2)
                    {
                        if(rb1.isChecked())
                        {
                            total = (Bangkok*10) + PhilippineAirline;
                            Toast.makeText(Main13Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }

                        else
                        {
                            total = ((Bangkok*10) + PhilippineAirline) * 23;
                            Toast.makeText(Main13Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }
                    }

                }

                if(spinner.getSelectedItemPosition() == 1)
                {
                    if(spinner2.getSelectedItemPosition() == 0)
                    {
                        if(rb1.isChecked())
                        {
                            total = (ChiangMai*10) + ChinaEasternAirline;
                            Toast.makeText(Main13Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }

                        else
                        {
                            total = ((ChiangMai*10) + ChinaEasternAirline) * 23;
                            Toast.makeText(Main13Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }
                    }

                    if(spinner2.getSelectedItemPosition() == 1)
                    {
                        if(rb1.isChecked())
                        {
                            total = (ChiangMai*10) + HongKongAirline;
                            Toast.makeText(Main13Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }

                        else
                        {
                            total = ((ChiangMai*10) + HongKongAirline) * 23;
                            Toast.makeText(Main13Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }
                    }

                    if(spinner2.getSelectedItemPosition() == 2)
                    {
                        if(rb1.isChecked())
                        {
                            total = (ChiangMai*10) + PhilippineAirline;
                            Toast.makeText(Main13Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }

                        else
                        {
                            total = ((ChiangMai*10) + PhilippineAirline) * 23;
                            Toast.makeText(Main13Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }
                    }

                }

                if(spinner.getSelectedItemPosition() == 2)
                {
                    if(spinner2.getSelectedItemPosition() == 0)
                    {
                        if(rb1.isChecked())
                        {
                            total = (Pattaya*10) + ChinaEasternAirline;
                            Toast.makeText(Main13Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }

                        else
                        {
                            total = ((Pattaya*10) + ChinaEasternAirline) * 23;
                            Toast.makeText(Main13Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }
                    }

                    if(spinner2.getSelectedItemPosition() == 1)
                    {
                        if(rb1.isChecked())
                        {
                            total = (Pattaya*10) + HongKongAirline;
                            Toast.makeText(Main13Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }

                        else
                        {
                            total = ((Pattaya*10) + HongKongAirline) * 23;
                            Toast.makeText(Main13Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }
                    }

                    if(spinner2.getSelectedItemPosition() == 2)
                    {
                        if(rb1.isChecked())
                        {
                            total = (Pattaya*10) + PhilippineAirline;
                            Toast.makeText(Main13Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }

                        else
                        {
                            total = ((Pattaya*10) + PhilippineAirline) * 23;
                            Toast.makeText(Main13Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }
                    }

                }
            }
        });


    }


    public void click1(View v) {
        new DatePickerDialog(Main13Activity.this, d1, c1.get(Calendar.YEAR), c1.get(Calendar.MONTH), c1.get(Calendar.DAY_OF_MONTH)).show();

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
        new DatePickerDialog(Main13Activity.this, d2, c2.get(Calendar.YEAR), c2.get(Calendar.MONTH), c2.get(Calendar.DAY_OF_MONTH)).show();

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
