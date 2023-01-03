package "banco.service"

/**/
import banco.model.ClienteModel;
import banco.model.EnderecoModel;
import banco.model.ContaModel;
import org.springframework.beans.factory.annotation.Autowired;                                      import org.springframework.stereotype.Service;
                                                  import java.util.*;                               import java.util.stream.Collectors;                                                                 @Service
class ClienteService {
  @Autiwired
  private ContaModel conta;
  public static criar(ContaModel novaConta) {
    novaConta.setNome();
  }
}
