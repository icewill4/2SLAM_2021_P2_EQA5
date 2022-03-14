package com.example.a2slam_2021_p2_eq5;

import org.json.JSONArray;

import java.lang.reflect.Array;

public class Resto {
    protected String nomR;
    protected String numAdr;
    protected String voieAdr;
    protected String cpR;
    protected String villeR;
    protected String latitudeDegR;
    protected String longitudeDegR;
    protected String descR;
    protected String horairesR;
    protected JSONArray lesPhotos;
    protected JSONArray lesCritiques;
    protected JSONArray lesTypesCuisineProposes;

    public Resto(String nomR, String numAdr, String voieAdr, String cpR,
                 String villeR, String latitudeDegR, String longitudeDegR, String descR,
                 String horairesR, JSONArray lesPhotos, JSONArray lesCritiques, JSONArray lesTypesCuisineProposes) {

        this.nomR = nomR;
        this.numAdr = numAdr;
        this.voieAdr = voieAdr;
        this.cpR = cpR;
        this.villeR = villeR;
        this.latitudeDegR = latitudeDegR;
        this.longitudeDegR = longitudeDegR;
        this.descR = descR;
        this.horairesR = horairesR;
        this.lesPhotos = lesPhotos;
        this.lesCritiques = lesCritiques;
        this.lesTypesCuisineProposes = lesTypesCuisineProposes;

    }



    public String getNomR() {
        return nomR;
    }

    public void setNomR(String nomR) {
        this.nomR = nomR;
    }

    public String getNumAdr() {
        return numAdr;
    }

    public void setNumAdr(String numAdr) {
        this.numAdr = numAdr;
    }

    public String getVoieAdr() {
        return voieAdr;
    }

    public void setVoieAdr(String voieAdr) {
        this.voieAdr = voieAdr;
    }

    public String getCpR() {
        return cpR;
    }

    public void setCpR(String cpR) {
        this.cpR = cpR;
    }

    public String getVilleR() {
        return villeR;
    }

    public void setVilleR(String villeR) {
        this.villeR = villeR;
    }

    public String getLatitudeDegR() {
        return latitudeDegR;
    }

    public void setLatitudeDegR(String latitudeDegR) {
        this.latitudeDegR = latitudeDegR;
    }

    public String getLongitudeDegR() {
        return longitudeDegR;
    }

    public void setLongitudeDegR(String longitudeDegR) {
        this.longitudeDegR = longitudeDegR;
    }

    public String getDescR() {
        return descR;
    }

    public void setDescR(String descR) {
        this.descR = descR;
    }

    public String getHorairesR() {
        return horairesR;
    }

    public void setHorairesR(String horairesR) {
        this.horairesR = horairesR;
    }

    public JSONArray getLesPhotos() {
        return lesPhotos;
    }

    public void setLesPhotos(JSONArray lesPhotos) {
        this.lesPhotos = lesPhotos;
    }

    public JSONArray getLesCritiques() {
        return lesCritiques;
    }

    public void setLesCritiques(JSONArray lesCritiques) {
        this.lesCritiques = lesCritiques;
    }

    public JSONArray getLesTypesCuisineProposes() {
        return lesTypesCuisineProposes;
    }

    public void setLesTypesCuisineProposes(JSONArray lesTypesCuisineProposes) {
        this.lesTypesCuisineProposes = lesTypesCuisineProposes;
    }
}
