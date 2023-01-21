package apibanco.service;

import apibanco.model.Conta;
import apibanco.model.Endereco;
import apibanco.repository.ContaRepository;
import apibanco.service.AgenciaService;

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

  public Conta genarate(Endereco endereco) {
    Conta conta = new Conta();
    //AgenciaService agencia = new AgenciaService(endereco);
    conta.setCartao("");
    conta.setAgencia("");//(agencia.getAgencia());
    conta.setStatus("ATIVO");
    conta.setSaldo(0.0);
    conta.setCreatedAt(new Date().toString());
    conta.setUpdatedAt(new Date().toString());
    return contaRepository.save(conta);
  }
  public List<Conta> list() {
    return contaRepository.findAll();
  }
}
