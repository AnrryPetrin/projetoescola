package com.example.projetoescola.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class InsereCursoDTO {
  private Long id;
  private String nome;
  private int cargaHoraria;
  private int categoriaCurso;
}
