package com.example.football;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.example.football.Adapter.MatchesAdapter;
import com.example.football.DataApi.Matches.Matchday;
import com.example.football.DataApi.Team.Team;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.TimeZone;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static android.content.ContentValues.TAG;

public class MatchFragment extends Fragment  {

    Retrofit retrofit ;
    View view;
    Service service;
    RecyclerView rvmatch;
    MatchesAdapter matchesAdapter;
    ArrayList<Matchday> matchdays;
    ArrayList<Team> teams;





    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.matches_layout,container,false);
        rvmatch=(RecyclerView) view.findViewById(R.id.rv_match);
        retrofit=new Retrofit.Builder().baseUrl(Service.baseUrl)
                .addConverterFactory(GsonConverterFactory.create(new Gson())).build();
        service=retrofit.create(Service.class);
        teams = new ArrayList<Team>();
        matchdays=new ArrayList<Matchday>();


//TODO Connection Display photos of clubs
        service.getTeamImage("get_teams",Variable.leagueid,Variable.APIKEY)
                .enqueue(new Callback<ArrayList<Team>>() {
                    @Override
                    public void onResponse(Call<ArrayList<Team>> call, final Response<ArrayList<Team>> response1) {
                        teams=response1.body();
                            //TODO  Connection Display Matches
                            service.getCurrentMatches("get_events",Variable.leaguefrom,Variable.leagueto,Variable.leagueid,""+Variable.APIKEY)
                                    .enqueue(new Callback<ArrayList<Matchday>>() {
                                        @Override
                                        public void onResponse(Call<ArrayList<Matchday>> call, Response<ArrayList<Matchday>> response) {

                                            // Log.d(TAG, "onResponse: "+call.request().url());
                                            matchdays=response.body();
                                           Collections.reverse(matchdays);
                                            matchesAdapter=new MatchesAdapter(matchdays, getContext(),teams);

                                            LinearLayoutManager mLayoutManager=
                                                    new LinearLayoutManager(getContext());

                                            rvmatch.setLayoutManager(mLayoutManager);
                                            rvmatch.setHasFixedSize(true);
                                            rvmatch.setAdapter(matchesAdapter);

                                            matchesAdapter.notifyDataSetChanged();

                                        }
                                        @Override
                                        public void onFailure(Call<ArrayList<Matchday>> call, Throwable t) {
                                            // Log.d(TAG, "onResponse: "+call.request().url());
                                            // Toast.makeText(getContext(), "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
                                        }
                                    });

                    }

                    @Override
                    public void onFailure(Call<ArrayList<Team>> call, Throwable t) {
                        Toast.makeText(getContext(), "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();

                    }
                });


        return view;
    }


}
