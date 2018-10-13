/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

import java.util.Calendar;

/**
 *
 * @author CordovaLeon
 */
public class Vehiculo {

    
    
    //PROPIEDADES PRIVADAS
    private int anioActual = Calendar.getInstance().get(Calendar.YEAR);
    private String marca;
    private String modelo;
    private int anioFabricacion;
    
    private int anioAntiguedad(){
        return anioActual - getAnioFabricacion();
    }

    
    //PROPIEDADES Y FUNCIONES PUBLICAS
    
    public void MostrarMensaje(){
        System.out.println("Marca Vehiculo: " + getMarca());
        System.out.println("Modelo Vehiculo: " + getModelo());
        System.out.println("Año fabricacion: " + getAnioFabricacion());
        System.out.println("Antiguedad: " + anioAntiguedad());
        
        if (anioAntiguedad() > 3) {
            System.out.println("OBS: Este vehiculo debe pagar SAT.");
        }
    }
            
    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the anioFabricacion
     */
    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    /**
     * @param anioFabricacion the anioFabricacion to set
     */
    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

 
}
