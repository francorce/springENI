package com.example.filmotheque.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FilmController {

    @GetMapping("/")
    public String accueil(){

        return "accueil";
    }

    @GetMapping("/list")
    public String list(){

        return "listefilms";
    }

}
