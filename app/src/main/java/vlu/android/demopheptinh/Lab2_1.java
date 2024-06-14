package vlu.android.demopheptinh;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class Lab2_1 extends AppCompatActivity {
    TextView tvChao;
    EditText edtTC;
    Button btnThem;


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
        //----------------------------
        addEvent();
    }
    void addControl()
    {
        tvChao=(TextView) findViewById(R.id.tvChao);
        lvTraiCay = (ListView) findViewById(R.id.lvTraiCay);
         edtTC = (EditText)findViewById(R.id.edtTC);
         btnThem = (Button) findViewById(R.id.btnThem);
    }
    void addEvent()
    {
        lvTraiCay.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                tvChao.setText("Chọn item thứ " + position + " có giâ trị là: " + lvData.get(position));
            }
        });

        //Thêm 1 item vao listview
        btnThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tc = edtTC.getText().toString();
                lvData.add(tc);
                arrayAdapter.notifyDataSetChanged();
            }
        });

        //XÓa 1 item trong listView
        lvTraiCay.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                AlertDialog alertDialog = createAlertDialog(position,arrayAdapter);
                alertDialog.show();
                return false;
            }
        });

    }

    //Hiển thị Dialog xác nhận trước khi xóa item
    private AlertDialog createAlertDialog (int position, ArrayAdapter<String> adapter)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(Lab2_1.this);
        builder.setTitle("Delete an Intem");
        builder.setMessage("Are you sure to want to delete this item?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                lvData.remove(position);
                adapter.notifyDataSetChanged();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        return builder.create();
    }
}