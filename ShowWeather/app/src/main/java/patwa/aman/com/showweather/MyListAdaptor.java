package patwa.aman.com.showweather;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import models.Weather;

/**
 * Created by dell on 18-08-2018.
 */

public class MyListAdaptor extends ArrayAdapter<String> {

    Weather weather=new Weather();

    private final Activity context;
    private final Float[] max;
    private final Float[] min;
    private final String[] date;



    MyListAdaptor(Activity context, Float[] max, Float[] min, String[] date) {
        super(context, R.layout.activity_day2,date);
        this.context = context;
        this.max = max;
        this.min = min;
        this.date = date;
    }


        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View rowview= LayoutInflater.from(context).inflate(R.layout.show_data,null,true);
            TextView minmax=(TextView)rowview.findViewById(R.id.tv2);
            TextView date=(TextView)rowview.findViewById(R.id.tv1);

            minmax.setText(this.min[position].toString()+"-"+max[position].toString());
            date.setText(this.date[position]);

        return rowview;
        }
}
