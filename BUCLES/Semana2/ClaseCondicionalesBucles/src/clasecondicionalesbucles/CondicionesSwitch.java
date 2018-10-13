/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasecondicionalesbucles;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class CondicionesSwitch {
    
    
    public static void main(String[] args) {
        //1 ...7 = LUNES 
        System.out.print("Ingrese un numero:");
        Scanner in = new Scanner(System.in); 
        //int i = in.nextInt();
        int numero = in.nextInt();
        //forma 1
        System.out.print("Forma 1:");
        if (numero == 1) {
            System.out.println("LUNES");
        } else if (numero == 2) {
            System.out.println("MARTES");
        } else if (numero == 3){
            System.out.println("MIERCOLES");
        } else if (numero == 4) {
            System.out.println("JUEVES");
        } else if (numero == 5) {
            System.out.println("VIERNES");
        } else if (numero == 6 || numero == 7) {
            System.out.println("ES UN FDS");
        } else {
            System.out.println("NO ES UN VALOR VALIDO!");
        }
        
        /*
        == igualdad
        != diferencia
        > mayor
        < menor
        >= mayor igual
        <= menor igual
        && anidar condiciones => Y
        || anidar condiciones => O
        */
        
        //forma 2
        switch(numero) {
            case 1: 
                System.out.print("SW: LUNES");
                break;
            case 2:
                System.out.print("SW: MARTES");
                break;
            case 3:
                System.out.print("SW: MIERCOLES");
                break;
            case 4:
                System.out.print("SW: JUEVES");
                break;
            case 5:
                System.out.print("SW: VIERNES");
                break;
            case 6:
            case 7:
                System.out.print("SW: ES FDS");
                break;
            default: 
                System.out.print("SW: NO ES UN VALOR CORRECTO!");
        }
        
    }
   
}
