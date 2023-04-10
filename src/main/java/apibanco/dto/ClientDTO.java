package apibanco.dto;

import apibanco.model.Client;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClientDTO {
    private String nome;
    private String nascimento;
    public ClientDTO(Client client) {
        this.nome = client.getNome();
        this.nascimento = client.getNascimento();
    }
}
