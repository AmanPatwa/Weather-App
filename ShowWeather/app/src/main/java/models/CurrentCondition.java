package models;

/**
 * Created by dell on 16-08-2018.
 */

public class CurrentCondition {
    private String description;
    private String date;
    private float mintemp1;
    private float mintemp2;
    private float mintemp3;
    private float mintemp4;
    private float maxtemp1;
    private float maxtemp2;
    private float maxtemp3;
    private float maxtemp4;


    public float getMintemp1() {
        return mintemp1;
    }

    public void setMintemp1(float mintemp1) {
        this.mintemp1 = mintemp1;
    }

    public float getMintemp2() {
        return mintemp2;
    }

    public void setMintemp2(float mintemp2) {
        this.mintemp2 = mintemp2;
    }

    public float getMintemp3() {
        return mintemp3;
    }

    public void setMintemp3(float mintemp3) {
        this.mintemp3 = mintemp3;
    }

    public float getMintemp4() {
        return mintemp4;
    }

    public void setMintemp4(float mintemp4) {
        this.mintemp4 = mintemp4;
    }

    public float getMaxtemp1() {
        return maxtemp1;
    }

    public void setMaxtemp1(float maxtemp1) {
        this.maxtemp1 = maxtemp1;
    }

    public float getMaxtemp2() {
        return maxtemp2;
    }

    public void setMaxtemp2(float maxtemp2) {
        this.maxtemp2 = maxtemp2;
    }

    public float getMaxtemp3() {
        return maxtemp3;
    }

    public void setMaxtemp3(float maxtemp3) {
        this.maxtemp3 = maxtemp3;
    }

    public float getMaxtemp4() {
        return maxtemp4;
    }

    public void setMaxtemp4(float maxtemp4) {
        this.maxtemp4 = maxtemp4;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
