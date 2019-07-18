package com.example.football;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;
import com.example.football.Adapter.CompetitionsAdapter;
import com.example.football.DataApi.Competitions;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

//TODO All Competitions
//TODO Images Competitions
    private int[] images={R.mipmap.africa_icon_round,R.mipmap.egyptian_premier_league_round};
    RecyclerView rvComprtitions;
    ArrayList<Competitions> competitions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

 //TODO Competitions RecyclerView And Adapter
        rvComprtitions=(RecyclerView) findViewById(R.id.rv_competitions);
        competitions=new ArrayList<>();

        competitions.add(new Competitions("Africa Cup of Nations","559","2019-06-21","2019-07-19"));
        competitions.add(new Competitions("Egyptian Premier League","144","2019-01-02","2019-07-28"));

        CompetitionsAdapter competitionsAdapter;

        competitionsAdapter=new CompetitionsAdapter(competitions  ,this,images);

        rvComprtitions.setAdapter(competitionsAdapter);

        LinearLayoutManager mLayoutManager=
                new LinearLayoutManager(getApplicationContext());

        rvComprtitions.setLayoutManager(mLayoutManager);

        competitionsAdapter.notifyDataSetChanged();


//TODO on Click Listener Action Choose Any Competitions
        rvComprtitions.addOnItemTouchListener(
                new RecyclerItemClickListener(MainActivity.this, rvComprtitions,new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                        Intent intent=new Intent(MainActivity.this,CompetitionEvents.class);
                        Competitions competitions1=competitions.get(position);
                        String id=competitions1.getId();
                        String from=competitions1.getFrom();
                        String to=competitions1.getTo();
                        intent.putExtra("idComprtition", id);
                        intent.putExtra("from", from);
                        intent.putExtra("to", to);
                        startActivity(intent);
                    }

                    @Override public void onLongItemClick(View view, int position) {
                        Toast.makeText(MainActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();

                    }
                })
        );

    }




}


//Snackbar
//    .make(view, "No network connection.",Snackbar.LENGTH_SHORT)
//    .show();
