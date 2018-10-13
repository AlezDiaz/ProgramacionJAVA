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
public class Programa {
    
    public static void main(String[] args) {
        System.out.println("MENSAJE OBJETO 1 ********************");
        Vehiculo vehiculoMazda = new Vehiculo();
        vehiculoMazda.setMarca("Mazda");
        vehiculoMazda.setModelo("CX5");
        vehiculoMazda.setAnioFabricacion(2018);
        vehiculoMazda.MostrarMensaje();
        
        
        System.out.println("MENSAJE OBJETO 2 ********************");
        Vehiculo vehiculoToyota = new Vehiculo();
        vehiculoToyota.setMarca("Toyota");
        vehiculoToyota.setModelo("Corolla");
        vehiculoToyota.setAnioFabricacion(2014);
        vehiculoToyota.MostrarMensaje();
        
        System.out.println("MENSAJE OBJETO 3 ********************");
        VehiculoEscolar vehiculoEscolar = new VehiculoEscolar();
        vehiculoEscolar.setMarca("Hyundai");
        vehiculoEscolar.setModelo("H1");
        vehiculoEscolar.setAnioFabricacion(2010);
        vehiculoEscolar.setColegios(new String[]{ "Colegio 1", "Colegio 2", "Colegio 3", "Colegio 4", "Colegio 5" });
        vehiculoEscolar.MostrarMensaje();
        
    }
}
