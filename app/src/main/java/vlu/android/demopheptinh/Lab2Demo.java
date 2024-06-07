package vlu.android.demopheptinh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Lab2Demo extends AppCompatActivity {

    EditText edtUs, edtPw;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab2_demo);
        Log.d("Thông bao cua Ngan","Hàm onCreate được gọi.");
        //------------------------------------------
        addControl();
        //-------------------------
        SharedPreferences sharedPreferences=getPreferences(MODE_PRIVATE);
        edtUs.setText(sharedPreferences.getString("ten user",null));
        edtPw.setText(sharedPreferences.getString("mat khau", null));
        //-------------------------------
        addEvent();
    }
    void addControl()
    {
        edtUs = (EditText) findViewById(R.id.edtName);
        edtPw = (EditText) findViewById(R.id.edtPw);
        btnLogin=(Button) findViewById(R.id.btnLogin);

    }
    void addEvent()
    {
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Thông báo ngắn
                Toast.makeText(getApplicationContext(),"Đăng nhập thành công!",Toast.LENGTH_LONG).show();

               // Intent intent = new Intent(getApplicationContext(),Lab2_1.class);
                Intent intent = new Intent(Lab2Demo.this,Lab2_1.class);
                intent.putExtra("Ten",edtUs.getText().toString());

                startActivity(intent);


            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        //-------------------
        Log.d("Thông bao cua Ngan","Hàm onStart được gọi.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Thông bao cua Ngan","Hàm onStop được gọi.");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Thông bao cua Ngan","Hàm onDestroy được gọi.");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Thông bao cua Ngan","Hàm onPause được gọi.");
        //--------------------
        SharedPreferences sharedPreferences = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        String username = edtUs.getText().toString();
        String password = edtPw.getText().toString();

        editor.putString("ten user",username);
        editor.putString("mat khau",password);
        editor.commit();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Thông bao cua Ngan","Hàm onResume được gọi.");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Thông bao cua Ngan","Hàm onRestart được gọi.");

    }
}