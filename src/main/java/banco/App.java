package banco;

/**
 * Hello world!
 *
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Notation Spring para inicializar aplicacao
@SpringBootApplication
public class App 
{
  public static void main( String[] args )
  {
    SpringApplication.run(App.class, args);
    System.out.println( "Aplicacao rodando");
  }
}
