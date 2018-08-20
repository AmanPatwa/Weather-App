package util;

import org.json.JSONObject;

/**
 * Created by dell on 16-08-2018.
 */

public class Utils {
    public static final String main_url="https://api.openweathermap.org/data/2.5/forecast?q=";
    public static final String api_key="&appid=8194bed7c105c464e25413fa7948d2d6";
    //public static final String icon_url="http://api.openweathermap.org/img/w/20d.png";

    public static JSONObject getObject(String tagname, JSONObject jsonObject)throws Exception{
        JSONObject jsonObject1=jsonObject.getJSONObject(tagname);
        return jsonObject1;
    }

    public static String getString(String tagname,JSONObject jsonObject) throws Exception{
        return jsonObject.getString(tagname);
    }
    public static float getFloat(String tagname,JSONObject jsonObject) throws Exception{
        return (float) jsonObject.getDouble(tagname);
    }
    public static Double getDouble(String tagname, JSONObject jsonObject) throws Exception{
        return (Double) jsonObject.getDouble(tagname);
    }
    public static int getInt(String tagname,JSONObject jsonObject) throws Exception{
        return  jsonObject.getInt(tagname);
    }

}
