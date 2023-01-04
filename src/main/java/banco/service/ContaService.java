package "banco.service"

/**/
import banco.model.ContaModel;
import banco.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;                                      import org.springframework.stereotype.Service;
                                                  import java.util.*;                               import java.util.stream.Collectors;                                                                 @Service
public class ClienteService {
  @Autiwired
  private ContaRepository contaRepository;
  public static String criar(ContaModel novaConta) {
    return "";
  }
}
