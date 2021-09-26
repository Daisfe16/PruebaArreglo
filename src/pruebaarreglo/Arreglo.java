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
public class Arreglo {
   
    
    public static void sumarLista(int[]a){
       int suma=0;
       double promedio=0;
        for(int i=0;i<a.length;i++){
          suma+=a[i];
        }
        promedio=suma/a.length;
        System.out.println("La suma total de los numeros es: "+suma + " El promedio es: "+ promedio);
       
    
    }
  
    
    public static void buscarMayor(int[][] b){
         System.out.println("valores de la matriz:");
        for (int c = 0; c < b.length; c++) { 
            for (int l = 0; l < b[c].length; l++) {
                System.out.print(b[c][l] + " ");
            }
            System.out.println();
        }
        int mayor=0;      
         for (int i = 0; i < b.length; i++) {  
            for (int j = 0; j < b[i].length; j++) { 
              if( b[i][j] > mayor){ 
               mayor = b[i][j];                  
                
              }  
            }             
        }
          System.out.println("El mayor numero de la matriz es: "+ mayor);
    }
    public static void cuentaVocales(String p){
         String n=p.toLowerCase();                
        int vocales=0;        
        for(int x=0;x<n.length();x++) {
           if ((n.charAt(x)=='a')||(n.charAt(x)=='e')||(n.charAt(x)=='i')||(n.charAt(x)=='o')||(n.charAt(x)=='u')){ 
           vocales++;
           }
        }
        
        System.out.println("La cantidad de vocales que contiene la/s palabra/s : |"+p + "| son: "+vocales);
    }
    public static void cuentaCaracter(String palabra,char b){
         String l=palabra.toLowerCase();                
        int sumaCaracter=0;        
        for(int x=0;x<l.length();x++) {
           if(l.charAt(x)==b){ 
           sumaCaracter++;
           }
        }        
        System.out.println("La cantidad de veces que se repite  la letra: |" + b +"|  en "+ palabra+" son:"+sumaCaracter);
    }
   
}
    
    

