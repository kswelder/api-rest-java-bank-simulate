package banco;

/**
 * Hello world!
 *
 */
public class App 
{
  public static void main( String[] args )
  {
    Database dt = new Database();
    try {
      dt.teste();
    }
    catch(Exception ex) {
      System.out.println("Erro sqlite");
    }
    System.out.println( "Hello World!");
  }
}
