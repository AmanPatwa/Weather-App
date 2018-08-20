package patwa.aman.com.showweather;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

import data.CityPreference;
import data.JsonWeather;
import data.WeatherHttpClient;
import models.Weather;

public class MainActivity extends AppCompatActivity {

    TextView cityname,temp,minmax2,minmax3,minmax4,minmax5,desc,date,dtext;
    TextView day2,day3,day4,day5,temp2,temp3,temp4,temp5;


    Weather weather = new Weather();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        cityname = (TextView) findViewById(R.id.citytext);
        temp = (TextView) findViewById(R.id.temptext);
        minmax2 = (TextView) findViewById(R.id.temp1text);
        minmax3 = (TextView) findViewById(R.id.temp2text);
        minmax4 = (TextView) findViewById(R.id.temp3text);
        minmax5 = (TextView) findViewById(R.id.temp4text);
        desc = (TextView) findViewById(R.id.desctext);
        date = (TextView) findViewById(R.id.datetext);
        day2 = (TextView) findViewById(R.id.day2text);
        day3 = (TextView) findViewById(R.id.day3text);
        day4 = (TextView) findViewById(R.id.day4text);
        day5 = (TextView) findViewById(R.id.day5text);
        temp2 = (TextView) findViewById(R.id.daytemp2text);
        temp3 = (TextView) findViewById(R.id.daytemp3text);
        temp4 = (TextView) findViewById(R.id.daytemp4text);
        temp5 = (TextView) findViewById(R.id.daytemp5text);
        dtext = (TextView) findViewById(R.id.dtext);


