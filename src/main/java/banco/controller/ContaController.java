package banco.controller;

/**/
import banco.model.ContaModel;
import banco.service.ContaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(path = "/api")
public class ContaController {
  @Autowired
    private ContaService contaService;
                                                      @PostMapping(path = "/save")
    public ResponseEntity<ContaModel> salvar(@RequestBody ContaModel conta){
      return ResponseEntity.status(HttpStatus.CREATED).body(contaService.criar(conta));
    }
/*
    @GetMapping(path = "/list")
    public ResponseEntity<List<ContaModel>> list(){
      return ResponseEntity.status(HttpStatus.OK).body(contaService.listar());
    }*/
}
