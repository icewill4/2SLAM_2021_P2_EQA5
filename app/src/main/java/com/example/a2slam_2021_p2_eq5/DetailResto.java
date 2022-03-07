package com.example.a2slam_2021_p2_eq5;

import java.util.Date;

public class DetailResto {
    protected String adresse;
    protected String typeDeCuisine;
    protected Date horaire;
    protected String geolocalisation;

    public DetailResto(String adresse, String typeDeCuisine, Date horaire, String geolocalisation) {
        this.adresse = adresse;
        this.typeDeCuisine = typeDeCuisine;
        this.horaire = horaire;
        this.geolocalisation = geolocalisation;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTypeDeCuisine() {
        return typeDeCuisine;
    }

    public void setTypeDeCuisine(String typeDeCuisine) {
        this.typeDeCuisine = typeDeCuisine;
    }

    public Date getHoraire() {
        return horaire;
    }

    public void setHoraire(Date horaire) {
        this.horaire = horaire;
    }

    public String getGeolocalisation() {
        return geolocalisation;
    }

    public void setGeolocalisation(String geolocalisation) {
        this.geolocalisation = geolocalisation;
    }
}
