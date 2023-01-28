package apibanco.model;

import apibanco.model.Conta;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Transacao implements Serializable{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

  private Long id;
  private String operacao;
  private String para;
  private Double valor;
  private String createdAt;

  @ManyToOne
  @JoinColumn(name = "cliente_id")
  private Conta conta;
}

