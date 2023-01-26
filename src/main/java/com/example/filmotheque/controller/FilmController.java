package com.example.filmotheque.controller;

import com.example.filmotheque.bll.FilmServiceImpl;
import com.example.filmotheque.entity.Film;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.util.List;

@Controller
public class FilmController {

    @GetMapping("/")
    public String accueil(){

        return "accueil";
    }

    public FilmController(FilmServiceImpl filmService) {
        this.filmService = filmService;
    }

    private FilmServiceImpl filmService;

    @GetMapping("/list")
    public String list(Model model){
        model.addAttribute("films", filmService.findAll());
        return "listefilms";
    }


}
