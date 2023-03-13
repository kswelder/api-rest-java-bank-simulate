package apibanco.dto;

import apibanco.model.Cliente;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDTO {
    private String nome;
    private String nascimento;
    public ClienteDTO(Cliente cliente) {
        this.nome = cliente.getNome();
        this.nascimento = cliente.getNascimento();
    }
}
