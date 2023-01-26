package com.example.filmotheque.entity;

//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//
//@Entity
public class Membre {
//    @Id
//    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String username;
    private String mail;
    private String password;
    boolean admin;

    public Membre() {
    }
    public Membre(String username, String mail, String password, boolean admin) {
        this.username = username;
        this.mail = mail;
        this.password = password;
        this.admin = admin;
    }

    public Membre(int id, String username, String mail, String password, boolean admin) {
        this.id = id;
        this.username = username;
        this.mail = mail;
        this.password = password;
        this.admin = admin;
    }


}
