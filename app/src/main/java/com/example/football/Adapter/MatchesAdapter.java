package com.example.football.Adapter;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.football.DataApi.Matches.Matchday;
import com.example.football.DataApi.Team.Team;
import com.example.football.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;



public class MatchesAdapter extends RecyclerView.Adapter<MatchesAdapter.ViewHolder> {


    private ArrayList<Matchday> matchesModel;
    private ArrayList<Team> teams;
    Context context;
    ImageView logoteam1;
    ImageView logoteam2;

    public MatchesAdapter(ArrayList <Matchday> matchesModel, Context context,ArrayList<Team> teams){
        this.context=  context;
        this.matchesModel=matchesModel;
        this.teams=teams;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(context).inflate(R.layout.match_item ,viewGroup,false);
        return new MatchesAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        Matchday model=matchesModel.get(i);

        viewHolder.Team1.setText(model.getMatchHometeamName());
        viewHolder.Team2.setText(model.getMatchAwayteamName());
        viewHolder.Date.setText(model.getMatchDate());
        for(Team obj : teams) {
            if(obj.getTeamKey().equals(model.getMatchHometeamId()) && !obj.getTeamBadge().isEmpty() ){
                Picasso.with(context)
                        .load(obj.getTeamBadge())
                        .into(logoteam1);
            }
            if(obj.getTeamKey().equals(model.getMatchAwayteamId())&& !obj.getTeamBadge().isEmpty()  ){
                Picasso.with(context)
                        .load(obj.getTeamBadge())
                        .into(logoteam2);
            }
        }
        if (model.getMatchStatus().equals("Finished") ||
                model.getMatchStatus().equals("After Pen.") ||
                model.getMatchStatus().equals("After ET")){
              if(model.getGoalscorer().size()>0) {
                  viewHolder.Result.setText(model.getGoalscorer().get(model.getGoalscorer().size() - 1).getScore());
              }else {
                  viewHolder.Result.setText("0 - 0");
              }
        }else{
           viewHolder.Result.setText(model.getMatchTime());
        }
    }

    @Override
    public int getItemCount() {
        return matchesModel.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView Team1,Team2,Result,Date;



    public TextView getMatchHometeamName() {
        return Team1;
    }
    public TextView getMatchAwayteamName() {
        return Team2;
    }
    public TextView getMatchDate() {
        return Date;
    }
    public TextView getScore(){return Result;}

    public ImageView getTeamBadge(){return logoteam1;}



        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            Team1=itemView.findViewById(R.id.team1);
            Team2=itemView.findViewById(R.id.team2);
            Result=itemView.findViewById(R.id.result);
            Date=itemView.findViewById(R.id.Date);
            logoteam1=itemView.findViewById(R.id.logoteam1);
            logoteam2=itemView.findViewById(R.id.logoteam2);
        }
    }



}


