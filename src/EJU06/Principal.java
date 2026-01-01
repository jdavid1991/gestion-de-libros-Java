package EJU06;

import java.sql.Connection;

public class Principal {

  public static void main(String[] args) {
    // TODO code application logic here
    Connection conn = (Connection) ConexionDB.obtenerConexion();

    if (conn != null) {
      // Si la conexión fue exitosa, mostramos un mensaje de éxito
      System.out.println("Conexión exitosa a la base de datos.");
    } else {
      // Si la conexión falló, mostramos un mensaje de error
      System.out.println("No se pudo conectar a la base de datos.");
    }

  }

}
