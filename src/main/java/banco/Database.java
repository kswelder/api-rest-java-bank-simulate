package banco;

import java.time.LocalDateTime;

/*
 *
 */

class Database {
  //private String databaseEnv = "jdbc:sqlite:data::memory";//+System.getenv("DATABASE");
  //private Connection conexao() {}

  public void teste() {
    // SQL statement for creating a new table
    String sql = "CREATE TABLE IF NOT EXISTS employees (\n"
      + " id integer PRIMARY KEY,\n"
      + " nome text NOT NULL,\n"
      + " saldo real\n"
      + ");";

  }
}
