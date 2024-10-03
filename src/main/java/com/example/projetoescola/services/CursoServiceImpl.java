package com.example.projetoescola.services;

import org.springframework.stereotype.Service;

import com.example.projetoescola.dtos.InsereCursoDTO;
import com.example.projetoescola.models.CategoriaCurso;
import com.example.projetoescola.models.Curso;
import com.example.projetoescola.repositories.CategoriaCursoRepository;
import com.example.projetoescola.repositories.CursoRepository;

@Service
public class CursoServiceImpl implements CursoService {
  private CursoRepository cursoRepository;
  private CategoriaCursoRepository categoriaCursoRepository;

  public CursoServiceImpl(CursoRepository cursoRepository, CategoriaCursoRepository categoriaCursoRepository) {
    this.cursoRepository = cursoRepository;
    this.categoriaCursoRepository = categoriaCursoRepository;
  }

  @Override
  public Curso inserir(InsereCursoDTO curso) {
    CategoriaCurso categoriaCurso = categoriaCursoRepository.findById(curso.getCategoriaCurso())
  }

}
