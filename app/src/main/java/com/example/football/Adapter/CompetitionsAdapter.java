package com.example.football.Adapter;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.football.DataApi.Competitions;
import com.example.football.R;

import java.util.ArrayList;

public class CompetitionsAdapter extends RecyclerView.Adapter<CompetitionsAdapter.ViewHolder> {


    private  int[] images;





    ArrayList <Competitions> competitionsModel;
    Context context;

    public CompetitionsAdapter( ArrayList <Competitions> competitions,Context context,int[] images){
        this.context=context;
        this.competitionsModel=competitions;
        this.images=images;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(context).inflate(R.layout.competitions_item,viewGroup,false);

        return new CompetitionsAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Competitions model=competitionsModel.get(i);
        viewHolder.name.setText(model.getName());
        viewHolder.img.setImageResource(images[i]);
    }






    @Override
    public int getItemCount() {
        return competitionsModel.size();
    }






    public class ViewHolder extends RecyclerView.ViewHolder{


        TextView name;
        ImageView img;

        public TextView getName() {
            return name;
        }



        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.name_competitions);
            img=itemView.findViewById(R.id.img_competitions);
        }
    }

}


