package vlu.android.demopheptinh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class Lab2Demo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab2_demo);

        Log.d("Thông bao cua Ngan","Hàm onCreate được gọi.");
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