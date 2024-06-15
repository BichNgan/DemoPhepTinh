package vlu.android.demopheptinh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Collections;

public class Demo2Spinner extends AppCompatActivity {

    Spinner spinner1, spinner2;
    //-------spinner thông thường
    ArrayList<String>dataSpinnerCty = new ArrayList<>();
    ArrayAdapter<String>adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo2_spinner);
        //----------------------------
        spinner1=(Spinner) findViewById(R.id.spCty);
        spinner2 = (Spinner) findViewById(R.id.spTC);
        //---------------------------------------------
        //Tạo dữ liệu cho spinner
        Collections.addAll(dataSpinnerCty, new String[]{"FPT", "VNG", "MTA", "IBM"});
        adapter=new ArrayAdapter<>(Demo2Spinner.this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,dataSpinnerCty);
        spinner1.setAdapter(adapter);

        //-----------------------------


    }
}