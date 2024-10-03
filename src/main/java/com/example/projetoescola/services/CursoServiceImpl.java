package com.example.projetoescola.services;

import org.springframework.stereotype.Service;

import com.example.projetoescola.dtos.InsereCursoDTO;
import com.example.projetoescola.exceptions.RegraNegocioException;
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
        .orElseThrow(() -> new RegraNegocioException("Categoria de curso não encontrada"));

        Curso cursoObj = new Curso();
        cursoObj.setNome(curso.getNome());
        cursoObj.setCargaHoraria(curso.getCargaHoraria());
        cursoObj.setCategoriaCurso(categoriaCurso);

        return cursoRepository.save(cursoObj);
    }

}
