package banco.model;

/*
 * Objeto classe de criacao de conta
 */
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.GeneratedValue;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

@Entity
@SuperBuilder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ContaModel implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
  private String titular;
  private Double saldo;
  private String criacao;
  private String atualizacao;
}
