package apibanco.controller;

import apibanco.model.Conta;
import apibanco.model.Cliente;
import apibanco.model.Endereco;
import apibanco.service.ClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//import java.util.Optional;

@RestController
@RequestMapping(path="/cliente")
public class ClienteController {

  @Autowired
  private ClienteService clienteService;

  @PostMapping(path="/save")
  public ResponseEntity<Cliente> salvar(@RequestBody Cliente cliente) {
    return ResponseEntity.status(201).body(clienteService.save(cliente));
  }

  @GetMapping(path="/list")
  public ResponseEntity<List<Cliente>> list() {
    return ResponseEntity.status(200).body(clienteService.list());
  }
}
