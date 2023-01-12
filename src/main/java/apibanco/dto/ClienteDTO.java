package apibanco.dto;

import apibanco.model.Cliente;
import apibanco.model.Endereco;
import apibanco.model.Conta;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClienteDTO implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String nascimento;

    private Endereco endereco;

    private List<Conta> conta;

    public ClienteDTO(Cliente cliente){

        this.id = cliente.getId();
        this.nome = cliente.getNome();
        this.nascimento = cliente.getNascimento();
        this.endereco = cliente.getEndereco();
        this.conta = cliente.getConta();
    }
}
