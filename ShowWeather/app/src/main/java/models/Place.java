package models;

/**
 * Created by dell on 16-08-2018.
 */

public class Place {
    private float lon;
    private float lat;
    private long sunrise;
    private long sunset;
    private long lastupdate;
    private String desc;
    private String city;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


}
