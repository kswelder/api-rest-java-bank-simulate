package apibanco.model;

import apibanco.model.Conta;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.io.Serializable;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Cliente implements Serializable{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

  private Long id;
  private String nome;
  private String nascimento;

}

