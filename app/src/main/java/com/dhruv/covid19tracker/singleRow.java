package com.dhruv.covid19tracker;

public class singleRow{

    String name,confirmed,cured,death;

    public singleRow() {
    }

    singleRow(String name, String confirmed, String cured, String death)
    {
        this.name = name;
        this.confirmed=confirmed;
        this.cured= cured;
        this.death=death;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(String confirmed) {
        this.confirmed = confirmed;
    }

    public String getCured() {
        return cured;
    }

    public void setCured(String cured) {
        this.cured = cured;
    }

    public String getDeath() {
        return death;
    }

    public void setDeath(String death) {
        this.death = death;
    }
}