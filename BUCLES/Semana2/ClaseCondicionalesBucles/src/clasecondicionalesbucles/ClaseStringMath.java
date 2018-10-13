/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasecondicionalesbucles;

import java.text.DecimalFormat;

/**
 *
 * @author Administrador
 */
public class ClaseStringMath {
    
    public static void main(String[] args) {
        String nombre = "Luis";
        String otroNombre = "Luis";
        
        
        if (nombre == otroNombre) {
            System.out.println("Tienen el mismo nombre");
        }
        
        if (nombre.equals(otroNombre)) {
            System.out.println("Tienen el mismo nombre v2");
        }
        
        if (nombre.compareTo(otroNombre) == 0) {
            System.out.println("Tienen el mismo nombre v3");
        }
        
        nombre = nombre.toUpperCase();
        System.out.println("En mayuscula = " + nombre);
        
        nombre = nombre.toLowerCase();
        System.out.println("En minuscula = " + nombre);
        
        nombre = nombre.concat(" Cordova").concat(" Leon");
        System.out.println("Nombre completos = " + nombre);
        
        
        double numero = 10.415161;
        
        DecimalFormat f = new DecimalFormat("##.000");
        System.out.println(f.format(numero));

        numero = Math.round(numero);
        System.out.println("Numero redondear = " + numero);
        System.out.println("Numero absoluto = " + Math.abs(-15.6));
        
        
        
    }
    
}
