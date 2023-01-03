package banco.model;

/*
 * Classe de objetos Client
 */

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

@SuperBuilder                                     @Getter
@Setter                                           @AllArgsConstructor
@NoArgsConstructor
@ToString
class Client implements Serializable{
  private Integer id;
  private String nome;
  private String nascimento;
  private String criacao;
  private String atualizacao;
}
