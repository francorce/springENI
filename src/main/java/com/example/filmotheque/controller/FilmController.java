package com.example.filmotheque.controller;

import com.example.filmotheque.bll.FilmService;
import com.example.filmotheque.bll.FilmServiceImpl;
import com.example.filmotheque.entity.Film;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.List;

@Controller
public class FilmController {

    @GetMapping("/")
    public String accueil() {

        return "accueil";
    }

//    public FilmController(FilmServiceImpl filmService) {
//        this.filmService = filmService;
//    }
//
//    private FilmServiceImpl filmService;

    @Autowired
    private FilmService filmService;

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("films", filmService.findAll());
        return "listefilms";
    }


    @GetMapping("/ajoutFilm")
    public String ajout(){

        return "formulaireFilm";
    }

    @PostMapping("/ajoutFilms")
    public String ajouterFilm(@Valid @ModelAttribute Film film, BindingResult result) {
        filmService.addFilm(film);
        return "redirect:/list";
    }

}
