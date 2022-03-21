package com.example.a2slam_2021_p2_eq5;

import org.json.JSONArray;

import java.lang.reflect.Array;

public class Resto {
    protected String nomR;
    protected String villeR;

    public Resto(String nomR, String villeR) {

        this.nomR = nomR;
        this.villeR = villeR;

    }

    @Override
    public String toString() {
        return nomR  +"                           "+ villeR;
    }

    public String getNomR() {
        return nomR;
    }

    public void setNomR(String nomR) {
        this.nomR = nomR;
    }

    public String getVilleR() {
        return villeR;
    }

    public void setVilleR(String villeR) {
        this.villeR = villeR;
    }

}
