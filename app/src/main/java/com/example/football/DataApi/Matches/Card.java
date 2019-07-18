
package com.example.football.DataApi.Matches;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Card {

    @SerializedName("time")
    @Expose
    private String time;
    @SerializedName("home_fault")
    @Expose
    private String homeFault;
    @SerializedName("card")
    @Expose
    private String card;
    @SerializedName("away_fault")
    @Expose
    private String awayFault;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getHomeFault() {
        return homeFault;
    }

    public void setHomeFault(String homeFault) {
        this.homeFault = homeFault;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getAwayFault() {
        return awayFault;
    }

    public void setAwayFault(String awayFault) {
        this.awayFault = awayFault;
    }

}
