/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ConexionBD.ConexionSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Administrador
 */
public class UsuarioDAO {
    public boolean AccesoSistema(String usuario, String password){
    boolean resultado= false;
        try {
            Connection con= ConexionSQL.getSQLConexion();
            PreparedStatement pr = con.prepareStatement("exec USP_ACCEDER_SISTEMA ?, ?"); // loss signos de preguntan sirven como parametro
            pr.setString(1, usuario); // sirve para reemplazar en el primer parametro
            pr.setString(2, password); // sirve para reemplazar en el segundo parametro
            ResultSet result = pr.executeQuery(); // sirve para almacenar los resultados
            if (result.next()) { // next sirve para ver si tiene valores o al menos una fila
                int respuestaBD= result.getInt("EXISTE");
                resultado = (respuestaBD==1); 
               // resultado = (1 == 1);
                //resultado = (1 == 0);
                //resultado = ("" == "");
            }
            ConexionSQL.cerrarSQLConexion();
        } catch (Exception e) {
            resultado=false;
        } finally{
        ConexionSQL.cerrarSQLConexion();
        }
    return resultado;
    }
}
