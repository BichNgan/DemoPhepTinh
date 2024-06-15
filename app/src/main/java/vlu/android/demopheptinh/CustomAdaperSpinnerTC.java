package vlu.android.demopheptinh;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdaperSpinnerTC extends BaseAdapter {
    LayoutInflater inflater;
    int layoutItem;
    ArrayList<TraiCay> arrayListTC = new ArrayList<>();

    public CustomAdaperSpinnerTC(LayoutInflater inflater, int layoutItem, ArrayList<TraiCay> arrayListTC) {
        this.inflater = inflater;
        this.layoutItem = layoutItem;
        this.arrayListTC = arrayListTC;
    }

    @Override
    public int getCount() {
        return arrayListTC.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayListTC.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TraiCay tc = arrayListTC.get(position);
        if(convertView==null)
            inflater.inflate(layoutItem,null,true);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.imgTC);
        imageView.setImageResource(tc.getIdAnh());

        TextView tenTC = (TextView) convertView.findViewById(R.id.tvTenTC);
        tenTC.setText(tc.getTenTC());

        TextView giaTC = (TextView) convertView.findViewById(R.id.tvGiaTC);
        giaTC.setText(String.valueOf(tc.getGiaTC()));
        return convertView;
    }
}
