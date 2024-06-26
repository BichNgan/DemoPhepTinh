package vlu.android.demopheptinh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    Button btn1, btnLab2, btnCustomLV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //-----------------------
        addControl();
        addEvent();
    }
    void addControl()
    {
        btn1=(Button) findViewById(R.id.btn1);
        btnLab2=(Button) findViewById(R.id.btnLab2);
        btnCustomLV = (Button) findViewById(R.id.btnCustomLVFruit);

    }
    void addEvent()
    {
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,Lab2_1.class);
                startActivity(intent);
            }
        });
        btnLab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Lab2Demo.class);
                startActivity(intent);
            }
        });
        btnCustomLV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),CustomLVFruitActivity.class);
                startActivity(intent);
            }
        });

    }
}