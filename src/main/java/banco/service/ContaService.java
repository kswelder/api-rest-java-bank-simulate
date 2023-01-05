package banco.service;

/**/
import banco.model.ContaModel;
import banco.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ContaService {
  @Autowired
  private ContaRepository contaRepository;
  public ContaModel criar(ContaModel conta){
    String data = new Date().toString();
    conta.setCriacao(data);
    conta.setAtualizacao(data);
    return contaRepository.save(conta);
  }
/*
  public List<ContaModel> listar() {
    return contaRepository
      .findAll()
      .stream()
      .collect(Collectors.toList());
  }*/
  /*
  public Pessoa findNome(String nome){
    Optional<ContaModel> fetchNome = contaRepository.findByNome(nome);
    return fetchNome.orElseThrow(() -> new RuntimeException("Pessoa não encontrada e/ou não cadastrada"));
  }*/
}
