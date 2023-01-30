package com.example.filmotheque.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Genre {
        @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String libelle;

    //add a OneToMany relationship with Film
    @OneToMany(mappedBy = "genre")
    private List<Film> films;


    public Genre() {

    }

    public Genre(String libelle) {
        this.libelle = libelle;
    }

    public Genre(int id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }
}
