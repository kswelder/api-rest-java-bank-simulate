package apibanco.service;

import apibanco.model.Account;
import apibanco.model.Address;
import apibanco.repository.AccountRepository;
import apibanco.repository.AddressRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class AddressService {

  @Autowired
  private AddressRepository addressRepository;
  @Autowired
  private AccountService accountService;

  public void save(String username,Address address) {
    LocalDateTime localDateTime = LocalDateTime.now();
    Account account = accountService.findAccount(username);
    address.setAccount(account);
    address.setCreatedAt(localDateTime);
    address.setUpdatedAt(localDateTime);
    account.setAddress(address);
    accountService.saveAccount(account);
  }
  public void update(String username, Address addressUpdate) {
    Account account = accountService.findAccount(username);
    Address address = account.getAddress();
    address.setUf(addressUpdate.getUf());
    address.setCity(addressUpdate.getCity());
    address.setStreet(address.getStreet());
    address.setNumber(address.getNumber());
    address.setUpdatedAt(LocalDateTime.now());
    accountService.saveAccount(account);
  }
  public Address findAddress(String username) {
    return accountService.findAccount(username).getAddress();
  }
}
