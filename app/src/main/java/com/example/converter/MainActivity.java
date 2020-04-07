package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    public boolean meters = true;
    public boolean kilometers;
    public boolean centimeters;
    public boolean feet;
    public boolean miles;
    public boolean inches;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Spinner spinner = (Spinner) findViewById(R.id.spinner2); spinner.getBackground().setColorFilter(getResources().getColor(R.color.colorPrimary), PorterDuff.Mode.SRC_ATOP);
        Spinner spinner = (Spinner) findViewById(R.id.spinner2);
        AdapterView.OnItemSelectedListener itemSelectedListener = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                // Получаем выбранный объект
                String item = (String) parent.getItemAtPosition(position);
                System.out.println(item);
                if (item.equals("Русский")) {
                    TextView tv = (TextView) findViewById(R.id.textView13);
                    tv.setText("метры");
                    tv = (TextView) findViewById(R.id.textView);
                    tv.setText("Язык");
                    tv = (TextView) findViewById(R.id.radioButton7);
                    tv.setText("метры");
                    tv = (TextView) findViewById(R.id.radioButton8);
                    tv.setText("километры");
                    tv = (TextView) findViewById(R.id.radioButton9);
                    tv.setText("сантиметры");
                    tv = (TextView) findViewById(R.id.radioButton10);
                    tv.setText("футы");
                    tv = (TextView) findViewById(R.id.radioButton11);
                    tv.setText("дюймы");
                    tv = (TextView) findViewById(R.id.radioButton12);
                    tv.setText("мили");
                    tv = (TextView) findViewById(R.id.textView14);
                    tv.setText("километры");
                    tv = (TextView) findViewById(R.id.textView15);
                    tv.setText("сантиметры");
                    tv = (TextView) findViewById(R.id.textView10);
                    tv.setText("футы");
                    tv = (TextView) findViewById(R.id.textView11);
                    tv.setText("дюймы");
                    tv = (TextView) findViewById(R.id.textView12);
                    tv.setText("мили");
                } else {
                    TextView tv = (TextView) findViewById(R.id.textView13);
                    tv.setText("meters");
                    tv = (TextView) findViewById(R.id.textView);
                    tv.setText("Language");
                    tv = (TextView) findViewById(R.id.radioButton7);
                    tv.setText("meters");
                    tv = (TextView) findViewById(R.id.radioButton8);
                    tv.setText("kilometers");
                    tv = (TextView) findViewById(R.id.radioButton9);
                    tv.setText("centimeters");
                    tv = (TextView) findViewById(R.id.radioButton10);
                    tv.setText("feet");
                    tv = (TextView) findViewById(R.id.radioButton11);
                    tv.setText("inches");
                    tv = (TextView) findViewById(R.id.radioButton12);
                    tv.setText("miles");
                    tv = (TextView) findViewById(R.id.textView14);
                    tv.setText("kilometers");
                    tv = (TextView) findViewById(R.id.textView15);
                    tv.setText("centimeters");
                    tv = (TextView) findViewById(R.id.textView10);
                    tv.setText("feet");
                    tv = (TextView) findViewById(R.id.textView11);
                    tv.setText("inches");
                    tv = (TextView) findViewById(R.id.textView12);
                    tv.setText("miles");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        };
        spinner.setOnItemSelectedListener(itemSelectedListener);
        final EditText editText = (EditText) findViewById(R.id.textView2);
        editText.setOnKeyListener(new View.OnKeyListener() {
                                      public boolean onKey(View v, int keyCode, KeyEvent event) {
                                          if (event.getAction() == KeyEvent.ACTION_DOWN &&
                                                  (keyCode == KeyEvent.KEYCODE_ENTER)) {
                                              String strCatName = editText.getText().toString();
                                              /*System.out.println(strCatName);
                                              double val = Double.parseDouble(strCatName);
                                              if(meters){
                                                  TextView tw = findViewById(R.id.textView5);// метры
                                                  tw.setText(Double.toString(val));
                                                  tw = findViewById(R.id.textView4);// километры
                                                  double kilom = val / 1000;
                                                  tw.setText(Double.toString(kilom));
                                                  tw = findViewById(R.id.textView3); // сантиметры
                                                  double centi = val * 100;
                                                  tw.setText(Double.toString(centi));
                                                  tw = findViewById(R.id.textView7);// дюймы
                                                  double inch = 39.37 * val;
                                                  tw.setText(Double.toString(inch));
                                                  tw = findViewById(R.id.textView8);// футы
                                                  double feeet = 3.28*val;
                                                  tw.setText(Double.toString(feeet));
                                                  tw = findViewById(R.id.textView6);// мили
                                                  double mile = val*0.000621371;
                                                  tw.setText(Double.toString(mile));
                                              }
                                              else if(kilometers){
                                                  TextView tw = findViewById(R.id.textView4);// километры
                                                  tw.setText(Double.toString(val));
                                                  tw = findViewById(R.id.textView5);// метры
                                                  double meter = val * 1000;
                                                  tw.setText(Double.toString(meter));
                                                  tw = findViewById(R.id.textView3); // сантиметры
                                                  double centi = val * 100000;
                                                  tw.setText(Double.toString(centi));
                                                  tw = findViewById(R.id.textView7);// дюймы
                                                  double inch = 39370.1 * val;
                                                  tw.setText(Double.toString(inch));
                                                  tw = findViewById(R.id.textView8);// футы
                                                  double feeet = 3280.84*val;
                                                  tw.setText(Double.toString(feeet));
                                                  tw = findViewById(R.id.textView6);// мили
                                                  double mile = val*0.621371;
                                                  tw.setText(Double.toString(mile));
                                              }
                                              else if(centimeters){

                                              }
                                              else if(inches){

                                              }
                                              else if(feet){

                                              }
                                              else if(miles){

                                              }*/
                                              update(strCatName);
                                              return true;
                                          }
                                          return false;
                                      }
                                  }
        );
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        RadioGroup radioGroup = findViewById(R.id.layout_2);
        radioGroup.clearCheck();
        String strCatName = ((TextView) (findViewById(R.id.textView2))).getText().toString();
        switch (view.getId()) {
            case R.id.radioButton7:
                if (checked) {
                    meters = true;
                    kilometers = false;
                    centimeters = false;
                    miles = false;
                    inches = false;
                    feet = false;
                    update(strCatName);
                }
                break;
            case R.id.radioButton8:
                if (checked) {
                    meters = false;
                    kilometers = true;
                    centimeters = false;
                    miles = false;
                    inches = false;
                    feet = false;
                    update(strCatName);
                }
                break;
            case R.id.radioButton9:
                if (checked) {
                    meters = false;
                    kilometers = false;
                    centimeters = true;
                    miles = false;
                    inches = false;
                    feet = false;
                    update(strCatName);
                }
                break;
        }
    }

    public void onRadioButtonClicked1(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        RadioGroup radioGroup = findViewById(R.id.layout_1);
        radioGroup.clearCheck();
        String strCatName = ((TextView) (findViewById(R.id.textView2))).getText().toString();
        switch (view.getId()) {
            case R.id.radioButton10:
                if (checked) {
                    meters = false;
                    kilometers = false;
                    centimeters = false;
                    miles = false;
                    inches = false;
                    feet = true;
                    update(strCatName);
                }
                break;
            case R.id.radioButton11:
                if (checked) {
                    meters = false;
                    kilometers = false;
                    centimeters = false;
                    miles = false;
                    inches = true;
                    feet = false;
                    update(strCatName);
                }
                break;
            case R.id.radioButton12:
                if (checked) {
                    meters = false;
                    kilometers = false;
                    centimeters = false;
                    miles = true;
                    inches = false;
                    feet = false;
                    update(strCatName);
                }
                break;
        }
    }

    public void update(String strCatName) {
        //EditText editText = (EditText)findViewById(R.id.textView2);
        double val = Double.parseDouble(strCatName);
        if (meters) {
            TextView tw = findViewById(R.id.textView5);// метры
            tw.setText(Double.toString(val));
            tw = findViewById(R.id.textView4);// километры
            double kilom = val / 1000;
            tw.setText(Double.toString(kilom));
            tw = findViewById(R.id.textView3); // сантиметры
            double centi = val * 100;
            tw.setText(Double.toString(centi));
            tw = findViewById(R.id.textView7);// дюймы
            double inch = 39.37 * val;
            tw.setText(Double.toString(inch));
            tw = findViewById(R.id.textView8);// футы
            double feeet = 3.28 * val;
            tw.setText(Double.toString(feeet));
            tw = findViewById(R.id.textView6);// мили
            double mile = val * 0.000621371;
            tw.setText(Double.toString(mile));
        } else if (kilometers) {
            TextView tw = findViewById(R.id.textView4);// километры
            tw.setText(Double.toString(val));
            tw = findViewById(R.id.textView5);// метры
            double meter = val * 1000;
            tw.setText(Double.toString(meter));
            tw = findViewById(R.id.textView3); // сантиметры
            double centi = val * 100000;
            tw.setText(Double.toString(centi));
            tw = findViewById(R.id.textView7);// дюймы
            double inch = 39370.1 * val;
            tw.setText(Double.toString(inch));
            tw = findViewById(R.id.textView8);// футы
            double feeet = 3280.84 * val;
            tw.setText(Double.toString(feeet));
            tw = findViewById(R.id.textView6);// мили
            double mile = val * 0.621371;
            tw.setText(Double.toString(mile));
        } else if (centimeters) {
            TextView tw = findViewById(R.id.textView3);// сантиметры
            tw.setText(Double.toString(val));
            tw = findViewById(R.id.textView5);// метры
            double meter = val * 0.01;
            tw.setText(Double.toString(meter));
            tw = findViewById(R.id.textView4); // километры
            double centi = val * 0.00001;
            tw.setText(Double.toString(centi));
            tw = findViewById(R.id.textView7);// дюймы
            double inch = 0.3937 * val;
            tw.setText(Double.toString(inch));
            tw = findViewById(R.id.textView8);// футы
            double feeet = 0.0328084 * val;
            tw.setText(Double.toString(feeet));
            tw = findViewById(R.id.textView6);// мили
            double mile = val * 0.000062137;
            tw.setText(Double.toString(mile));
        } else if (inches) {
            TextView tw = findViewById(R.id.textView7);// дюймы
            tw.setText(Double.toString(val));
            tw = findViewById(R.id.textView5);// метры
            double meter = val * 0.0254;
            tw.setText(Double.toString(meter));
            tw = findViewById(R.id.textView3); // сантиметры
            double centi = val * 2.54;
            tw.setText(Double.toString(centi));
            tw = findViewById(R.id.textView4);// километры
            double inch = 0.0000254 * val;
            tw.setText(Double.toString(inch));
            tw = findViewById(R.id.textView8);// футы
            double feeet = 0.0833 * val;
            tw.setText(Double.toString(feeet));
            tw = findViewById(R.id.textView6);// мили
            double mile = val * 1.5783e-5;
            tw.setText(Double.toString(mile));
        } else if (feet) {
            TextView tw = findViewById(R.id.textView8);// футы
            tw.setText(Double.toString(val));
            tw = findViewById(R.id.textView5);// метры
            double meter = val * 0.3048;
            tw.setText(Double.toString(meter));
            tw = findViewById(R.id.textView3); // сантиметры
            double centi = val * 30.48;
            tw.setText(Double.toString(centi));
            tw = findViewById(R.id.textView7);// дюймы
            double inch = 12 * val;
            tw.setText(Double.toString(inch));
            tw = findViewById(R.id.textView4);// километры
            double feeet = 0.0003048 * val;
            tw.setText(Double.toString(feeet));
            tw = findViewById(R.id.textView6);// мили
            double mile = val * 0.000189394;
            tw.setText(Double.toString(mile));
        } else if (miles) {
            TextView tw = findViewById(R.id.textView6);// мили
            tw.setText(Double.toString(val));
            tw = findViewById(R.id.textView5);// метры
            double meter = val * 1609.34;
            tw.setText(Double.toString(meter));
            tw = findViewById(R.id.textView3); // сантиметры
            double centi = val * 160934;
            tw.setText(Double.toString(centi));
            tw = findViewById(R.id.textView7);// дюймы
            double inch = 63360 * val;
            tw.setText(Double.toString(inch));
            tw = findViewById(R.id.textView8);// футы
            double feeet = 5280 * val;
            tw.setText(Double.toString(feeet));
            tw = findViewById(R.id.textView4);// километры
            double mile = val * 1.60934;
            tw.setText(Double.toString(mile));
        }
    }
}
