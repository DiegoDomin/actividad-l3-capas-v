package org.ncapas.labo4.services;


import org.ncapas.labo4.model.modelvideogame;
import java.util.List;

public interface VideogameService {
    modelvideogame createVideogame(modelvideogame vg);
    List<modelvideogame> getAllVideogames();
    modelvideogame getVideogameById(Long id);

}
