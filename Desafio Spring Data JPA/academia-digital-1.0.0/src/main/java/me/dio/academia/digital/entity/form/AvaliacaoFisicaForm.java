package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaForm {

  @NotNull(message = "Preencha o campo corretamente!")
  @Positive(message = "O id do aluno deve ser positivo")
  private Long alunoId;

  @NotNull(message = "Preencha o campo corretamente!")
  @Positive(message = "O peso '${validatedValue}' deve ser positivo")
  private double peso;

  @NotNull(message = "Preencha o campo corretamente!")
  @Positive(message = "A altura '${validatedValue}' deve ser positivo")
  private double altura;

}
