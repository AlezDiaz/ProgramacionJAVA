/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import Modelo.ProductoEntidad;
import ConexionBD.ConexionSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Administrador
 */
public class ProductoDAO {
 public ArrayList<ProductoEntidad> BuscarProductos(int Codigoprod, String NombreProd){
 ArrayList<ProductoEntidad> listaRetorno= new ArrayList<>();
 //CARGUE LA LISTA CON LA BD
 try{
 Connection con=ConexionSQL.getSQLConexion();
 String procedure = " exec USP_BUSCAR_PRODUCTO ?,?";
     PreparedStatement statement = con.prepareStatement(procedure);
     statement.setString(1,String.valueOf(Codigoprod));
     statement.setString(2, NombreProd);
     ResultSet resulSet= statement.executeQuery();
     while(resulSet.next()){ // Solo se usa cuando tu procedimiento te retorna un registro o dos 
      ProductoEntidad fila = new ProductoEntidad();
      fila.setCodigoProducto(resulSet.getInt("COD_PRODUCTO"));
      fila.setNombreProducto(resulSet.getString("NOM_PRODUCTO"));
      fila.setStockProducto(resulSet.getInt("STOCK_PRODUCTO"));
      fila.setPrecioProducto(resulSet.getDouble("PRE_PRODUCTO"));
      listaRetorno.add(fila);
     
     }
 } catch(SQLException ex){
     System.out.println(ex.getMessage());
 }    
 return listaRetorno;
 }   
}
