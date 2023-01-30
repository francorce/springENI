package com.example.filmotheque.entity;

import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name = "FILMS")
public class Film {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String titre;
    private int annee;
    private int duree;
    private String synopsis;
//    private Genre genre;

    //add a ManyToOne relationship with Genre
    @ManyToOne
    @JoinColumn(name = "genre_id")
    private Genre genre;


    public Film(String titre, int duree, Genre genre, int annee, String synopsis) {
        this.titre=titre;
        this.duree=duree;
        this.annee=annee;
        this.synopsis=synopsis;
        this.genre=genre;
    }

    public Film() {

    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

//    public Genre getGenre() {
//        return genre;
//    }
//
//    public void setGenre(Genre genre) {
//        this.genre = genre;
//    }
}
