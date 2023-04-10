package apibanco.service;

import apibanco.exception.BusinessRuleException;
import apibanco.model.Client;
import apibanco.dto.ClientDTO;
import apibanco.repository.ClientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ClientService {

  @Autowired
  private ClientRepository clienteRepository;

  public ClientDTO saveRecord(Client client) {
    ClientDTO cr = new ClientDTO(client);
    clienteRepository.save(client);
    return cr;
  }
  public ClientDTO updateRecord(String nome, Client client) {
    Client cloneClient = Optional.of(clienteRepository.findByNomeLike(nome))
            .orElseThrow(() -> new BusinessRuleException("Client não encontrado"));
    client.setId(cloneClient.getId());
    cloneClient.setNome(client.getNome());
    cloneClient.setNascimento(client.getNascimento());
    clienteRepository.save(client);
    return new ClientDTO(cloneClient);
  }
  public List<ClientDTO> list() {
    return Optional.of(clienteRepository.findAll()
            .stream()
            .map(ClientDTO::new)
            .collect(Collectors.toList()))
            .orElseThrow(() -> new BusinessRuleException("Erro no servidor"));
  }

  public ClientDTO findNome(String nome) {
    return Optional.of(new ClientDTO(clienteRepository.findByNomeLike(nome)))
            .orElseThrow(() -> new BusinessRuleException("Client não encontrado"));
  }
}
