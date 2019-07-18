
package com.example.football.DataApi.Matches;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Coach_ {

    @SerializedName("lineup_player")
    @Expose
    private String lineupPlayer;
    @SerializedName("lineup_number")
    @Expose
    private String lineupNumber;
    @SerializedName("lineup_position")
    @Expose
    private String lineupPosition;

    public String getLineupPlayer() {
        return lineupPlayer;
    }

    public void setLineupPlayer(String lineupPlayer) {
        this.lineupPlayer = lineupPlayer;
    }

    public String getLineupNumber() {
        return lineupNumber;
    }

    public void setLineupNumber(String lineupNumber) {
        this.lineupNumber = lineupNumber;
    }

    public String getLineupPosition() {
        return lineupPosition;
    }

    public void setLineupPosition(String lineupPosition) {
        this.lineupPosition = lineupPosition;
    }

}
