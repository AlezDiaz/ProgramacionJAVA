
package DAO;

import ConexionBD.ConexionSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuarioDAO {
    
    
    public boolean AccesoSistema(String usuario, String password){
        boolean resultado = false;
        try {
            Connection con = ConexionSQL.getSQLConexion();
            PreparedStatement pr = con.prepareStatement("exec USP_ACCEDER_SISTEMA ?, ?");
            pr.setString(1, usuario);
            pr.setString(2, password);
            ResultSet result = pr.executeQuery();
            if (result.next()) {
                int respuestaBD =result.getInt("EXISTE");
                resultado = (respuestaBD == 1);
            }
        } catch (Exception e) {
             resultado = false;
        } finally {
            ConexionSQL.cerrarSQLConexion();
        }
        return resultado;
    }
    
}
