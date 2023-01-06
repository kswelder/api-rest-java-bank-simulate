package apibanco.model;

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
@Table(name="api")
public class Conta implements Serializable{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

  private Integer id;
  private String nome;
  private Double saldo;
  private String data;
}

