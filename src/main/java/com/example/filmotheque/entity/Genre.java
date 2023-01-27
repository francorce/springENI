package com.example.filmotheque.entity;

import jakarta.persistence.*;

@Entity
public class Genre {
        @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
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
