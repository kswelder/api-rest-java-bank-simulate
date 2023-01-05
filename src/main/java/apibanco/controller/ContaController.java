package apibanco.controller;

import apibanco.model.Conta;
import apibanco.service.ContaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//import java.util.Optional;

@RestController
@RequestMapping(path="/api")
public class ContaController {

  @Autowired
  private ContaService contaService;

  @PostMapping(path="/save")
  public ResponseEntity<Conta> salvar(@RequestBody Conta conta) {
    return ResponseEntity.status(201).body(contaService.save(conta));
  }

  @GetMapping(path="/list")
  public ResponseEntity<List<Conta>> list() {
    return ResponseEntity.status(200).body(contaService.list());
  }
}
