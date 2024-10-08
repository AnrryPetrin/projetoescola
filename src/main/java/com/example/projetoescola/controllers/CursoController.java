package com.example.projetoescola.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.projetoescola.dtos.InsereCursoDTO;
import com.example.projetoescola.services.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/curso")
public class CursoController {
    @Autowired
    private CursoService cursoService;

    // @GetMapping()
    // public List<Curso> getCursos() {
    // return cursoRepository.findAll();
    // }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void postCurso(@RequestBody InsereCursoDTO curso) {
        cursoService.inserir(curso);
    }

}
