// src/main/java/org/ncapas/labo4/services/impl/VideogameServiceImpl.java
package org.ncapas.labo4.services.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.ncapas.labo4.model.modelvideogame;
import org.ncapas.labo4.repository.VideogameRepository;
import org.ncapas.labo4.services.VideogameService;
import org.ncapas.labo4.exception.exception;

import java.util.List;

@Service
public class VideogameServiceImpl implements VideogameService {

    private final VideogameRepository repo;

    @Autowired
    public VideogameServiceImpl(VideogameRepository repo) {
        this.repo = repo;
    }

    @Override
    public modelvideogame createVideogame(modelvideogame vg) {
        return repo.save(vg);
    }

    @Override
    public List<modelvideogame> getAllVideogames() {
        return repo.findAll();
    }

    @Override
    public modelvideogame getVideogameById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new exception(
                        "Videogame no encontrado con id " + id));
    }
}
