package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaForm {

  @Positive(message = "O ID do aluno precisa ser um número positivo")
  private Long alunoId;

  @NotNull(message = "Este campo é obrigatório")
  @Positive(message = "O peso do aluno precisa ser um número positivo")
  private double peso;

  @NotNull(message = "Este campo é obrigatório")
  @Positive(message = "A altura do aluno precisa ser um número positivo")
  @DecimalMin(value = "120", message = "'${validatedValue}' precisa ser no mínimo {value}")
  private double altura;
}
