/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

/**
 *
 * @author CordovaLeon
 */
public class VehiculoEscolar extends Vehiculo {

     private String[] colegios;
     
    @Override
    public void MostrarMensaje() {
        super.MostrarMensaje(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Servicio a los colegios");
        for (int i = 0; i < colegios.length; i++) {
            System.out.println("Colegio llamado: " + colegios[i]);
        }
    }
     
     
     
     
     
    /**
     * @return the colegios
     */
    public String[] getColegios() {
        return colegios;
    }

    /**
     * @param colegios the colegios to set
     */
    public void setColegios(String[] colegios) {
        this.colegios = colegios;
    }
    
   
}
