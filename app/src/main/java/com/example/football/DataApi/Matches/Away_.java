
package com.example.football.DataApi.Matches;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Away_ {

    @SerializedName("starting_lineups")
    @Expose
    private List<StartingLineup_> startingLineups = null;
    @SerializedName("substitutes")
    @Expose
    private List<Substitute_> substitutes = null;
    @SerializedName("coach")
    @Expose
    private List<Coach_> coach = null;
    @SerializedName("missing_players")
    @Expose
    private List<Object> missingPlayers = null;

    public List<StartingLineup_> getStartingLineups() {
        return startingLineups;
    }

    public void setStartingLineups(List<StartingLineup_> startingLineups) {
        this.startingLineups = startingLineups;
    }

    public List<Substitute_> getSubstitutes() {
        return substitutes;
    }

    public void setSubstitutes(List<Substitute_> substitutes) {
        this.substitutes = substitutes;
    }

    public List<Coach_> getCoach() {
        return coach;
    }

    public void setCoach(List<Coach_> coach) {
        this.coach = coach;
    }

    public List<Object> getMissingPlayers() {
        return missingPlayers;
    }

    public void setMissingPlayers(List<Object> missingPlayers) {
        this.missingPlayers = missingPlayers;
    }

}
