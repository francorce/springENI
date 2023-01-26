package com.example.filmotheque.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ConnexionController {

    @GetMapping("/connexion")
    public String connexion(){

        return "connexion";
    }

    @PostMapping("connect")
    public String toto(){
        return "toto";
    }


}
