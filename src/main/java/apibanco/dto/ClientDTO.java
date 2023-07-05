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
    private String name;
    private String old;
    public ClientDTO(Client client) {
        this.name = client.getName();
        this.old = client.getOld();
    }
}
