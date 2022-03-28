package com.example.a2slam_2021_p2_eq5;

import java.util.Date;

public class Reservation {
    protected int id_res;
    protected int id_resto;
    protected String nom;
    protected String prenom;
    protected String tel;
    protected Date horaire;
    protected int nbpersonne;
    public Reservation(int id_res, int id_resto, String nom, String prenom, String tel, Date horaire, int nbpersonne ) {
        this.id_res = id_res;
        this.id_resto = id_resto;
        this.nom =nom;
        this.prenom = prenom;
        this.tel = tel;
        this.horaire = horaire;
        this.nbpersonne = nbpersonne;

    }

    public Reservation(String toString, String toString1, String nom, String prenom, String tel) {
    }


    public int getId_res() {
        return id_res;
    }

    public void setId_res(int id_res) {
        this.id_res = id_res;
    }

    public int getId_resto() {
        return id_resto;
    }

    public void setId_resto(int id_resto) {
        this.id_resto = id_resto;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Date getHoraire() { return horaire; }

    public void setHoraire(Date horaire) {
        this.horaire = horaire;
    }

    public int getNbpersonne() {
        return nbpersonne;
    }

    public void setNbpersonne(int nbpersonne) {
        this.nbpersonne = nbpersonne;
    }
}
