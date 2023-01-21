package apibanco.controller;

import apibanco.model.Conta;
import apibanco.model.Cliente;
import apibanco.model.Endereco;
import apibanco.service.ClienteService;

import apibanco.dto.ClienteDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="/cliente")
public class ClienteController {

  @Autowired
  private ClienteService clienteService;

  @GetMapping(path="/find/{nome}")
  public ResponseEntity<Cliente> findOne(@PathVariable("nome") String nome) {
    return ResponseEntity.status(HttpStatus.OK).body(clienteService.findNome(nome));
  }
  @PostMapping(path="/save")
  public ResponseEntity<ClienteDTO> salvar(@RequestBody Cliente cliente) {
    ClienteDTO dto = clienteService.save(cliente);
    
    return ResponseEntity.status(HttpStatus.CREATED).body(dto);
  }
  @PutMapping(path="/update/{nome}")
  public ResponseEntity<ClienteDTO> updateOne(@PathVariable("nome") String nome, @RequestBody Cliente cliente) {
    ClienteDTO dto = clienteService.update(nome, cliente);
    return ResponseEntity.status(HttpStatus.OK).body(dto);
  }

  @GetMapping(path="/list")
  public ResponseEntity<List<Cliente>> list() {
    return ResponseEntity.status(200).body(clienteService.list());
  }
}
