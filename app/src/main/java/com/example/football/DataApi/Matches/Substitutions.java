
package com.example.football.DataApi.Matches;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Substitutions {

    @SerializedName("home")
    @Expose
    private List<Home> home = null;
    @SerializedName("away")
    @Expose
    private List<Away> away = null;

    public List<Home> getHome() {
        return home;
    }

    public void setHome(List<Home> home) {
        this.home = home;
    }

    public List<Away> getAway() {
        return away;
    }

    public void setAway(List<Away> away) {
        this.away = away;
    }

}
