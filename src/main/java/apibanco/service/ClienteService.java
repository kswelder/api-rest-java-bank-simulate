package apibanco.service;

import apibanco.exception.RegraDeNegocioException;
import apibanco.model.Cliente;
import apibanco.records.ClienteRecord;
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

  public ClienteRecord saveRecord(Cliente cliente) {
    ClienteRecord cr = new ClienteRecord(cliente);
    clienteRepository.save(cliente);
    return cr;
  }
  public ClienteRecord updateRecord(String nome, Cliente cliente) {
    ClienteRecord findRc = Optional.of(new ClienteRecord(clienteRepository.findByNomeLike(nome)))
            .orElseThrow(() -> new RegraDeNegocioException("Cliente não encontrado"));
    cliente.setId(findRc.cliente().getId());
    findRc.cliente().setNome(cliente.getNome());
    findRc.cliente().setNascimento(cliente.getNascimento());
    clienteRepository.save(cliente);
    return findRc;
  }
  public List<ClienteRecord> list() {
    return Optional.of(clienteRepository.findAll()
            .stream()
            .map(ClienteRecord::new)
            .collect(Collectors.toList()))
            .orElseThrow(() -> new RegraDeNegocioException("Erro no servidor"));
  }

  public ClienteRecord findNome(String nome) {
    return Optional.of(new ClienteRecord(clienteRepository.findByNomeLike(nome)))
            .orElseThrow(() -> new RegraDeNegocioException("Cliente não encontrado"));
  }
}
