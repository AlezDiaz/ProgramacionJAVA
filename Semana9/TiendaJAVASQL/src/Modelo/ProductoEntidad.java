
package Modelo;

public class ProductoEntidad {

    /**
     * @return the CodigoProducto
     */
    public int getCodigoProducto() {
        return CodigoProducto;
    }

    /**
     * @param CodigoProducto the CodigoProducto to set
     */
    public void setCodigoProducto(int CodigoProducto) {
        this.CodigoProducto = CodigoProducto;
    }

    /**
     * @return the NombreProducto
     */
    public String getNombreProducto() {
        return NombreProducto;
    }

    /**
     * @param NombreProducto the NombreProducto to set
     */
    public void setNombreProducto(String NombreProducto) {
        this.NombreProducto = NombreProducto;
    }

    /**
     * @return the StockProducto
     */
    public int getStockProducto() {
        return StockProducto;
    }

    /**
     * @param StockProducto the StockProducto to set
     */
    public void setStockProducto(int StockProducto) {
        this.StockProducto = StockProducto;
    }

    /**
     * @return the PrecioProducto
     */
    public double getPrecioProducto() {
        return PrecioProducto;
    }

    /**
     * @param PrecioProducto the PrecioProducto to set
     */
    public void setPrecioProducto(double PrecioProducto) {
        this.PrecioProducto = PrecioProducto;
    }
    
    
    private int CodigoProducto;
    private String NombreProducto;
    private int StockProducto;
    private double PrecioProducto;
    
}
