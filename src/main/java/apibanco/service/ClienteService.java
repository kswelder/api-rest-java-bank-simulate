package apibanco.service;

import apibanco.exception.RegraDeNegocioException;
import apibanco.model.Cliente;
import apibanco.dto.ClienteDTO;
import apibanco.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ClienteService {

  @Autowired
  private ClienteRepository clienteRepository;

  public ClienteDTO saveRecord(Cliente cliente) {
    ClienteDTO cr = new ClienteDTO(cliente);
    clienteRepository.save(cliente);
    return cr;
  }
  public ClienteDTO updateRecord(String nome, Cliente cliente) {
    Cliente cloneCliente = Optional.of(clienteRepository.findByNomeLike(nome))
            .orElseThrow(() -> new RegraDeNegocioException("Cliente não encontrado"));
    cliente.setId(cloneCliente.getId());
    cloneCliente.setNome(cliente.getNome());
    cloneCliente.setNascimento(cliente.getNascimento());
    clienteRepository.save(cliente);
    return new ClienteDTO(cloneCliente);
  }
  public List<ClienteDTO> list() {
    return Optional.of(clienteRepository.findAll()
            .stream()
            .map(ClienteDTO::new)
            .collect(Collectors.toList()))
            .orElseThrow(() -> new RegraDeNegocioException("Erro no servidor"));
  }

  public ClienteDTO findNome(String nome) {
    return Optional.of(new ClienteDTO(clienteRepository.findByNomeLike(nome)))
            .orElseThrow(() -> new RegraDeNegocioException("Cliente não encontrado"));
  }
}
