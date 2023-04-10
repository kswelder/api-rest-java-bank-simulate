package apibanco.service;

import apibanco.model.Address;
import apibanco.repository.EnderecoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

  @Autowired
  private EnderecoRepository enderecoRepository;

  public Address save(Address endereco) {
    return enderecoRepository.save(endereco);
  }
}
