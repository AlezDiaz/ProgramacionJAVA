/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package Estructurada;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author CordovaLeon
 */
public class EjemploProgramacionEstructurada {
    
    public static void main(String[] args) {
        
        
        
        System.out.println("Año actual: " + Calendar.getInstance().get(Calendar.YEAR));  
        
        //Para un MAZDA CX3 año 2018
        String marcaVehiculo1 = "Mazda";
        String modeloVehiculo1 = "CX3";
        int anioFabricacion = 2018;
        int anioActual =  Calendar.getInstance().get(Calendar.YEAR);
        int antiguedad = anioActual - anioFabricacion;
        
        
        System.out.println("Marca Vehiculo: " + marcaVehiculo1);
        System.out.println("Modelo Vehiculo: " + modeloVehiculo1);
        System.out.println("Año fabricacion: " + anioFabricacion);
        System.out.println("Antiguedad: " + antiguedad);
        
        if (antiguedad > 3) {
            System.out.println("OBS: Este vehiculo debe pagar SAT.");
        }
        
        
        //Para un Toyota Yaris 2014
        String marcaVehiculo2 = "Toyota";
        String modeloVehiculo2 = "Yaris";
        int anioFabricacion2 = 2014;
        int anioActual2 =  Calendar.getInstance().get(Calendar.YEAR);
        int antiguedad2 = anioActual2 - anioFabricacion2;
        
        
        System.out.println("Marca Vehiculo: " + marcaVehiculo2);
        System.out.println("Modelo Vehiculo: " + modeloVehiculo2);
        System.out.println("Año fabricacion: " + anioFabricacion2);
        System.out.println("Antiguedad: " + antiguedad2);
        
        if (antiguedad2 > 3) {
            System.out.println("OBS: Este vehiculo debe pagar SAT.");
        }
        
    }
    
}
