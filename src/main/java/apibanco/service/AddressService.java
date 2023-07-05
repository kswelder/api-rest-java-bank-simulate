package apibanco.service;

import apibanco.model.Account;
import apibanco.model.Address;
import apibanco.repository.AddressRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

  @Autowired
  private AddressRepository addressRepository;
  @Autowired
  private AccountService accountService;

  public void save(String username,Address endereco) {
    Account account = accountService.getAccount(username);
    endereco.setAccount(account);
    addressRepository.save(endereco);
  }
  public void update(String username, Address addressUpdate) {
    Account account = accountService.getAccount(username);
    Address address = account.getAddress();
    address.setUf(addressUpdate.getUf());
    address.setCity(addressUpdate.getCity());
    address.setStreet(address.getStreet());
    address.setNumber(address.getNumber());
    addressRepository.save(address);
  }
}
