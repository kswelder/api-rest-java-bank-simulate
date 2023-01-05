package apibanco.service;

import apibanco.model.Conta;
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
  private ContaRepository contaRepository;

  public Conta save(Conta conta) {
    conta.setData(new Date().toString());
    return contaRepository.save(conta);
  }
  public List<Conta> list() {
    return contaRepository.findAll();
  }
}
