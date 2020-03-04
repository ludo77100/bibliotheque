package org.ludo.bibliotheque.service;

import org.ludo.bibliotheque.entities.Livre;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LivreService {



    List<Livre> findAll();

    List<Livre> findByTitreContainingIgnoreCase(String mc);
}
