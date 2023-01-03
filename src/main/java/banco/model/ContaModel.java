package banco.model;

/*
 * Objeto classe de criacao de conta
 */
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

@SuperBuilder                                     @Getter
@Setter                                           @AllArgsConstructor
@NoArgsConstructor
@ToString
class Conta implements Serializable{
  private Integer enderecoId;
  private Integer clienteId;
  private String titular;
  private double saldo;
  private String criacao;
  private String atualizacao;
}
