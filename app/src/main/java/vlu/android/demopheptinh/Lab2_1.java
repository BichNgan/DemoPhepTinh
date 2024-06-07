package vlu.android.demopheptinh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class Lab2_1 extends AppCompatActivity {
    TextView tvChao;
    ListView lvTraiCay;
    ArrayList<String> lvData = new ArrayList<>();
    ArrayAdapter<String> arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab21);
        //---------------------------------
        addControl();
        //---------------------
        Intent intent = getIntent();
        String ten=intent.getStringExtra("Ten");
        tvChao.setText("Xin chao " + ten);
        //----------------------------------
        //Tạo dữ liệu và đưa vào ListView
        lvData.add("Xoài");
        Collections.addAll(lvData, new String[]{"Mận", "Dưa", "Cam", "Táo"});
        arrayAdapter = new ArrayAdapter<>(Lab2_1.this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,lvData);
        lvTraiCay.setAdapter(arrayAdapter);

    }
    void addControl()
    {
        tvChao=(TextView) findViewById(R.id.tvChao);
        lvTraiCay = (ListView) findViewById(R.id.lvTraiCay);
    }
    void addEvent()
    {

    }
}