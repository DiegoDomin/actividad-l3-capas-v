package org.ncapas.labo4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ncapas.labo4.model.modelvideogame;

public interface VideogameRepository
        extends JpaRepository<modelvideogame, Long> { }


