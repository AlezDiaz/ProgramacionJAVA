/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasecondicionalesbucles;

/**
 *
 * @author Administrador
 */
public class RespuestaProblema {
    public static void main(String[] args) {
        
        //Declarando y inicializando
        double MontoCompra = 0;
        double Descuento = 0;
        double Total = 0;
        
        //Asignacion
        MontoCompra = 200;
        Descuento = MontoCompra *0.20;
        Total = MontoCompra - Descuento;
        
        if (MontoCompra > 300) {
            System.out.println("Ustedes debe pagar: " + Total);
        } else {
            System.out.println("Ustedes debe pagar: " + MontoCompra);
        }
        
        
        
    }
}
