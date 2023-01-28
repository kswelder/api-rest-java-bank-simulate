package apibanco.controller;

import apibanco.model.Cliente;
import apibanco.records.ClienteRecord;
import apibanco.service.ClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/cliente")
public class ClienteController {

  @Autowired
  private ClienteService clienteService;

  @GetMapping(path="/find/{nome}")
  public ResponseEntity<ClienteRecord> findOne(@PathVariable("nome") String nome) {
    return ResponseEntity.status(HttpStatus.OK).body(clienteService.findNome(nome));
  }

  @PostMapping(path="/save")
  public ResponseEntity<ClienteRecord> savarRecord(@RequestBody Cliente cliente) {
    ClienteRecord cr = clienteService.saveRecord(cliente);

    return ResponseEntity.status(HttpStatus.CREATED).body(cr);
  }
  @PutMapping(path="/update/{nome}")
  public ResponseEntity<ClienteRecord> updateOne(@PathVariable("nome") String nome, @RequestBody Cliente cliente) {
    ClienteRecord cr = clienteService.updateRecord(nome, cliente);
    return ResponseEntity.status(HttpStatus.OK).body(cr);
  }

  @GetMapping(path="/list")
  public ResponseEntity<List<ClienteRecord>> list() {
    return ResponseEntity.status(200).body(clienteService.list());
  }
}
