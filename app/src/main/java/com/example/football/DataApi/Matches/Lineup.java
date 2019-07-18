
package com.example.football.DataApi.Matches;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Lineup {

    @SerializedName("home")
    @Expose
    private Home_ home;
    @SerializedName("away")
    @Expose
    private Away_ away;

    public Home_ getHome() {
        return home;
    }

    public void setHome(Home_ home) {
        this.home = home;
    }

    public Away_ getAway() {
        return away;
    }

    public void setAway(Away_ away) {
        this.away = away;
    }

}
