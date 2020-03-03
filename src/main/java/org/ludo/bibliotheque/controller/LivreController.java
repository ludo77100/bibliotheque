package org.ludo.bibliotheque.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.ludo.bibliotheque.entities.Livre;
import org.ludo.bibliotheque.service.LivreService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = "Controller pour livre")
public class LivreController {

    @Autowired
    LivreService livreService ;

    @ApiOperation(value = "Retourne la liste de tous les livres")
    @GetMapping(value = "/liste")
    public List<Livre> listeLivre(){
        return livreService.findAll();
    }

    @ApiOperation(value = "Retourne la liste de tous les livre par une recherche sur le titre")
    @GetMapping(value = "/listeRecherche")
    public List<Livre> listeLivreRecherche(@RequestParam(name = "mc")String mc){
        return livreService.findByTitreContaining(mc);
    }

}
