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
public class Arreglos {
    
    
    public static void main(String[] args) {
        //Definir arreglos en 2 Lineas
        String[] apellidos;
        apellidos = new String[5];
        
        //Definir arreglos en 1 linea
        String[] nombres = new String[5];
        
        //Asignar valores a los arreglos
        apellidos[0] = "Cordova"; //Agregando 1 valor al indice 0
        apellidos[1] = "Ramirez";
        apellidos[2] = "Leon";
        apellidos[3] = "Perez";
        apellidos[4] = "Sanchez";
        //apellidos[5] = "Lopez";
        
        //Definir arreglos con valores por defecto
        String[] departamentos = {"Lima", "Piura", "Tacna", "Puno", "Cuzco", "Loreto"};
        
        System.out.println("Tamaño del arreglo departamentos: " + departamentos.length);
        System.out.println("Tamaño del arreglo apellidos: " + apellidos.length);
        System.out.println("Tamaño del arreglo nombres: " + nombres.length);
        

        departamentos[0] = "Arequipa"; // Modificando de Lima a Arequipa
        
        //Obtener el valor del indice 1
        
        System.out.println("Valor Departamentos indice 1 = " + departamentos[1]);
        
        //Recorrer arreglos valor por valor
        for (int i = 0; i < departamentos.length; i++) {
            System.out.println("El valor en la posicion " + i + " => " + departamentos[i]);
        }
        
        double[] notas = { 11.5, 15, 12, 17, 13};
        
        double notaMayor = 0;
        
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > notaMayor)
                notaMayor = notas[i];
        }
        
        System.out.println("La nota mayor = " + notaMayor);
        
        
    }
    
}
