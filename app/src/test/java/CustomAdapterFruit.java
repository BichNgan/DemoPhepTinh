import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

import vlu.android.demopheptinh.R;

public class CustomAdapterFruit extends ArrayAdapter {

    Context context;
    int layoutItem;
    ArrayList<TraiCay> arrayTraiCay = new ArrayList<>();

    public CustomAdapterFruit(@NonNull Context context, int layoutItem, @NonNull ArrayList<TraiCay> arrayTraiCay) {
        super(context, layoutItem, arrayTraiCay);

        this.context=context;
        this.layoutItem=layoutItem;
        this.arrayTraiCay=arrayTraiCay;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        TraiCay traiCay = arrayTraiCay.get(position);
        if(convertView==null)
        {
            convertView= LayoutInflater.from(context).inflate(layoutItem,null);
        }
        ImageView imageView = (ImageView) convertView.findViewById(R.id.imgTC);
        imageView.setImageResource(traiCay.getIdAnh());

        TextView tenTC = (TextView) convertView.findViewById(R.id.tvTenTC);
        tenTC.setText(traiCay.getTenTC());

        TextView giaTC=(TextView) convertView.findViewById(R.id.tvGiaTC);
        giaTC.setText(traiCay.getGiaTC());

        return convertView;
    }
}
