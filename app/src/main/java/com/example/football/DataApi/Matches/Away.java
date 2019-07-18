
package com.example.football.DataApi.Matches;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Away {

    @SerializedName("time")
    @Expose
    private String time;
    @SerializedName("substitution")
    @Expose
    private String substitution;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSubstitution() {
        return substitution;
    }

    public void setSubstitution(String substitution) {
        this.substitution = substitution;
    }

}