        CityPreference cityPreference = new CityPreference(MainActivity.this);
        finalWeatherData("Mumbai");


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Loading weather", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });



}

    public void tension(final Weather weather){
        day2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Day2.class);
                intent.putExtra("Tempmax1",weather.timePass.getTempmax1());
                intent.putExtra("Tempmin1",weather.timePass.getTempmin1());
                intent.putExtra("Date1",weather.timePass.getDate1());
                intent.putExtra("Tempmax2",weather.timePass.getTempmax2());
                intent.putExtra("Tempmin2",weather.timePass.getTempmin2());
                intent.putExtra("Date2",weather.timePass.getDate2());
                intent.putExtra("Tempmax3",weather.timePass.getTempmax3());
                intent.putExtra("Tempmin3",weather.timePass.getTempmin3());
                intent.putExtra("Date3",weather.timePass.getDate3());
                intent.putExtra("Tempmax4",weather.timePass.getTempmax4());
                intent.putExtra("Tempmin4",weather.timePass.getTempmin4());
                intent.putExtra("Date4",weather.timePass.getDate4());
                startActivity(intent);
            }
        });


        day3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,Day_3.class);
                intent.putExtra("Tempmax5",weather.timePass.getTempmax5());
                intent.putExtra("Tempmin5",weather.timePass.getTempmin5());
                intent.putExtra("Date5",weather.timePass.getDate5());
                intent.putExtra("Tempmax6",weather.timePass.getTempmax6());
                intent.putExtra("Tempmin6",weather.timePass.getTempmin6());
                intent.putExtra("Date6",weather.timePass.getDate6());
                intent.putExtra("Tempmax7",weather.timePass.getTempmax7());
                intent.putExtra("Tempmin7",weather.timePass.getTempmin7());
                intent.putExtra("Date7",weather.timePass.getDate7());
                intent.putExtra("Tempmax8",weather.timePass.getTempmax8());
                intent.putExtra("Tempmin8",weather.timePass.getTempmin8());
                intent.putExtra("Date8",weather.timePass.getDate8());
                startActivity(intent);
            }
        });

        day4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,Day_3.class);
                intent.putExtra("Tempmax5",weather.timePass.getTempmax9());
                intent.putExtra("Tempmin5",weather.timePass.getTempmin9());
                intent.putExtra("Date5",weather.timePass.getDate9());
                intent.putExtra("Tempmax6",weather.timePass.getTempmax10());
                intent.putExtra("Tempmin6",weather.timePass.getTempmin10());
                intent.putExtra("Date6",weather.timePass.getDate10());
                intent.putExtra("Tempmax7",weather.timePass.getTempmax11());
                intent.putExtra("Tempmin7",weather.timePass.getTempmin11());
                intent.putExtra("Date7",weather.timePass.getDate11());
                intent.putExtra("Tempmax8",weather.timePass.getTempmax12());
                intent.putExtra("Tempmin8",weather.timePass.getTempmin12());
                intent.putExtra("Date8",weather.timePass.getDate12());
                startActivity(intent);
            }
        });


        day5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,Day_3.class);
                intent.putExtra("Tempmax5",weather.timePass.getTempmax13());
                intent.putExtra("Tempmin5",weather.timePass.getTempmin13());
                intent.putExtra("Date5",weather.timePass.getDate13());
                intent.putExtra("Tempmax6",weather.timePass.getTempmax14());
                intent.putExtra("Tempmin6",weather.timePass.getTempmin14());
                intent.putExtra("Date6",weather.timePass.getDate14());
                intent.putExtra("Tempmax7",weather.timePass.getTempmax15());
                intent.putExtra("Tempmin7",weather.timePass.getTempmin15());
                intent.putExtra("Date7",weather.timePass.getDate15());
                intent.putExtra("Tempmax8",weather.timePass.getTempmax16());
                intent.putExtra("Tempmin8",weather.timePass.getTempmin16());
                intent.putExtra("Date8",weather.timePass.getDate16());
                startActivity(intent);
            }
        });



    }

    public void finalWeatherData(String city) {
        WeatherTask weatherTask = new WeatherTask();
        weatherTask.execute(new String[]{city + "&units=metric"});

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    private class WeatherTask extends AsyncTask<String, Void, Weather> {

        JsonWeather jsonWeather=new JsonWeather();

        @Override
        protected Weather doInBackground(String... strings) {
            String data = ((new WeatherHttpClient()).getWeatherData(strings[0]));
            weather =jsonWeather.getweather(data);

            Log.v("Data:", weather.temperature.getTemp().toString());

            return weather;
        }

        @Override
        protected void onPostExecute(Weather weather) {


            cityname.setText(weather.place.getCity());
            temp.setText(weather.temperature.getTemp().toString());
            date.setText(weather.currentCondition.getDate().toString().substring(0,10));
            desc.setText(weather.temperature.getMintemp()+"-"+weather.temperature.getMaxtemp());
            minmax2.setText(weather.currentCondition.getMintemp1()+"-"+weather.currentCondition.getMaxtemp1());
            minmax3.setText(weather.currentCondition.getMintemp2()+"-"+weather.currentCondition.getMaxtemp2());
            minmax4.setText(weather.currentCondition.getMintemp3()+"-"+weather.currentCondition.getMaxtemp3());
            minmax5.setText(weather.currentCondition.getMintemp4()+"-"+weather.currentCondition.getMaxtemp4());
            dtext.setText(weather.place.getDesc());


            day2.setText(weather.day.getDate1().substring(0,10));
            day3.setText(weather.day.getDate2().substring(0,10));
            day4.setText(weather.day.getDate3().substring(0,10));
            day5.setText(weather.day.getDate4().substring(0,10));
            temp2.setText(weather.day.getMintemp1()+"-"+weather.day.getMaxtemp1());
            temp3.setText(weather.day.getMintemp2()+"-"+weather.day.getMaxtemp2());
            temp4.setText(weather.day.getMintemp3()+"-"+weather.day.getMaxtemp3());
            temp5.setText(weather.day.getMintemp4()+"-"+weather.day.getMaxtemp4());

            tension(weather);

            super.onPostExecute(weather);
        }
    }


        private void doInput() {
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle("Change City");

            final EditText cityInput = new EditText(MainActivity.this);
            cityInput.setInputType(InputType.TYPE_CLASS_TEXT);
            cityInput.setHint("Eg:Delhi");
            builder.setView(cityInput);
            builder.setCancelable(true)
                    .setPositiveButton("Submit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            CityPreference cityPrefer = new CityPreference(MainActivity.this);
                            cityPrefer.setCity(cityInput.getText().toString());

                            String newcity = cityPrefer.getCity();

                            finalWeatherData(newcity);
                        }
                    });
            builder.show();
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            int id = item.getItemId();

            //noinspection SimplifiableIfStatement
            if (id == R.id.change_cityID) {
                doInput();
            }

            return super.onOptionsItemSelected(item);
        }

}
