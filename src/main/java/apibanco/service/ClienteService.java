package apibanco.service;

import apibanco.model.Cliente;
import apibanco.records.ClienteRecord;
import apibanco.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.lang.RuntimeException;
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
            .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
    cliente.setId(findRc.cliente().getId());
    ClienteRecord cr = new ClienteRecord(cliente);
    clienteRepository.save(cliente);
    return cr;
  }
  public List<ClienteRecord> list() {
    return Optional.of(clienteRepository.findAll()
            .stream()
            .map(c -> new ClienteRecord(c))
            .collect(Collectors.toList()))
            .orElseThrow(() -> new RuntimeException("Erro no servidor"));
  }

  public ClienteRecord findNome(String nome) {
    ClienteRecord rc = Optional.of(new ClienteRecord(clienteRepository.findByNomeLike(nome)))
            .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));

    return rc;
  }
}
