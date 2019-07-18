package com.example.football;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;


public class CompetitionEvents extends AppCompatActivity implements
        BottomNavigationView.OnNavigationItemSelectedListener{


    Intent intent;
    BottomNavigationView mNavigationView;
    MatchFragment fragment;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_competition_events);

        //TODO init Data
        fragmentManager = getSupportFragmentManager();

        //TODO Get Data from Another Activity by Extra
        intent=getIntent();
        Variable.leagueid = intent.getStringExtra("idComprtition");
        Variable.leaguefrom = intent.getStringExtra("from");
        Variable.leagueto = intent.getStringExtra("to");


        //TODO Handle item selection BottomNavigation1
        mNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigationView);
        if (mNavigationView != null) {
            mNavigationView.setOnNavigationItemSelectedListener(this);
        }


        matchFragmentActive();
    }
    //TODO Handle item selection BottomNavigation1

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        // Handle navigation view item clicks here.
        int id = menuItem.getItemId();

        if (id == R.id.match) {
            matchFragmentActive();
            return true;
        }
        else if (id==R.id.recents){
            return true;
        }
        return false;
    }

    public void matchFragmentActive(){
        fragment=new MatchFragment();
        fragmentTransaction1 = fragmentManager.beginTransaction();
        fragmentTransaction1.replace(R.id.container, fragment,"firstTransaction");
        fragmentTransaction1.commit();
    }



}
