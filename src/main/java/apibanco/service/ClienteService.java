package apibanco.service;

import apibanco.model.Cliente;
import apibanco.dto.ClienteDTO;
import apibanco.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
import java.lang.RuntimeException;
import java.util.stream.Collectors;

@Service
public class ClienteService {

  @Autowired
  private ClienteRepository clienteRepository;

  public ClienteDTO save(Cliente cliente) {
    ClienteDTO dto = new ClienteDTO(cliente);
    clienteRepository.save(cliente);
    return dto;
  }
  
  public ClienteDTO update(String nome,Cliente cliente) {
    ClienteDTO dto = new ClienteDTO(cliente);
    Optional<Cliente> find = Optional.ofNullable(clienteRepository.findByNomeLike(nome));
      if (find.isPresent()) {
        dto.setId(find.get().getId());
        cliente.setId(dto.getId());
        clienteRepository.save(cliente);
        return dto;
      }
      else { 
        throw new RuntimeException("Cliente nao encontrado");
      }
  }

  public List<Cliente> list() {
    return clienteRepository.findAll();
  }

  public Cliente findNome(String nome) {
    Optional<Cliente> find = Optional.of(clienteRepository.findByNomeLike(nome));
    
    if(find.isPresent()) {
      return find.get();
    }
    else {
      throw new RuntimeException("Cliente nao encontrado");
    }
  }
}
