
package ConexionBD;

import java.sql.*;

public class ConexionSQL {
    private static String cadenaConexion = 
            "jdbc:sqlserver://localhost;databaseName=IDATBD;user=sa;password=sa;";
    
    private static Connection con;
    
    public static Connection getSQLConexion(){
        try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    con=DriverManager.getConnection(cadenaConexion);
        System.out.println("Estoy en la BD IDATBD");
        } catch (ClassNotFoundException | SQLException e ) {
            System.out.println("No pude conectarte a la DB");
        
        }
        return con;
    }
    public static void cerrarSQLConexion(){
        try {
            if (!con.isClosed()) {
            con.close();
            }
        } catch (Exception e) {
            System.out.println("No pudo cerrar la conexion a  IDATDB");
        }   
    }
}

