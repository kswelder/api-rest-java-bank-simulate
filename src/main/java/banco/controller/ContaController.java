package banco.controller.contacontroller;

/**/
import org.springframework.beans.factory.annotatio
n.Autowired;                                      import org.springframework.http.HttpStatus;       import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;                                                   import java.net.InetAddress;                      import java.net.UnknownHostException;             import java.util.Date;                            import java.util.List;
import java.util.UUID;

@RestController
class ContaController {
  /*
  @Autowired                                        ClienteService clienteService;                                                                      @Autowired                                        EnderecoRequest request;
  */

  @GetMapping("/")
  public String index() {
    return "StringBoot funcionando";
  }
}
