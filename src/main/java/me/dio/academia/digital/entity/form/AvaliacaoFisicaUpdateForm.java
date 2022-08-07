package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Positive;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaUpdateForm {

  @Positive(message = "O peso do aluno precisa ser um número positivo")
  private double peso;

  @Positive(message = "A altura do aluno precisa ser um número positivo")
  private double altura;
}
