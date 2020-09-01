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

public class Main20Activity extends AppCompatActivity {

    /*
    long diff;
    long message;
    SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
    String inputString1;
    String inputString2;
    */

    int Sydney = 400;
    int Melbourne = 380;
    int Perth = 300;
    int CathayPacific = 1090;
    int DeltaAirline = 1186;
    int KLM = 1300;
    double currency = 1.05;
    double total;

    MediaPlayer mp = new MediaPlayer();
    Button button49;
    Button button50;
    Button button51;
    Button button52;
    Button button53;
    TextView textView42;
    TextView textView43;
    TextView textView44;
    TextView textView45;


    Calendar c1 = Calendar.getInstance();
    Calendar c2 = Calendar.getInstance();
    DateFormat fmtDate = DateFormat.getDateInstance();
    DatePickerDialog.OnDateSetListener d1;
    DatePickerDialog.OnDateSetListener d2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main20);

        textView42 = (TextView)findViewById(R.id.textView42);
        button49 = (Button) findViewById(R.id.button49);
        button50 = (Button) findViewById(R.id.button50);
        button51 = (Button) findViewById(R.id.button51);
        button52 = (Button) findViewById(R.id.button52);
        button53 = (Button) findViewById(R.id.button53);
        final Spinner spinner = (Spinner)findViewById(R.id.spinner19);
        final Spinner spinner2 = (Spinner)findViewById(R.id.spinner20);
        final RadioButton rb1 = (RadioButton)findViewById(R.id.radioButton19);
        final RadioButton rb2 = (RadioButton)findViewById(R.id.radioButton20);


        mp = MediaPlayer.create(this, R.raw.japan);





        button49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();

            }
        });



        button50.setOnClickListener(new View.OnClickListener() {
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

        button51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main20Activity.this, MapsActivity20.class));
            }
        });

        button52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.expedia.ca/")));

            }
        });

        button53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(spinner.getSelectedItemPosition() == 0)
                {
                    if(spinner2.getSelectedItemPosition() == 0)
                    {
                        if(rb1.isChecked())
                        {
                            total = (Sydney*10) + CathayPacific;
                            Toast.makeText(Main20Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }

                        else
                        {
                            total = ((Sydney*10) + CathayPacific) * currency;
                            Toast.makeText(Main20Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }
                    }

                    if(spinner2.getSelectedItemPosition() == 1)
                    {
                        if(rb1.isChecked())
                        {
                            total = (Sydney*10) + DeltaAirline;
                            Toast.makeText(Main20Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }

                        else
                        {
                            total = ((Sydney*10) + DeltaAirline) * currency;
                            Toast.makeText(Main20Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }
                    }

                    if(spinner2.getSelectedItemPosition() == 2)
                    {
                        if(rb1.isChecked())
                        {
                            total = (Sydney*10) + KLM;
                            Toast.makeText(Main20Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }

                        else
                        {
                            total = ((Sydney*10) + KLM) * currency;
                            Toast.makeText(Main20Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }
                    }

                }

                if(spinner.getSelectedItemPosition() == 1)
                {
                    if(spinner2.getSelectedItemPosition() == 0)
                    {
                        if(rb1.isChecked())
                        {
                            total = (Melbourne*10) + CathayPacific;
                            Toast.makeText(Main20Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }

                        else
                        {
                            total = ((Melbourne*10) + CathayPacific) * currency;
                            Toast.makeText(Main20Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }
                    }

                    if(spinner2.getSelectedItemPosition() == 1)
                    {
                        if(rb1.isChecked())
                        {
                            total = (Melbourne*10) + DeltaAirline;
                            Toast.makeText(Main20Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }

                        else
                        {
                            total = ((Melbourne*10) + DeltaAirline) * currency;
                            Toast.makeText(Main20Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }
                    }

                    if(spinner2.getSelectedItemPosition() == 2)
                    {
                        if(rb1.isChecked())
                        {
                            total = (Melbourne*10) + KLM;
                            Toast.makeText(Main20Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }

                        else
                        {
                            total = ((Melbourne*10) + KLM) * currency;
                            Toast.makeText(Main20Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }
                    }

                }

                if(spinner.getSelectedItemPosition() == 2)
                {
                    if(spinner2.getSelectedItemPosition() == 0)
                    {
                        if(rb1.isChecked())
                        {
                            total = (Perth*10) + CathayPacific;
                            Toast.makeText(Main20Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }

                        else
                        {
                            total = ((Perth*10) + CathayPacific) * currency;
                            Toast.makeText(Main20Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }
                    }

                    if(spinner2.getSelectedItemPosition() == 1)
                    {
                        if(rb1.isChecked())
                        {
                            total = (Perth*10) + DeltaAirline;
                            Toast.makeText(Main20Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }

                        else
                        {
                            total = ((Perth*10) + DeltaAirline) * currency;
                            Toast.makeText(Main20Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }
                    }

                    if(spinner2.getSelectedItemPosition() == 2)
                    {
                        if(rb1.isChecked())
                        {
                            total = (Perth*10) + KLM;
                            Toast.makeText(Main20Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }

                        else
                        {
                            total = ((Perth*10) + KLM) * currency;
                            Toast.makeText(Main20Activity.this,String.valueOf(total),Toast.LENGTH_LONG).show();
                        }
                    }

                }
            }
        });


    }


    public void click1(View v) {
        new DatePickerDialog(Main20Activity.this, d1, c1.get(Calendar.YEAR), c1.get(Calendar.MONTH), c1.get(Calendar.DAY_OF_MONTH)).show();

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
        new DatePickerDialog(Main20Activity.this, d2, c2.get(Calendar.YEAR), c2.get(Calendar.MONTH), c2.get(Calendar.DAY_OF_MONTH)).show();

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
