package banco;

/**
 * Hello world!
 *
 */
public class App 
{
  public static void main( String[] args )
  {
    Client novo = new Client("welder","09/07/170aa0");
    System.out.println( "Hello World!\n"+novo.informacoes() );
  }
}
