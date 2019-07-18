
package com.example.football.DataApi.Matches;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Statistic {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("home")
    @Expose
    private String home;
    @SerializedName("away")
    @Expose
    private String away;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getAway() {
        return away;
    }

    public void setAway(String away) {
        this.away = away;
    }

}
