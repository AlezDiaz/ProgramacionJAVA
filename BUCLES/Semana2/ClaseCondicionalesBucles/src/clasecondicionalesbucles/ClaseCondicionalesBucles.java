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
public class ClaseCondicionalesBucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String cadena; //SI
        int numerosEnteros; //SI
        double numeroReales; //SI
        float numeroGrande; 
        long numero;
        boolean EsVerdaderoOFalso; //SI
        
        /*
        Sintaxis
        */
        boolean condicion = true;
        
        if (condicion == true) { // (condicion)
            //Se ejecuta cuando la condicion = TRUE
            System.out.println("Esta linea se ejecuta por que Condicion es TRUE");
        } else {
            //Se ejecuta cuando la condicion = FALSE
            System.out.println("Esta linea se ejecuta por que Condicion es FALSE");
        }
        
        
        String materia = "Matematicas";
        double nota1 = 11;
        double nota2 = 10;
        
        double promedio = 0;
        // ((10 + 5) / 2)
        promedio = ((nota1 + nota2) / 2);
        
        //VERSION 1:
        if (materia == "Matematicas") {
            //((nota1 + nota2) / 2) >= 10.5
            if (((nota1 + nota2) / 2) >= 10.5) {
                System.out.println("El alumno aprobo el curso de Matematicas");    
            }else {
                System.out.println("El alumno desaprobo!");    
            }
        }
        
        //VERSION 2:
        if (materia == "Matematicas" && promedio >= 10.5)
            System.out.println("El alumno aprobo el curso de Matematicas"); 
        else
            System.out.println("El alumno desaprobo!");    
        
        //VERSION 3:
        
        String resultado = "";
        
        if (materia == "Matematicas" && promedio >= 10.5)
            resultado = "El alumno aprobo el curso de Matematicas";
        else
            resultado = "El alumno desaprobo!";
        
        //variable = (condicion)? "si es TRUE" : "si es FALSE";
        
        resultado = (materia == "Matematicas" && promedio >= 10.5)? ">>El alumno aprobo el curso de Matematicas" :  ">>El alumno desaprobo!";
        
        System.out.println(resultado);

    }
}
