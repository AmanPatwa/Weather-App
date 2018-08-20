package patwa.aman.com.showweather;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Day2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day2);

        Context context;
        ListView lv;

        Intent i=getIntent();
        Float temp_max1=i.getFloatExtra("Tempmax1",0);
        Float temp_min1=i.getFloatExtra("Tempmin1",0);
        String date1=i.getStringExtra("Date1");
        Float temp_max2=i.getFloatExtra("Tempmax2",1);
        Float temp_min2=i.getFloatExtra("Tempmin2",1);
        String date2=i.getStringExtra("Date2");
        Float temp_max3=i.getFloatExtra("Tempmax3",2);
        Float temp_min3=i.getFloatExtra("Tempmin3",2);
        String date3=i.getStringExtra("Date3");
        Float temp_max4=i.getFloatExtra("Tempmax4",3);
        Float temp_min4=i.getFloatExtra("Tempmin4",3);
        String date4=i.getStringExtra("Date4");

        Float[] tempmin={
                temp_min1,temp_min2,temp_min3,temp_min4
        };
        Float[] tempmax={
                temp_max1,temp_max2,temp_max3,temp_max4
        };
        String[] date={
                date1,date2,date3,date4
        };

    MyListAdaptor adaptor=new MyListAdaptor(this,tempmax,tempmin,date);
    lv=(ListView)findViewById(R.id.lv1);
    lv.setAdapter(adaptor);
    }
}
