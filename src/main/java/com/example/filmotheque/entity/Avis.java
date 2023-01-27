package com.example.filmotheque.entity;

import jakarta.persistence.*;

@Entity
public class Avis {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String textAvis;


    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

    public String getTextAvis() {
        return textAvis;
    }

    public void setTextAvis(String textAvis) {
        this.textAvis = textAvis;
    }
}
