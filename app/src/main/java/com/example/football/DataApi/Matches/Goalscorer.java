
package com.example.football.DataApi.Matches;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Goalscorer {

    @SerializedName("time")
    @Expose
    private String time;
    @SerializedName("home_scorer")
    @Expose
    private String homeScorer;
    @SerializedName("score")
    @Expose
    private String score;
    @SerializedName("away_scorer")
    @Expose
    private String awayScorer;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getHomeScorer() {
        return homeScorer;
    }

    public void setHomeScorer(String homeScorer) {
        this.homeScorer = homeScorer;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getAwayScorer() {
        return awayScorer;
    }

    public void setAwayScorer(String awayScorer) {
        this.awayScorer = awayScorer;
    }

}
