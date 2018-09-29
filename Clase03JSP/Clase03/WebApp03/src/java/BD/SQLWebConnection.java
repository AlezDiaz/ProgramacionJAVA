/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Administrador
 */
public  class SQLWebConnection {
    
    private static String cadenaConnexion =
            "jdbc:sqlserver://localhost;databaseName=bdweb;user=sa;password=alumno;";
    private static Connection con;
    
    public static Connection getSQLConexion() {        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(cadenaConnexion);
            System.out.println("Estoy en la BD bdWeb");
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
            System.out.println("No pudo cerrar la Conexion a bdWeb");
        }
    }
    
    public static void main(String[] args) {
        getSQLConexion();
    }
    
}
