
package DAO;
import Modelo.ProductoEntidad;
import ConexionBD.ConexionSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductoDAO {
    
    
    public void EditarProducto(ProductoEntidad producto){
        try {
            Connection con = ConexionSQL.getSQLConexion();
            String procedure = "exec USP_EDITAR_PRODUCTO ?, ?, ?, ?";
            PreparedStatement statement = con.prepareStatement(procedure);
            statement.setInt(1, producto.getCodigoProducto());
            statement.setString(2, producto.getNombreProducto());
            statement.setInt(3, producto.getStockProducto());
            statement.setDouble(4, producto.getPrecioProducto());
            statement.execute();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public ProductoEntidad BuscarPorId(int id){
        ProductoEntidad resultado = new ProductoEntidad();
        //Cargue la lista con la BD
        try {
            Connection con = ConexionSQL.getSQLConexion();
            String procedure = "exec USP_BUSCAR_PRODUCTO_POR_CODIGO ?";
            PreparedStatement statement = con.prepareStatement(procedure);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            
            if(resultSet.next()) {
                resultado.setCodigoProducto(resultSet.getInt("COD_PRODUCTO"));
                resultado.setNombreProducto(resultSet.getString("NOM_PRODUCTO"));
                resultado.setStockProducto(resultSet.getInt("STOCK_PRODUCTO"));
                resultado.setPrecioProducto(resultSet.getDouble("PRE_PRODUCTO"));
            }
        } catch(SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return resultado;
    }
    
    public void AgregarProducto(ProductoEntidad producto){
        try {
            Connection con = ConexionSQL.getSQLConexion();
            String procedure = "exec USP_AGREGAR_PRODUCTO ?, ?, ?";
            PreparedStatement statement = con.prepareStatement(procedure);
            statement.setString(1, producto.getNombreProducto());
            statement.setInt(2, producto.getStockProducto());
            statement.setDouble(3, producto.getPrecioProducto());
            statement.execute();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public ArrayList<ProductoEntidad> BuscarProductos(int CodigoProd, String NombreProd) {
        ArrayList<ProductoEntidad> listaRetorno = new ArrayList<>();
        //Cargue la lista con la BD
        try {
            Connection con = ConexionSQL.getSQLConexion();
            String procedure = "exec USP_BUSCAR_PRODUCTO ?, ?";
            PreparedStatement statement = con.prepareStatement(procedure);
            statement.setString(1, String.valueOf(CodigoProd));
            statement.setString(2, NombreProd);
            ResultSet resultSet = statement.executeQuery();
            
            while(resultSet.next()) {
                ProductoEntidad fila = new ProductoEntidad();
                fila.setCodigoProducto(resultSet.getInt("COD_PRODUCTO"));
                fila.setNombreProducto(resultSet.getString("NOM_PRODUCTO"));
                fila.setStockProducto(resultSet.getInt("STOCK_PRODUCTO"));
                fila.setPrecioProducto(resultSet.getDouble("PRE_PRODUCTO"));
                listaRetorno.add(fila);
            }
        } catch(SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return listaRetorno;
    }
    
}
