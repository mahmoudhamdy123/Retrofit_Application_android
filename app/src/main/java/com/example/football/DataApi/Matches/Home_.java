
package com.example.football.DataApi.Matches;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Home_ {

    @SerializedName("starting_lineups")
    @Expose
    private List<StartingLineup> startingLineups = null;
    @SerializedName("substitutes")
    @Expose
    private List<Substitute> substitutes = null;
    @SerializedName("coach")
    @Expose
    private List<Coach> coach = null;
    @SerializedName("missing_players")
    @Expose
    private List<Object> missingPlayers = null;

    public List<StartingLineup> getStartingLineups() {
        return startingLineups;
    }

    public void setStartingLineups(List<StartingLineup> startingLineups) {
        this.startingLineups = startingLineups;
    }

    public List<Substitute> getSubstitutes() {
        return substitutes;
    }

    public void setSubstitutes(List<Substitute> substitutes) {
        this.substitutes = substitutes;
    }

    public List<Coach> getCoach() {
        return coach;
    }

    public void setCoach(List<Coach> coach) {
        this.coach = coach;
    }

    public List<Object> getMissingPlayers() {
        return missingPlayers;
    }

    public void setMissingPlayers(List<Object> missingPlayers) {
        this.missingPlayers = missingPlayers;
    }

}
