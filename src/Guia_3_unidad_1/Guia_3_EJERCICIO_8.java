/*
 *Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
  *Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá 
   *dibujar lo siguiente:
 */
package Guia_3_unidad_1;

import java.util.Scanner;
/**
 *
 * @author Daniel Coria
 */
public class Guia_3_EJERCICIO_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner leer = new Scanner(System.in);
        // TODO code application logic here
        int i,j,lado;
        System.out.println("Ingrese un lado de un cuadrado:");
        lado=leer.nextInt();
        
        for(i=0;i<lado;i++){
            for(j=0;j<lado;j++){
             if(i==0 || j==0 || i==lado-1 || j==lado-1) {
              System.out.print("*");
             }
             else{
             System.out.print(" ");
             }
            }
            System.out.println(" ");
        }
        
    }
    
}

