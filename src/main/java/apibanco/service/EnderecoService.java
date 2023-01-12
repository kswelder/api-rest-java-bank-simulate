package apibanco.service;

import apibanco.model.Endereco;
import apibanco.repository.EnderecoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EnderecoService {

  @Autowired
  private EnderecoRepository enderecoRepository;

  public Endereco save(Endereco endereco) {
    return enderecoRepository.save(endereco);
  }
}
