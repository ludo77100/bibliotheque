package org.ludo.bibliotheque.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LivreController {

    @GetMapping(value = "/listeLivres")
    public List listeLivre(){
        return null ;
    }

}
