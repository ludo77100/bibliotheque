package org.ludo.bibliotheque.service;

import org.ludo.bibliotheque.entities.Livre;

import java.util.List;

public interface LivreService {
    List<Livre> findAll();
}
