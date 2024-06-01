package vlu.android.demopheptinh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtSoA, edtSoB;
    Button btnTinh;
    TextView tvKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //--------------------------------------
        //Gắn id cho từng control
        addControls();
        //Xử lý các sự kiện
        addEvents();
    }
    //--------------------
    //Hàm gắn id cho từng control
    void addControls()
    {
        edtSoA = (EditText) findViewById(R.id.edtSoA);
        edtSoB = (EditText) findViewById(R.id.edtSoB);
        btnTinh=(Button) findViewById(R.id.btnTinh);
        tvKetQua=(TextView) findViewById(R.id.tvKetQua);
    }
    //Hàm xử lý các sự kiện
    void addEvents()
    {
        btnTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(edtSoA.getText().toString());
                int b = Integer.parseInt(edtSoB.getText().toString());
                int c=a+b;
                tvKetQua.setText(String.valueOf(c));
            }
        });
    }
}