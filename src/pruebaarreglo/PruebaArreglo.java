/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaarreglo;

/**
 *
 * @author Isaias
 */
public class PruebaArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     int enteros[]={10,50,2,5,6};
     int mayor[][]={{10,14,12,11,9,3},{2,4,6,80,40}};
     String palabra = "Espejo retrovisor";
        System.out.println("--------------------------");
     Arreglo.sumarLista(enteros);
        System.out.println("--------------------------");
     Arreglo.buscarMayor(mayor);
        System.out.println("--------------------------");
     Arreglo.cuentaVocales(palabra);
        System.out.println("--------------------------"); 
     Arreglo.cuentaCaracter("Prueba de ejercicio", 'e');
    }
    
    
    
    
}
