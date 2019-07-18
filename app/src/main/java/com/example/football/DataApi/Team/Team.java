
package com.example.football.DataApi.Team;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Team {

    @SerializedName("team_key")
    @Expose
    private String teamKey;
    @SerializedName("team_name")
    @Expose
    private String teamName;
    @SerializedName("team_badge")
    @Expose
    private String teamBadge;
    @SerializedName("players")
    @Expose
    private List<Object> players = null;
    @SerializedName("coaches")
    @Expose
    private List<Object> coaches = null;

    public String getTeamKey() {
        return teamKey;
    }

    public void setTeamKey(String teamKey) {
        this.teamKey = teamKey;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamBadge() {
        return teamBadge;
    }

    public void setTeamBadge(String teamBadge) {
        this.teamBadge = teamBadge;
    }

    public List<Object> getPlayers() {
        return players;
    }

    public void setPlayers(List<Object> players) {
        this.players = players;
    }

    public List<Object> getCoaches() {
        return coaches;
    }

    public void setCoaches(List<Object> coaches) {
        this.coaches = coaches;
    }

}
