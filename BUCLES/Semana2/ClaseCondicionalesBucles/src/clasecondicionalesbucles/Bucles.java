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
public class Bucles {
    
    public static void main(String[] args) {
        //"Hola" + "Mundo" = "Hola Mundo"
        //"Hola" + 1 = "Hola 1"
                
        int i = 0;
        //bucle 1
        while(i<=10) {
            System.out.println("while = El numero I = " + i);
            i = i + 1;
        }
        //bucle 2
        for (int j = 0; j <= 10; j++) {
            System.out.println("For = El numero J = " + j);
        }
        
        //bucle 3
        int x = 0;
        do{
            System.out.println("DoWhile = El numero X = " + x);
            x++;
        }while(x <= 10);
        
        
        
        //Tabla matematica del 9
        for (int j = 0; j <= 12; j++) { // 0
            if (j == 5) break;
            //"9 x " + j ==> 9 x 0
            //"9 x " + j + " = " ==> 9 x 0 =
            //"9 x " + j + " = " + (9 * j) ==> 9 x 0 = 0
            int multiplo = (9 * j);
            System.out.println("9 x " + j + " = " + multiplo);
        }
        
        
        
        
        
    }
    
}
