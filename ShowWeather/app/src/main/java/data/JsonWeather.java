package data;

import android.content.Context;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import models.Weather;
import patwa.aman.com.showweather.MainActivity;
import util.Utils;

/**
 * Created by dell on 16-08-2018.
 */

public class JsonWeather {
    public static Weather getweather(String data) {
        Weather weather = new Weather();

        try {
            Context context;
            JSONObject jsonObject = new JSONObject(data);

            JSONObject cityobj=Utils.getObject("city",jsonObject);
            weather.place.setCity(Utils.getString("name",cityobj));


            JSONArray listArray = jsonObject.getJSONArray("list");

                JSONObject listobj = listArray.getJSONObject(0);
                JSONArray newarray=listobj.getJSONArray("weather");
                JSONObject weatherobj=newarray.getJSONObject(0);
                weather.place.setDesc(Utils.getString("description",weatherobj));
                JSONObject mainobj = Utils.getObject("main", listobj);
                weather.temperature.setTemp(Utils.getDouble("temp", mainobj));
                weather.temperature.setMaxtemp(Utils.getFloat("temp_max", mainobj));
                weather.temperature.setMintemp(Utils.getFloat("temp_min", mainobj));
                weather.currentCondition.setDate(Utils.getString("dt_txt",listobj));

                JSONObject listobj1=listArray.getJSONObject(1);
                JSONObject mainobj1=Utils.getObject("main",listobj1);
                weather.currentCondition.setMaxtemp1(Utils.getFloat("temp_max",mainobj1));
                weather.currentCondition.setMintemp1(Utils.getFloat("temp_min",mainobj1));

            JSONObject listobj2=listArray.getJSONObject(3);
            JSONObject mainobj2=Utils.getObject("main",listobj2);
            weather.currentCondition.setMaxtemp2(Utils.getFloat("temp_max",mainobj2));
            weather.currentCondition.setMintemp2(Utils.getFloat("temp_min",mainobj2));

            JSONObject listobj3=listArray.getJSONObject(5);
            JSONObject mainobj3=Utils.getObject("main",listobj3);
            weather.currentCondition.setMaxtemp3(Utils.getFloat("temp_max",mainobj3));
            weather.currentCondition.setMintemp3(Utils.getFloat("temp_min",mainobj3));

            JSONObject listobj4=listArray.getJSONObject(7);
            JSONObject mainobj4=Utils.getObject("main",listobj4);
            weather.currentCondition.setMaxtemp4(Utils.getFloat("temp_max",mainobj4));
            weather.currentCondition.setMintemp4(Utils.getFloat("temp_min",mainobj4));

            JSONObject listobj5=listArray.getJSONObject(8);
            JSONObject mainobj5=Utils.getObject("main",listobj5);
            weather.day.setMintemp1(Utils.getFloat("temp_min",mainobj5));
            weather.day.setMaxtemp1(Utils.getFloat("temp_max",mainobj5));
            weather.day.setDate1(Utils.getString("dt_txt",listobj5));

            JSONObject listobja=listArray.getJSONObject(9);
            JSONObject mainobja=Utils.getObject("main",listobja);
            weather.timePass.setTempmax1(Utils.getFloat("temp_max",mainobja));
            weather.timePass.setTempmin1(Utils.getFloat("temp_min",mainobja));
            weather.timePass.setDate1(Utils.getString("dt_txt",listobja));

            JSONObject listobjb=listArray.getJSONObject(11);
            JSONObject mainobjb=Utils.getObject("main",listobjb);
            weather.timePass.setTempmax2(Utils.getFloat("temp_max",mainobjb));
            weather.timePass.setTempmin2(Utils.getFloat("temp_min",mainobjb));
            weather.timePass.setDate2(Utils.getString("dt_txt",listobjb));

            JSONObject listobjc=listArray.getJSONObject(13);
            JSONObject mainobjc=Utils.getObject("main",listobjc);
            weather.timePass.setTempmax3(Utils.getFloat("temp_max",mainobjc));
            weather.timePass.setTempmin3(Utils.getFloat("temp_min",mainobjc));
            weather.timePass.setDate3(Utils.getString("dt_txt",listobjc));

            JSONObject listobjd=listArray.getJSONObject(15);
            JSONObject mainobjd=Utils.getObject("main",listobjd);
            weather.timePass.setTempmax4(Utils.getFloat("temp_max",mainobjd));
            weather.timePass.setTempmin4(Utils.getFloat("temp_min",mainobjd));
            weather.timePass.setDate4(Utils.getString("dt_txt",listobjd));

            JSONObject listobj6=listArray.getJSONObject(16);
            JSONObject mainobj6=Utils.getObject("main",listobj6);
            weather.day.setMintemp2(Utils.getFloat("temp_min",mainobj6));
            weather.day.setMaxtemp2(Utils.getFloat("temp_max",mainobj6));
            weather.day.setDate2(Utils.getString("dt_txt",listobj6));

            JSONObject listobje=listArray.getJSONObject(17);
            JSONObject mainobje=Utils.getObject("main",listobje);
            weather.timePass.setTempmax5(Utils.getFloat("temp_max",mainobje));
            weather.timePass.setTempmin5(Utils.getFloat("temp_min",mainobje));
            weather.timePass.setDate5(Utils.getString("dt_txt",listobje));

            JSONObject listobjf=listArray.getJSONObject(19);
            JSONObject mainobjf=Utils.getObject("main",listobjf);
            weather.timePass.setTempmax6(Utils.getFloat("temp_max",mainobjf));
            weather.timePass.setTempmin6(Utils.getFloat("temp_min",mainobjf));
            weather.timePass.setDate6(Utils.getString("dt_txt",listobjf));

            JSONObject listobjg=listArray.getJSONObject(21);
            JSONObject mainobjg=Utils.getObject("main",listobjg);
            weather.timePass.setTempmax7(Utils.getFloat("temp_max",mainobjg));
            weather.timePass.setTempmin7(Utils.getFloat("temp_min",mainobjg));
            weather.timePass.setDate7(Utils.getString("dt_txt",listobjg));

            JSONObject listobjh=listArray.getJSONObject(23);
            JSONObject mainobjh=Utils.getObject("main",listobjh);
            weather.timePass.setTempmax8(Utils.getFloat("temp_max",mainobjh));
            weather.timePass.setTempmin8(Utils.getFloat("temp_min",mainobjh));
            weather.timePass.setDate8(Utils.getString("dt_txt",listobjh));

            JSONObject listobj7=listArray.getJSONObject(24);
            JSONObject mainobj7=Utils.getObject("main",listobj7);
            weather.day.setMintemp3(Utils.getFloat("temp_min",mainobj7));
            weather.day.setMaxtemp3(Utils.getFloat("temp_max",mainobj7));
            weather.day.setDate3(Utils.getString("dt_txt",listobj7));

            JSONObject listobji=listArray.getJSONObject(25);
            JSONObject mainobji=Utils.getObject("main",listobji);
            weather.timePass.setTempmax9(Utils.getFloat("temp_max",mainobji));
            weather.timePass.setTempmin9(Utils.getFloat("temp_min",mainobji));
            weather.timePass.setDate9(Utils.getString("dt_txt",listobji));

            JSONObject listobjj=listArray.getJSONObject(27);
            JSONObject mainobjj=Utils.getObject("main",listobjj);
            weather.timePass.setTempmax10(Utils.getFloat("temp_max",mainobjj));
            weather.timePass.setTempmin10(Utils.getFloat("temp_min",mainobjj));
            weather.timePass.setDate10(Utils.getString("dt_txt",listobjj));

            JSONObject listobjk=listArray.getJSONObject(29);
            JSONObject mainobjk=Utils.getObject("main",listobjk);
            weather.timePass.setTempmax11(Utils.getFloat("temp_max",mainobjk));
            weather.timePass.setTempmin11(Utils.getFloat("temp_min",mainobjk));
            weather.timePass.setDate11(Utils.getString("dt_txt",listobjk));

            JSONObject listobjl=listArray.getJSONObject(31);
            JSONObject mainobjl=Utils.getObject("main",listobjk);
            weather.timePass.setTempmax12(Utils.getFloat("temp_max",mainobjl));
            weather.timePass.setTempmin12(Utils.getFloat("temp_min",mainobjl));
            weather.timePass.setDate12(Utils.getString("dt_txt",listobjl));

            JSONObject listobj8=listArray.getJSONObject(32);
            JSONObject mainobj8=Utils.getObject("main",listobj8);
            weather.day.setMintemp4(Utils.getFloat("temp_min",mainobj8));
            weather.day.setMaxtemp4(Utils.getFloat("temp_max",mainobj8));
            weather.day.setDate4(Utils.getString("dt_txt",listobj8));

            JSONObject listobjm=listArray.getJSONObject(33);
            JSONObject mainobjm=Utils.getObject("main",listobjm);
            weather.timePass.setTempmax13(Utils.getFloat("temp_max",mainobjm));
            weather.timePass.setTempmin13(Utils.getFloat("temp_min",mainobjm));
            weather.timePass.setDate13(Utils.getString("dt_txt",listobjm));

            JSONObject listobjn=listArray.getJSONObject(34);
            JSONObject mainobjn=Utils.getObject("main",listobjn);
            weather.timePass.setTempmax14(Utils.getFloat("temp_max",mainobjn));
            weather.timePass.setTempmin14(Utils.getFloat("temp_min",mainobjn));
            weather.timePass.setDate14(Utils.getString("dt_txt",listobjn));

            JSONObject listobjo=listArray.getJSONObject(35);
            JSONObject mainobjo=Utils.getObject("main",listobjo);
            weather.timePass.setTempmax15(Utils.getFloat("temp_max",mainobjo));
            weather.timePass.setTempmin15(Utils.getFloat("temp_min",mainobjo));
            weather.timePass.setDate15(Utils.getString("dt_txt",listobjo));

            JSONObject listobjp=listArray.getJSONObject(36);
            JSONObject mainobjp=Utils.getObject("main",listobjp);
            weather.timePass.setTempmax16(Utils.getFloat("temp_max",mainobjp));
            weather.timePass.setTempmin16(Utils.getFloat("temp_min",mainobjp));
            weather.timePass.setDate16(Utils.getString("dt_txt",listobjp));


            return weather;


        } catch (JSONException e) {
            e.printStackTrace();


        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
