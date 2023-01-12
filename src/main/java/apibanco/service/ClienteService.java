package apibanco.service;

import apibanco.model.Cliente;
import apibanco.model.Conta;
import apibanco.model.Endereco;

import apibanco.service.ContaService;
import apibanco.service.EnderecoService;

import apibanco.repository.ClienteRepository;

import apibanco.dto.ClienteDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ClienteService {

  @Autowired
  private ClienteRepository clienteRepository;

  @Autowired
  private ContaService contaService;

  @Autowired
  private EnderecoService enderecoService;

  public ClienteDTO save(Cliente cliente) {
    Endereco endereco = new Endereco();
    Conta conta = new Conta();
    enderecoService.save(endereco);
    contaService.save(conta);
    cliente.setEndereco(endereco);
    List<Conta> lista = new ArrayList<Conta>();
    lista.add(conta);
    cliente.setConta(lista);
    ClienteDTO dto = new ClienteDTO(cliente);
    clienteRepository.save(cliente);
    return dto;
  }
  public List<Cliente> list() {
    return clienteRepository.findAll();
  }
}
