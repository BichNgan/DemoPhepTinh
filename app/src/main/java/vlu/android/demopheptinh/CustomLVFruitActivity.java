package vlu.android.demopheptinh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomLVFruitActivity extends AppCompatActivity {

    TextView tvKq;
    //-----------Data--------------
    int []arrayIdAnh = new int[]{R.drawable.apple,R.drawable.banana,
            R.drawable.litchi,R.drawable.mango,R.drawable.pineapple};

    String []arrayTen = new String[]{"Táo","Chuối","Dâu","Xoài","Thơm"};
    int []arrayGia = new int[]{100,20,150,60,30};
    //------------------Các biến cho ListView------------
    ListView lvTraiCay;
    CustomAdapterFruit customAdapterFruit;
    ArrayList<TraiCay> arrayListTraiCay=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_lvfruit);
        //-------------------------------------
        addControl();
        //Đưa dữ liệu vào arrayTraiCay của listView
        createDataForListView(arrayIdAnh,arrayTen,arrayGia);
        customAdapterFruit = new CustomAdapterFruit(getApplicationContext(),
                R.layout.layout_item_custom_listview_fruit,arrayListTraiCay);
        lvTraiCay.setAdapter(customAdapterFruit);

    }
    void createDataForListView(int []arrayIdAnh,String []arrayTen,int []arrayGia)
    {
        for(int i=0;i<arrayGia.length;i++)
        {
            TraiCay tc = new TraiCay();
            tc.setIdAnh(arrayIdAnh[i]);
            tc.setTenTC(arrayTen[i]);
            tc.setGiaTC(arrayGia[i]);

            arrayListTraiCay.add(tc);
        }

    }
    void addControl()
    {
        tvKq = (TextView) findViewById(R.id.tvChonTC);
        lvTraiCay = (ListView) findViewById(R.id.lvTC);

    }
    void addEvent()
    {

    }
}