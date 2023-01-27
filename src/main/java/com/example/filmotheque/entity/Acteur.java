package com.example.filmotheque.entity;

import jakarta.persistence.*;

@Entity
public class Acteur {
        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)
        private Long id;
        private String nom;
        private String prenom;

        public void setId(Long id) {
                this.id = id;
        }

        @Id
        public Long getId() {
                return id;
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


}
