package apibanco.controller;

import apibanco.dto.ClientDTO;
import apibanco.model.Client;
import apibanco.service.ClientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/client")
public class ClientController {

  @Autowired
  private ClientService clientService;

  @GetMapping(path="/find/{nome}")
  public ResponseEntity<ClientDTO> findOne(@PathVariable("nome") String nome) {
    return ResponseEntity.status(HttpStatus.OK).body(clientService.findNome(nome));
  }

  @PostMapping(path="/save")
  public ResponseEntity<ClientDTO> savarRecord(@RequestBody Client client) {
    ClientDTO dto = clientService.saveRecord(client);

    return ResponseEntity.status(HttpStatus.CREATED).body(dto);
  }
  @PutMapping(path="/update/{nome}")
  public ResponseEntity<ClientDTO> updateOne(@PathVariable("nome") String nome, @RequestBody Client client) {
    ClientDTO dto = clientService.updateRecord(nome, client);
    return ResponseEntity.status(HttpStatus.NO_CONTENT).body(dto);
  }

  @GetMapping(path="/list")
  public ResponseEntity<List<ClientDTO>> list() {
    return ResponseEntity.status(HttpStatus.ACCEPTED).body(clientService.list());
  }
}
