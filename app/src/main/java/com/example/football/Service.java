package com.example.football;

import com.example.football.DataApi.Matches.Matchday;
import com.example.football.DataApi.Team.Team;

import java.util.ArrayList;
import java.util.Calendar;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface Service {


    String baseUrl="https://apiv2.apifootball.com";

    @GET("/")
    Call<ArrayList<Matchday>> getCurrentMatches(
           @Query("action") String action,
           @Query("from") String from,
           @Query("to") String to,
           @Query("league_id") String league_id,
           @Query("APIkey") String APIkey
    );


    @GET("/")
    Call<ArrayList<Team>> getTeamImage(
            @Query("action") String action,
            @Query("league_id") String league_id,
            @Query("APIkey") String APIkey
    );







}
