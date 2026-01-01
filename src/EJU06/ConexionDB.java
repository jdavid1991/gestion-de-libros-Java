package EJU06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {

    private static final String URL = "jdbc:mysql://192.168.1.8:3306/registro_libros";
    private static final String USER = "root";  // Usuario de MySQL
    private static final String PASSWORD = "12345678";  // Contraseña de MySQL

    // Método para obtener la conexión
    public static Connection obtenerConexion() {
        try {
            // Conectar a la base de datos
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            return conn;
        } catch (SQLException e) {
            System.err.println("Error de conexión a la base de datos: " + e.getMessage());
            return null;
        }
    }

  Object getConnection() {
    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
  }
}
