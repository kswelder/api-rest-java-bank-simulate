package banco;

import java.time.LocalDateTime;
import java.sql.*;

/*
 *
 */

class Database {
  private String databaseEnv = "jdbc:sqlite:"+System.getenv("DATABASE");
  private Connection conexao() {
    Connection conn = null;

    try {
      conn = DriverManager.getConnection(databaseEnv);
      System.out.println("Conexao realizada com sucesso!");
      }

    catch (SQLException e) {
      System.out.println(e.getMessage());
    }

    return conn;
  }

  public void teste() {
    // SQL statement for creating a new table
    String sql = "CREATE TABLE IF NOT EXISTS employees (\n"
      + " id integer PRIMARY KEY,\n"
      + " nome text NOT NULL,\n"
      + " saldo real\n"
      + ");";

    try{
      Connection conn = this.conexao();
      Statement stmt = conn.createStatement();
      stmt.execute(sql);
    }
    catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }
}
