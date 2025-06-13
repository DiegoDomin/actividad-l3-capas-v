package org.ncapas.labo4.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.ncapas.labo4.model.modelvideogame;
import org.ncapas.labo4.services.VideogameService;

import java.util.List;

@RestController
@RequestMapping("/api/videogames")
public class VideogameController {

    private final VideogameService svc;

    public VideogameController(VideogameService svc) {
        this.svc = svc;
    }

    @PostMapping
    public ResponseEntity<modelvideogame> create(@RequestBody modelvideogame vg) {
        modelvideogame creado = svc.createVideogame(vg);
        return new ResponseEntity<>(creado, HttpStatus.CREATED);
    }

    @GetMapping
    public List<modelvideogame> all() {
        return svc.getAllVideogames();
    }

    @GetMapping("/{id}")
    public ResponseEntity<modelvideogame> one(@PathVariable Long id) {
        modelvideogame vg = svc.getVideogameById(id);
        return ResponseEntity.ok(vg);
    }
}
