package apibanco.service;

import apibanco.model.Endereco;
import apibanco.repository.ContaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ContaService {

  @Autowired
  private EnderecoRepository enderecoRepository;

  public Endereco save(Endereco endereco) {
    return enderecoRepository.save(endereco);
  }
}
