package apibanco.model;

import apibanco.model.Cliente;

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
public class Conta implements Serializable{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

  private Integer id;
  private Double saldo;
  private String createdAt;
  private String updatedAt;

  @ManyToOne
  @JoinColumn(name = "cliente_id")
  private Cliente cliente;
}

