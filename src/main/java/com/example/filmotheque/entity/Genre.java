package com.example.filmotheque.entity;

//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//
//@Entity
public class Genre {
    //    @Id
//    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String libelle;

    public Genre() {
    }

    public Genre(String libelle) {
        this.libelle = libelle;
    }

    public Genre(int id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }


}
