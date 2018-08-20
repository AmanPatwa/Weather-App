package data;

import android.app.Activity;
import android.content.SharedPreferences;

/**
 * Created by dell on 16-08-2018.
 */

public class CityPreference {

    SharedPreferences preferences;

    public CityPreference(Activity activity){
        preferences=activity.getPreferences(Activity.MODE_PRIVATE);
    }

    public String getCity(){
        return preferences.getString("city","Mumbai");

    }
    public void setCity(String city){
        preferences.edit().putString("city",city).commit();
    }
}
