package apibanco.service;

import apibanco.model.Account;
import apibanco.model.Address;
import apibanco.repository.AccountRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class AccountService {

  @Autowired
  private AccountRepository accountRepository;

  public void saveAccount(Account account) {
    LocalDateTime localDateTime = LocalDateTime.now();
    account.setUpdatedAt(localDateTime);
    account.setCreatedAt(localDateTime);
    accountRepository.save(account);
  }
  public void updateAccount(String username, Account account) {
    Account account1 = Optional.of(accountRepository.findByUsername(username))
            .orElseThrow(() -> new RuntimeException("User not found"));
    account1.setPassword(account.getPassword());
    account1.setUpdatedAt(LocalDateTime.now());
    accountRepository.save(account1);
  }
  public Account findAccount(String username) {
    return Optional.of(accountRepository.findByUsername(username))
            .orElseThrow(() -> new RuntimeException("User not found"));
  }
  public List<Account> list() {
    return accountRepository.findAll();
  }
}
