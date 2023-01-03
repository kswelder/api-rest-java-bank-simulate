package banco;

/*
 * Package Objeto de Endereco para Clientes
 */
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

@SuperBuilder                                     @Getter
@Setter                                           @AllArgsConstructor
@NoArgsConstructor
@ToString
class Endereco implements Serializable{
  private Integer id;
  private String uf;
  private String estado;
  private String cidade;
  private String rua;
  private Integer numero;
  private String complemento;
  private String criacao;
  private String atualizacao;
}
