package apibanco.service;

import apibanco.model.Account;
import apibanco.model.Address;
import apibanco.repository.ContaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class AccountService {

  @Autowired
  private ContaRepository contaRepository;

  public Account genarate(Address endereco) {
    Account account = new Account();
    //AgenciaService agencia = new AgenciaService(endereco);
    account.setCartao("");
    account.setAgencia("");//(agencia.getAgencia());
    account.setStatus("ATIVO");
    account.setSaldo(0.0);
    account.setCreatedAt(new Date().toString());
    account.setUpdatedAt(new Date().toString());
    return contaRepository.save(account);
  }
  public List<Account> list() {
    return contaRepository.findAll();
  }
}
