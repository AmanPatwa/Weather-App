package patwa.aman.com.showweather;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Day_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_3);


        Context context;
        ListView lv;

        Intent i=getIntent();
        Float temp_max5=i.getFloatExtra("Tempmax5",0);
        Float temp_min5=i.getFloatExtra("Tempmin5",0);
        String date5=i.getStringExtra("Date5");
        Float temp_max6=i.getFloatExtra("Tempmax6",1);
        Float temp_min6=i.getFloatExtra("Tempmin6",1);
        String date6=i.getStringExtra("Date6");
        Float temp_max7=i.getFloatExtra("Tempmax7",2);
        Float temp_min7=i.getFloatExtra("Tempmin7",2);
        String date7=i.getStringExtra("Date7");
        Float temp_max8=i.getFloatExtra("Tempmax8",3);
        Float temp_min8=i.getFloatExtra("Tempmin8",3);
        String date8=i.getStringExtra("Date8");

        Float[] tempmin={
                temp_min5,temp_min6,temp_min7,temp_min8
        };
        Float[] tempmax={
                temp_max5,temp_max6,temp_max7,temp_max8
        };
        String[] date={
                date5,date6,date7,date8
        };

        MyListAdaptor adaptor=new MyListAdaptor(this,tempmax,tempmin,date);
        lv=(ListView)findViewById(R.id.lv2);
        lv.setAdapter(adaptor);
    }
    }

