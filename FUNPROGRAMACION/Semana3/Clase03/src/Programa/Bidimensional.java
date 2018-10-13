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
public class Bidimensional {

    public static void main(String[] args) {
        int[][] bidimensional = new int[3][3];
        
        bidimensional[0][0] = 20;
        bidimensional[0][1] = 11;
        bidimensional[0][2] = 13;
        
        bidimensional[1][0] = 5;
        bidimensional[1][1] = 10;
        bidimensional[1][2] = 18;
        
        bidimensional[2][0] = 30;
        bidimensional[2][1] = 55;
        bidimensional[2][2] = 29;
        
        System.out.println("Longitud de Bidimensional: " + bidimensional.length);
        
        for (int i = 0; i < bidimensional.length; i++) {
            //System.out.println("Valores " + bidimensional[i]); 
            for (int j = 0; j < bidimensional[i].length; j++) {
                System.out.println("Valores(" + i + ", " + j + "): " + bidimensional[i][j]);
            }
            
        }       

    }
}
