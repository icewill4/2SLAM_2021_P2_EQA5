package com.example.a2slam_2021_p2_eq5;

import java.lang.reflect.Array;
import java.util.Date;

public class DetailResto {
    protected int idR;
    protected String nomR;
    protected String numAdr;
    protected String voieAdr;
    protected String cpR;
    protected String villeR;
    protected float latitudeDegR;
    protected float longitudeDegR;
    protected String descR;
    protected String horairesR;
    protected Array lesPhotos;
    protected Array lesCritiques;
    protected Array lesTypesCuisineProposes;

    public DetailResto(int idR, String nomR, String numAdr, String voieAdr, String cpR,
                       String villeR, float latitudeDegR, float longitudeDegR, String descR,
                       String horairesR, Array lesPhotos, Array lesCritiques, Array lesTypesCuisineProposes){

    this.idR = idR;
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

    public int getIdR() {
        return idR;
    }

    public void setIdR(int idR) {
        this.idR = idR;
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

    public float getLatitudeDegR() {
        return latitudeDegR;
    }

    public void setLatitudeDegR(float latitudeDegR) {
        this.latitudeDegR = latitudeDegR;
    }

    public float getLongitudeDegR() {
        return longitudeDegR;
    }

    public void setLongitudeDegR(float longitudeDegR) {
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

    public Array getLesPhotos() {
        return lesPhotos;
    }

    public void setLesPhotos(Array lesPhotos) {
        this.lesPhotos = lesPhotos;
    }

    public Array getLesCritiques() {
        return lesCritiques;
    }

    public void setLesCritiques(Array lesCritiques) {
        this.lesCritiques = lesCritiques;
    }

    public Array getLesTypesCuisineProposes() {
        return lesTypesCuisineProposes;
    }

    public void setLesTypesCuisineProposes(Array lesTypesCuisineProposes) {
        this.lesTypesCuisineProposes = lesTypesCuisineProposes;
    }
}
