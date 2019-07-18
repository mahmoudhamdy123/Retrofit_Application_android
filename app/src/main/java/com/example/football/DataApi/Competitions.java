package com.example.football.DataApi;

public class Competitions {



    private String name ,id ;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    private String from,to;

    public Competitions(String name, String id, String from, String to) {
        this.name = name;
        this.id = id;
        this.from = from;
        this.to = to;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void setId(String id){
        this.id=id;
    }
    public String getId(){
        return id;
    }
}
