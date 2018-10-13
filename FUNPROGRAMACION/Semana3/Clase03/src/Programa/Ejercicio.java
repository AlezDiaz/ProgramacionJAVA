/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa;

/**
 *
 * @author Administrador
 */
public class Ejercicio {
    
    
    public static void main(String[] args) {
        String[] nombres = {"A", "B", "C", "D", "E", "F"};
        double[] notas = {10,11,15,9,15,20};

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] <= 10)
                System.out.println("El alumno: " + nombres[i] + " tiene (" + notas[i] + ") Necesita apoyo");
            else if (notas[i]>= 11 && notas[i]<= 15)
                System.out.println("El alumno: " + nombres[i] + " tiene (" + notas[i] + ") Mejorando");
            else
                System.out.println("El alumno: " + nombres[i] + " tiene (" + notas[i] + ") Muy Bien");
        }
    }

}
