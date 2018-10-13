
package ConexionBD;

import java.sql.*;

public class ConexionSQL {
    
    private static String cadenaConnexion =
            "jdbc:sqlserver://localhost;databaseName=IDATBD;user=sa;password=sa;";
    private static Connection con;
    
    public static Connection getSQLConexion() {        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(cadenaConnexion);
            System.out.println("Estoy en la BD IDATBD");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("No pude conectarme a la BD");
        }
        return con;
    }
    
    public static void cerrarSQLConexion() {
        try {
            if (!con.isClosed()) {
                con.close();
            }
        } catch (SQLException e) {
            System.out.println("No pudo cerrar la Conexion a IDATBD");
        }
    }
}
