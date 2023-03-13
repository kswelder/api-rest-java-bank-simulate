package apibanco.controller;

import apibanco.dto.ClienteDTO;
import apibanco.model.Cliente;
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
  public ResponseEntity<ClienteDTO> findOne(@PathVariable("nome") String nome) {
    return ResponseEntity.status(HttpStatus.OK).body(clienteService.findNome(nome));
  }

  @PostMapping(path="/save")
  public ResponseEntity<ClienteDTO> savarRecord(@RequestBody Cliente cliente) {
    ClienteDTO dto = clienteService.saveRecord(cliente);

    return ResponseEntity.status(HttpStatus.CREATED).body(dto);
  }
  @PutMapping(path="/update/{nome}")
  public ResponseEntity<ClienteDTO> updateOne(@PathVariable("nome") String nome, @RequestBody Cliente cliente) {
    ClienteDTO dto = clienteService.updateRecord(nome, cliente);
    return ResponseEntity.status(HttpStatus.NO_CONTENT).body(dto);
  }

  @GetMapping(path="/list")
  public ResponseEntity<List<ClienteDTO>> list() {
    return ResponseEntity.status(HttpStatus.ACCEPTED).body(clienteService.list());
  }
}
