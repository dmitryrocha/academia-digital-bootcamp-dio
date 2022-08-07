package me.dio.academia.digital.entity.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class MatriculaForm {

  @NotNull(message = "Este campo é obrigatório")
  @Positive(message = "O ID de aluno não pode ter valor negativo")
  private Long alunoId;

}
